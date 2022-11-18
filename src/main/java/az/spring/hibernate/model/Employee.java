package az.spring.hibernate.model;


import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "employee")
@Data
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", length = 30)
    private String name;

    private String surname;

    private int age;


    private int salary;


}
