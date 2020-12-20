package Model.Repository;


import Model.Entity.Rooms_Entity;

import java.sql.*;
import java.util.ArrayList;

public class Rooms_Repository implements AutoCloseable {

    private Connection connection;
    private PreparedStatement preparedStatement;

    public Rooms_Repository() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "hotel", "amir123");
        connection.setAutoCommit(false);
    }
    public void insert(Rooms_Entity rooms_entity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into rooms (Room_Id,Room_number,Number_of_Vip_rooms,Number_of_Ordinary_rooms,Special_Room_price,Normal_Room_price,Normal_Room_Facilities,Special_Room_Facilities,type_of_room,status) values (?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setString(1,rooms_entity.getRoom_Id());
        preparedStatement.setLong(2,rooms_entity.getRoom_number());
        preparedStatement.setLong(3,rooms_entity.getNumber_of_Vip_rooms());
        preparedStatement.setLong(4,rooms_entity.getNumber_of_Ordinary_rooms());
        preparedStatement.setLong(5,rooms_entity.getSpecial_Room_price());
        preparedStatement.setLong(6,rooms_entity.getNormal_Room_price());
        preparedStatement.setString(7,rooms_entity.getNormal_Room_Facilities());
        preparedStatement.setString(8,rooms_entity.getSpecial_Room_Facilities());
        preparedStatement.setString(9,rooms_entity.getType_of_room());
        preparedStatement.setString(10,rooms_entity.getStatus());
        preparedStatement.executeUpdate();
    }
    public void update(Rooms_Entity rooms_entity) throws Exception {
        preparedStatement = connection.prepareStatement("update rooms set Number_of_Vip_rooms = ? ,Number_of_Ordinary_rooms = ? ,Special_Room_price = ?,Normal_Room_price = ?,Normal_Room_Facilities = ?,Special_Room_Facilities = ?, type_of_room = ?, status = ? where Room_number = ?");

        preparedStatement.setLong(1,rooms_entity.getNumber_of_Vip_rooms());
        preparedStatement.setLong(2,rooms_entity.getNumber_of_Ordinary_rooms());
        preparedStatement.setLong(3,rooms_entity.getSpecial_Room_price());
        preparedStatement.setLong(4,rooms_entity.getNormal_Room_price());
        preparedStatement.setString(5,rooms_entity.getNormal_Room_Facilities());
        preparedStatement.setString(6,rooms_entity.getSpecial_Room_Facilities());
        preparedStatement.setString(7,rooms_entity.getType_of_room());
        preparedStatement.setString(8,rooms_entity.getStatus());
        preparedStatement.setLong(9,rooms_entity.getRoom_number());
        preparedStatement.executeUpdate();
    }
    public void delete (Rooms_Entity rooms_entity) throws Exception {
        preparedStatement = connection.prepareStatement("delete from rooms where Room_number = ? ");
        preparedStatement.setLong(1,rooms_entity.getRoom_number());
        preparedStatement.executeUpdate();
    }

    public ArrayList <Integer> select() throws SQLException {
        ArrayList <Integer> listId = new ArrayList<>();
        preparedStatement = connection.prepareStatement("select * from rooms");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = 0;
            String status = resultSet.getString("status");
            if (status.equals("No")) {
                id = resultSet.getInt("Room_number");
                listId.add(id);
            }
        }
        return listId;
    }

    public void commit() throws Exception {
        connection.commit ();
    }
    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}
