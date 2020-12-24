package Model.Entity;

public class Reserve_Rooms_Entity {
    private long Room_number;
    private String fullname;
    private long meli_code;
    private String phone_number;
    private long Staying_time;
    private String Date_of_reserve;
    private String time_of_reserve;
    private long First_Payment;
    private String status;


    public long getRoom_number() {
        return Room_number;
    }

    public Reserve_Rooms_Entity setRoom_number(long room_number) {
        Room_number = room_number;
        return this;
    }

    public String getStatus() {

        return status;
    }

    public Reserve_Rooms_Entity setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getFullname() {
        return fullname;
    }

    public Reserve_Rooms_Entity setFullname(String fullname) {
        this.fullname = fullname;
        return this;
    }

    public long getMeli_code() {
        return meli_code;
    }

    public Reserve_Rooms_Entity setMeli_code(long meli_code) {
        this.meli_code = meli_code;
        return this;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public Reserve_Rooms_Entity setPhone_number(String phone_number) {
        this.phone_number = phone_number;
        return this;
    }

    public long getStaying_time() {
        return Staying_time;
    }

    public Reserve_Rooms_Entity setStaying_time(long staying_time) {
        Staying_time = staying_time;
        return this;
    }

    public String getDate_of_reserve() {
        return Date_of_reserve;
    }

    public Reserve_Rooms_Entity setDate_of_reserve(String date_of_reserve) {
        Date_of_reserve = date_of_reserve;
        return this;
    }

    public String getTime_of_reserve() {
        return time_of_reserve;
    }

    public Reserve_Rooms_Entity setTime_of_reserve(String time_of_reserve) {
        this.time_of_reserve = time_of_reserve;
        return this;
    }

    public long getFirst_Payment() {
        return First_Payment;
    }

    public Reserve_Rooms_Entity setFirst_Payment(long first_Payment) {
        First_Payment = first_Payment;
        return this;
    }
}
