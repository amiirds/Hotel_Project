package Model.Entity;

public class Employee_Entity {
    private String fullname;
    private String username;
    private String password;
    private long meli_code;
    private String phone_number;
    private long salary;
    private String Address;
    private String Job_Title;

    public String getFullname() {
        return fullname;
    }

    public Employee_Entity setFullname(String fullname) {
        this.fullname = fullname;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Employee_Entity setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Employee_Entity setPassword(String password) {
        this.password = password;
        return this;
    }

    public long getMeli_code() {
        return meli_code;
    }

    public Employee_Entity setMeli_code(long meli_code) {
        this.meli_code = meli_code;
        return this;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public Employee_Entity setPhone_number(String phone_number) {
        this.phone_number = phone_number;
        return this;
    }

    public long getSalary() {
        return salary;
    }

    public Employee_Entity setSalary(long salary) {
        this.salary = salary;
        return this;
    }

    public String getAddress() {
        return Address;
    }

    public Employee_Entity setAddress(String address) {
        Address = address;
        return this;
    }

    public String getJob_Title() {
        return Job_Title;
    }

    public Employee_Entity setJob_Title(String job_Title) {
        Job_Title = job_Title;
        return this;
    }
}
