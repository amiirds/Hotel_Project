package Model.Entity;

public class Passengers_Entity {
    private String fullname;
    private long meli_code;
    private long phone_number;
    private long Number_of_passengers;
    private long duration_of_stay;
    private long First_Payment;
    private long Total_payment;
    private String nationality;
    private static long Special_Room_price = 300000;
    private static long Normal_Room_price = 100000;

    public static long getSpecial_Room_price() {
        return Special_Room_price;
    }

    public static void setSpecial_Room_price(long special_Room_price) {
        Special_Room_price = special_Room_price;
    }

    public static long getNormal_Room_price() {
        return Normal_Room_price;
    }

    public static void setNormal_Room_price(long normal_Room_price) {
        Normal_Room_price = normal_Room_price;
    }

    public String getFullname() {
        return fullname;
    }

    public Passengers_Entity setFullname(String fullname) {
        this.fullname = fullname;
        return this;
    }

    public long getMeli_code() {
        return meli_code;
    }

    public Passengers_Entity setMeli_code(long meli_code) {
        this.meli_code = meli_code;
        return this;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public Passengers_Entity setPhone_number(long phone_number) {
        this.phone_number = phone_number;
        return this;
    }

    public long getNumber_of_passengers() {
        return Number_of_passengers;
    }

    public Passengers_Entity setNumber_of_passengers(long number_of_passengers) {
        Number_of_passengers = number_of_passengers;
        return this;
    }

    public long getDuration_of_stay() {
        return duration_of_stay;
    }

    public Passengers_Entity setDuration_of_stay(long duration_of_stay) {
        this.duration_of_stay = duration_of_stay;
        return this;
    }

    public long getFirst_Payment() {
        return First_Payment;
    }

    public Passengers_Entity setFirst_Payment(long first_Payment) {
        First_Payment = first_Payment;
        return this;
    }

    public long getTotal_payment() {
        return Total_payment;
    }

    public Passengers_Entity setTotal_payment(long total_payment) {
        Total_payment = total_payment;
        return this;
    }

    public String getNationality() {
        return nationality;
    }

    public Passengers_Entity setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }
}
