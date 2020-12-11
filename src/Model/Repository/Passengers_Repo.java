package Model.Repository;


import Model.Entity.Passengers_Entity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Passengers_Repo implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public Passengers_Repo() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "hotel", "amir123");
        preparedStatement = connection.prepareStatement("CREATE table passengers (meli_code number , fullname varchar(40), Number_of_passengers number , duration_of_stay number , phone_number number , First_Payment number , total_Payment number,nationality varchar(40) )");
        connection.setAutoCommit(false);
//        preparedStatement.executeUpdate();
    }
    public void insert (Passengers_Entity passengers_entity) throws Exception { // insert
        preparedStatement = connection.prepareStatement("insert into passengers (meli_code,fullname,Number_of_passengers,duration_of_stay,phone_number,First_Payment,total_Payment,nationality) values (?,?,?,?,?,?,?,?)");
        preparedStatement.setLong(1,passengers_entity.getMeli_code());
        preparedStatement.setString(2, passengers_entity.getFullname());
        preparedStatement.setLong(3,passengers_entity.getNumber_of_passengers());
        preparedStatement.setLong(4,passengers_entity.getDuration_of_stay());
        preparedStatement.setLong(5,passengers_entity.getPhone_number());
        preparedStatement.setLong(6,passengers_entity.getFirst_Payment());
        preparedStatement.setLong(7,passengers_entity.getTotal_payment());
        preparedStatement.setString(8,passengers_entity.getNationality());
        preparedStatement.executeUpdate();
    }
    public void delete (Passengers_Entity passengers_entity) throws Exception { // delete
        preparedStatement = connection.prepareStatement("delete from passengers where meli_code = ? ");
        preparedStatement.setLong(1,passengers_entity.getMeli_code());
        preparedStatement.executeUpdate();
    }
    public void update (Passengers_Entity passengers_entity) throws Exception { // update
        preparedStatement = connection.prepareStatement("update passengers set Number_of_passengers = ?, duration_of_stay = ?, phone_number = ?, First_Payment = ?, total_Payment = ?,nationality = ?,fullname = ?  where meli_code = ?");
        preparedStatement.setString(7,passengers_entity.getFullname());
        preparedStatement.setLong(1,passengers_entity.getNumber_of_passengers());
        preparedStatement.setLong(2,passengers_entity.getDuration_of_stay());
        preparedStatement.setLong(3,passengers_entity.getPhone_number());
        preparedStatement.setLong(4,passengers_entity.getFirst_Payment());
        preparedStatement.setLong(5,passengers_entity.getTotal_payment());
        preparedStatement.setString(6,passengers_entity.getNationality());
        preparedStatement.setString(7,passengers_entity.getFullname());
        preparedStatement.setLong(8,passengers_entity.getMeli_code());
        preparedStatement.executeUpdate();
    }
    public List <Passengers_Entity> select() throws Exception {
        preparedStatement = connection.prepareStatement("select * from passengers");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Passengers_Entity> entityList = new ArrayList<>();
        while (resultSet.next()) {
            Passengers_Entity passengers_entity = new Passengers_Entity();
            passengers_entity.setMeli_code(resultSet.getInt("meli_code"));
            passengers_entity.setFullname(resultSet.getString("fullname"));
            passengers_entity.setNumber_of_passengers(resultSet.getLong("Number_of_passengers"));
            passengers_entity.setPhone_number(resultSet.getLong("phone_number"));
            passengers_entity.setFirst_Payment(resultSet.getLong("First_Payment"));
            passengers_entity.setTotal_payment(resultSet.getLong("total_Payment"));
            passengers_entity.setNationality(resultSet.getString("nationality"));
            entityList.add(passengers_entity);
        }
        return entityList;
    }
    public Long income() throws SQLException {
        preparedStatement = connection.prepareStatement("select * from passengers");
        ResultSet resultSet = preparedStatement.executeQuery();
        long sum = 0;
        while (resultSet.next()){
                sum += resultSet.getLong("total_Payment");
        }
        return sum;
    }

    public void commit() throws Exception {
        connection.commit ();
    }
    public void rollback() throws Exception {
        connection.rollback ();
    }

    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}
