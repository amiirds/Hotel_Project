package Model.Service;

import Model.Entity.Employee_Entity;
import Model.Repository.Employee_Repository;

import java.util.List;

public class Employee_Service {
    public Employee_Service() {}
//    Employee_Repository employee_repository ;

    private static Employee_Service employee_service = new Employee_Service();
    public static Employee_Service getInstance() {
        return employee_service;
    }
    public void save (Employee_Entity employee_entity) throws Exception {
        try(Employee_Repository employee_repository = new Employee_Repository()) {
            employee_repository.insert(employee_entity);
            employee_repository.commit();
        }

    }
    public void delete (Employee_Entity employee_entity) throws Exception {
        try(Employee_Repository employee_repository = new Employee_Repository()) {
            employee_repository.delete(employee_entity);
            employee_repository.commit();
        }

    }
    public void update (Employee_Entity employee_entity) throws Exception {
        try(Employee_Repository employee_repository = new Employee_Repository()) {
            employee_repository.update(employee_entity);
            employee_repository.commit();
        }
    }
    public List<Employee_Entity> select () throws Exception {
        List<Employee_Entity> entities;
        try (Employee_Repository employee_repository = new Employee_Repository()) {
            entities = employee_repository.select();
        }
        return entities;
    }
}
