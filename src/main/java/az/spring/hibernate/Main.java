package az.spring.hibernate;

import az.spring.hibernate.config.SpringHibernateConfig;
import az.spring.hibernate.dao.EmployeDao;
import az.spring.hibernate.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringHibernateConfig.class);


        EmployeDao employeDao = context.getBean(EmployeDao.class);
        Employee e = new Employee();
        e.setAge(20);
        e.setName("samil");
        e.setSurname("aliyev");

        e.setSalary(200);


        employeDao.delte(3);
        employeDao.getAllEmployes().forEach(System.out::println);

        //   System.out.println(employeDao.getEmployeById(1));

    }
}
