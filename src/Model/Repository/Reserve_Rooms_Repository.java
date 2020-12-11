package Model.Repository;


import Model.Entity.Reserve_Rooms_Entity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Reserve_Rooms_Repository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public Reserve_Rooms_Repository() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "hotel", "amir123");
        connection.setAutoCommit(false);
        preparedStatement = connection.prepareStatement("CREATE table rooms (meli_code number , fullname varchar(40), Room_Id varchar(50), Room_number number ,Number_of_Vip_rooms number , Number_of_Ordinary_rooms number, Special_Room_price number , Normal_Room_price number , Normal_Room_Facilities varchar(225), Special_Room_Facilities varchar(225), type_of_room varchar(80) ,Staying_time number , Date_of_reserve varchar(40), time_of_reserve varchar(40) ,phone_number varchar(90) , First_Payment number, status varchar (40))");
//        preparedStatement.executeUpdate();
    }
    public void insert (Reserve_Rooms_Entity reserve_rooms_entity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into rooms (meli_code,fullname,Room_number,Staying_time,Date_of_reserve,time_of_reserve,phone_number,First_Payment) values (?,?,?,?,?,?,?,?)");
        preparedStatement.setLong(1,reserve_rooms_entity.getMeli_code());
        preparedStatement.setString(2,reserve_rooms_entity.getFullname());
        preparedStatement.setLong(3,reserve_rooms_entity.getRoom_number());
        preparedStatement.setLong(4,reserve_rooms_entity.getStaying_time());
        preparedStatement.setString(5,reserve_rooms_entity.getDate_of_reserve());
        preparedStatement.setString(6,reserve_rooms_entity.getTime_of_reserve());
        preparedStatement.setString(7,reserve_rooms_entity.getPhone_number());
        preparedStatement.setLong(8,reserve_rooms_entity.getFirst_Payment());
        preparedStatement.executeUpdate();

    }
    public void delete (Reserve_Rooms_Entity reserve_rooms_entity) throws Exception {
        preparedStatement = connection.prepareStatement("delete from rooms where meli_code = ? ");
        preparedStatement.setLong(1,reserve_rooms_entity.getMeli_code());
        preparedStatement.executeUpdate();
    }

    public void update (Reserve_Rooms_Entity reserve_rooms_entity) throws Exception {
        preparedStatement = connection.prepareStatement("update rooms set Staying_time = ? ,Date_of_reserve = ?,time_of_reserve = ? ,phone_number = ?,First_Payment = ?,Room_number = ?,fullname = ? where meli_code = ?");
        preparedStatement.setLong(1,reserve_rooms_entity.getStaying_time());
        preparedStatement.setString(2,reserve_rooms_entity.getDate_of_reserve());
        preparedStatement.setString(3,reserve_rooms_entity.getTime_of_reserve());
        preparedStatement.setString(4,reserve_rooms_entity.getPhone_number());
        preparedStatement.setLong(5,reserve_rooms_entity.getFirst_Payment());
        preparedStatement.setLong(6,reserve_rooms_entity.getRoom_number());
        preparedStatement.setString(7,reserve_rooms_entity.getFullname());
        preparedStatement.setLong(8,reserve_rooms_entity.getMeli_code());




        preparedStatement.executeUpdate();
    }
    public List<Reserve_Rooms_Entity> select_rooms() throws SQLException {
        preparedStatement = connection.prepareStatement("select *from rooms");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Long> entityList = new ArrayList<>();
        Reserve_Rooms_Entity reserve_rooms_entity = new Reserve_Rooms_Entity();
        while (resultSet.next()) {
            if (resultSet.getString("status").equals("no")){
               entityList.add(resultSet.getLong(""));
            }
        }
        return null;
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
