package az.spring.hibernate.dao;


import az.spring.hibernate.model.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public class EmployeDaoIpml extends AbstractSessionFactory implements EmployeDao {


    @Transactional
    @Override
    public void insert(Employee employe) {

        getSession().save(employe);


    }

    @Transactional
    @Override
    public void update(Employee employe) {

        getSession().update(employe);

    }

    @Transactional
    @Override
    public void delte(int id) {
        getSession().delete(getEmployeById(id));

    }

    @Transactional
    @Override
    public Employee getEmployeById(int id) {


        return getSession().get(Employee.class, id);
    }

    @Transactional
    @Override
    public List<Employee> getAllEmployes() {

        return getSession().createQuery("select e from Employee e").list();
    }


}
