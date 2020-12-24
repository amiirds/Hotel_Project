package Model.Service;

import Model.Entity.Passengers_Entity;
import Model.Repository.Passengers_Repo;

import java.sql.SQLException;
import java.util.List;

public class Passengers_service {
    Passengers_Repo passengers_repo ;

    public Passengers_service() throws Exception {
        passengers_repo = new Passengers_Repo();
    }

    public void insert(Passengers_Entity passengers_entity) throws Exception {
        passengers_repo.insert(passengers_entity);
        passengers_repo.commit();

    }
    public void delete(Passengers_Entity passengers_entity) throws Exception {
        passengers_repo.delete(passengers_entity);
        passengers_repo.commit();

    }
    public void update(Passengers_Entity passengers_entity) throws Exception {
        passengers_repo.update(passengers_entity);
        passengers_repo.commit();

    }
    public List<Passengers_Entity> select () throws Exception {
        List<Passengers_Entity> entities;
        try (Passengers_Repo passengers_repository = new Passengers_Repo()) {
            entities = passengers_repository.select();
        }
        return entities;
    }
    public long income() throws SQLException {
        return passengers_repo.income();
    }
}
