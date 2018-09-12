package com.shagha;

import static org.junit.Assert.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeTest {
    private static EntityManager em;

    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeePU");
        em = emf.createEntityManager();
        createEmployee(1,"sam", 27, 1300);
        createEmployee(2,"sozan", 27, 1550);
        createEmployee(3,"daf", 14, 800);


    }
    public static void createEmployee(int id,String name, int age, int salary){

        em.getTransaction().begin();
        Employee emp = new Employee(id, name, age, salary);
        em.persist(emp);
        em.getTransaction().commit();

    }

}