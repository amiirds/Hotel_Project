package Model.Service;

import Model.Entity.Reserve_Rooms_Entity;
import Model.Repository.Reserve_Rooms_Repository;

public class Reserve_Rooms_Service {
    Reserve_Rooms_Repository reserve_rooms_repository;

    public Reserve_Rooms_Service() throws Exception {
        reserve_rooms_repository = new Reserve_Rooms_Repository();
    }

    public void insert(Reserve_Rooms_Entity reserve_rooms_entity) throws Exception {
        reserve_rooms_repository.insert(reserve_rooms_entity);
        reserve_rooms_repository.commit();
    }

    public void delete (Reserve_Rooms_Entity reserve_rooms_entity) throws Exception {
        reserve_rooms_repository.delete(reserve_rooms_entity);
        reserve_rooms_repository.commit();
    }
    public void update (Reserve_Rooms_Entity reserve_rooms_entity) throws Exception {
        reserve_rooms_repository.update(reserve_rooms_entity);
        reserve_rooms_repository.commit();
    }
}
