package az.spring.hibernate.dao;

import az.spring.hibernate.model.Employee;

import java.util.List;

public interface EmployeDao {

    void insert(Employee employe);

    void update(Employee employe);

    void delte(int id);

    Employee getEmployeById(int id);

    List<Employee> getAllEmployes();

}
