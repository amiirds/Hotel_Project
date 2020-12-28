package Model.Repository;

import Model.Entity.User_Entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class user_repo implements AutoCloseable {
    public static List<String> usernames = new ArrayList<>();
    public static List<String> passes = new ArrayList<>();
    private Connection connection;
    private PreparedStatement preparedStatement;

    public user_repo() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "hotel", "amir123");
        connection.setAutoCommit(false);
        preparedStatement = connection.prepareStatement("create table users (username varchar(90), password varchar (90),job_title varchar (90))");
//        preparedStatement.executeUpdate();
        select();
    }

    public void insert(User_Entity user_entity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into users (username, password, job_title) values (?,?,?)");
        preparedStatement.setString(1, user_entity.getUsername());
        preparedStatement.setString(2, user_entity.getPassword());
        preparedStatement.setString(3, user_entity.getJob_title());
        preparedStatement.executeUpdate();
        preparedStatement = connection.prepareStatement("insert into users (username, password, job_title) values (?,?,?)"); //creat test user
        preparedStatement.setString(1, "test2");
        preparedStatement.setString(2, "test2");
        preparedStatement.setString(3, "Hotel General Manager");
//        preparedStatement.executeUpdate(); // uncomment for creat user for test
    }
    public void delete(User_Entity user_entity) throws Exception {
        preparedStatement = connection.prepareStatement("delete from users where username = ?");
        preparedStatement.setString(1,user_entity.getUsername());
    }

    public List<User_Entity> select () throws Exception {

        preparedStatement = connection.prepareStatement("select * from users");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<User_Entity> entityList = new ArrayList<>();
        while (resultSet.next()) {
            User_Entity user_entity = new User_Entity();
            user_entity.setJob_title(resultSet.getString("job_title"));
            entityList.add(user_entity);
            usernames.add(resultSet.getString("username"));
            passes.add(resultSet.getString("password"));
        }

        return entityList;
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
