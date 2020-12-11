package Model.Entity;

public class User_Entity {
    protected String username;
    protected String password;
    protected String job_title;

    public String getJob_title() {
        return job_title;
    }

    public User_Entity setJob_title(String job_title) {
        this.job_title = job_title;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User_Entity setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User_Entity setPassword(String password) {
        this.password = password;
        return this;
    }



}
