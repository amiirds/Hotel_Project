package Model;

import Model.Repository.Passengers_Repo;
import Model.Service.Passengers_service;

public class Hotel_income {

    public Hotel_income(){}

    public static Long getincome() throws Exception {
        Passengers_service passengers_service = new Passengers_service();
        long income = 0;
       income = passengers_service.income();
        return income;
    }
}
