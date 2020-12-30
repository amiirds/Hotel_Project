package Model.Repository;

import Model.Entity.Employee_Entity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Employee_Repository implements AutoCloseable{
    public static List<String> usernames = new ArrayList<>();
    public static List<String> passes = new ArrayList<>();
    private Connection connection;
    private PreparedStatement preparedStatement;
    public Employee_Repository() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "hotel", "amir123");
        connection.setAutoCommit(false);
        preparedStatement = connection.prepareStatement("CREATE table employees_Information (meli_code number unique ,username varchar(40), password varchar(40), fullname varchar(40), Job_Title varchar(40) , Salary number , phone_number varchar (90) unique, Address varchar(80 ))");
//        preparedStatement.executeUpdate(); // sakht jadval
        select();
    }
    public void insert(Employee_Entity employee_entity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into employees_Information (meli_code ,username ,password ,fullname ,job_title ,salary, phone_number, address ) values (?,?,?,?,?,?,?,?)");
        preparedStatement.setLong(1,employee_entity.getMeli_code());
        preparedStatement.setString(2,employee_entity.getUsername());
        preparedStatement.setString(3,employee_entity.getPassword());
        preparedStatement.setString(4,employee_entity.getFullname());
        preparedStatement.setString(5,employee_entity.getJob_Title());
        preparedStatement.setLong(6,employee_entity.getSalary());
        preparedStatement.setString(7,employee_entity.getPhone_number());
        preparedStatement.setString(8, employee_entity.getAddress());
        preparedStatement.executeUpdate();
    }
    public void delete(Employee_Entity employee_entity) throws Exception {
        preparedStatement = connection.prepareStatement("delete from employees_Information where meli_code = ? ");
        preparedStatement.setLong(1,employee_entity.getMeli_code());
        preparedStatement.executeUpdate();
    }
    public void update (Employee_Entity employee_entity) throws Exception {
        preparedStatement = connection.prepareStatement("update employees_Information set fullname = ?, job_title = ?, salary = ?, phone_number = ?, address = ?  where meli_code = ?");
        preparedStatement.setString(1,employee_entity.getFullname());
        preparedStatement.setString(2,employee_entity.getJob_Title());
        preparedStatement.setLong(3,employee_entity.getSalary());
        preparedStatement.setString(4,employee_entity.getPhone_number());
        preparedStatement.setString(5, employee_entity.getAddress());
        preparedStatement.setLong(6,employee_entity.getMeli_code());

        preparedStatement.executeUpdate();
    }
    public List<Employee_Entity> select() throws Exception {
        preparedStatement = connection.prepareStatement("select * from employees_Information");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Employee_Entity> entityList = new ArrayList<>();
        while (resultSet.next()) {
            Employee_Entity employee_entity = new Employee_Entity();
            employee_entity.setMeli_code(resultSet.getInt("meli_code"));
            employee_entity.setFullname(resultSet.getString("fullname"));
            employee_entity.setJob_Title(resultSet.getString("job_title"));
            employee_entity.setSalary(resultSet.getLong("salary"));
            employee_entity.setPhone_number(resultSet.getString("phone_number"));
            employee_entity.setAddress(resultSet.getString("address"));
            entityList.add(employee_entity);
            usernames.add(resultSet.getString("username"));
            passes.add(resultSet.getString("password"));
        }
        return entityList;
    }

//    public String showSalary(Employee_Entity employee_entity)throws Exception{
//        preparedStatement=connection.prepareStatement("select * from employees_Information where username =? and password =?");
//        preparedStatement.setString(1,employee_entity.getUsername());
//        preparedStatement.setString(2, employee_entity.getPassword());
//        ResultSet resultSet=preparedStatement.executeQuery();
//        String salary = null;
//        if (resultSet.next()){
//            salary=resultSet.getString("salary");
//        } else{
//            System.out.println("username or password is wrong!");
//        } return salary;
//    }

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
