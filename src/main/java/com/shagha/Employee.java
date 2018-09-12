package com.shagha;

import javax.persistence.*;

//my Bean :)
@Entity
@Table(name = "emp0")

public class Employee {


    private int id;
    private String name;
    private Integer age;


    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, int age, int salary) {
        super();
        this.id = id;
        this.age = age;
        this.name = name;
        this.salary = salary;
    }


    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "salary")
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}





