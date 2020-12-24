package Model.Entity;

public class Rooms_Entity {
    private String Room_Id;
    private long Room_number;
    private long Number_of_Vip_rooms;
    private long Number_of_Ordinary_rooms ;
    private static long Special_Room_price = 300000;
    private static long Normal_Room_price = 100000;
    private String Normal_Room_Facilities;
    private String Special_Room_Facilities;
    private String type_of_room;
    private String status;



    public String getStatus() {
        return status;
    }

    public Rooms_Entity setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getRoom_Id() {
        return Room_Id;
    }

    public Rooms_Entity setRoom_Id(String room_Id) {
        Room_Id = room_Id;
        return this;
    }

    public long getRoom_number() {
        return Room_number;
    }

    public Rooms_Entity setRoom_number(long room_number) {
        Room_number = room_number;
        return this;
    }

    public long getNumber_of_Vip_rooms() {
        return Number_of_Vip_rooms;
    }

    public Rooms_Entity setNumber_of_Vip_rooms(long number_of_Vip_rooms) {
        Number_of_Vip_rooms = number_of_Vip_rooms;
        return this;
    }

    public long getNumber_of_Ordinary_rooms() {
        return Number_of_Ordinary_rooms;
    }

    public Rooms_Entity setNumber_of_Ordinary_rooms(long number_of_Ordinary_rooms) {
        Number_of_Ordinary_rooms = number_of_Ordinary_rooms;
        return this;
    }

    public long getSpecial_Room_price() {
        return Special_Room_price;
    }

    public Rooms_Entity setSpecial_Room_price(long special_Room_price) {
        Special_Room_price = special_Room_price;
        return this;
    }

    public long getNormal_Room_price() {
        return Normal_Room_price;
    }

    public Rooms_Entity setNormal_Room_price(long normal_Room_price) {
        Normal_Room_price = normal_Room_price;
        return this;
    }

    public String getNormal_Room_Facilities() {
        return Normal_Room_Facilities;
    }

    public Rooms_Entity setNormal_Room_Facilities(String normal_Room_Facilities) {
        Normal_Room_Facilities = normal_Room_Facilities;
        return this;
    }

    public String getSpecial_Room_Facilities() {
        return Special_Room_Facilities;
    }

    public Rooms_Entity setSpecial_Room_Facilities(String special_Room_Facilities) {
        Special_Room_Facilities = special_Room_Facilities;
        return this;
    }

    public String getType_of_room() {
        return type_of_room;
    }

    public Rooms_Entity setType_of_room(String type_of_room) {
        this.type_of_room = type_of_room;
        return this;
    }
}
