package az.spring.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractSessionFactory {


    @Autowired
    private SessionFactory sessionFactory;




    protected Session getSession() {

        return sessionFactory.getCurrentSession();
    }
}
