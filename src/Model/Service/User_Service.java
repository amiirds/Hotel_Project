package Model.Service;


import Model.Entity.User_Entity;
import Model.Repository.user_repo;

import java.util.List;

public class User_Service {
    public User_Service() {}

        private static User_Service user_service = new User_Service();
        public static User_Service getInstance() {
            return user_service;
    }
    public void save (User_Entity user_entity) throws Exception {
        try(user_repo user_repository = new user_repo()) {
            user_repository.insert(user_entity);
            user_repository.commit();
        }
    }
    public void delete (User_Entity user_entity) throws Exception {
        try(user_repo user_repository = new user_repo()) {
            user_repository.delete(user_entity);
            user_repository.commit();
        }
    }
    public List<User_Entity> select () throws Exception {
        List<User_Entity> entities;
        try (user_repo user_repository = new user_repo()) {
            entities = user_repository.select();
        }
        return entities;
    }
}
