package Model.Service;


import Model.Entity.Rooms_Entity;
import Model.Repository.Rooms_Repository;

public class Rooms_Service {
    Rooms_Repository rooms_repository;

    public Rooms_Service() throws Exception {
        rooms_repository = new Rooms_Repository();
    }

    public void insert(Rooms_Entity rooms_entity) throws Exception {
        rooms_repository.insert(rooms_entity);
        rooms_repository.commit();
    }
    public void delete(Rooms_Entity rooms_entity) throws Exception {
        rooms_repository.delete(rooms_entity);
        rooms_repository.commit();
    }
    public void update (Rooms_Entity rooms_entity) throws Exception {
        rooms_repository.update(rooms_entity);
        rooms_repository.commit();
    }
}
