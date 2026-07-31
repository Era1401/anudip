package org.example;

import model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    static void main() {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory();
        Session session1 = factory.openSession();
        Transaction transaction1 = session1.beginTransaction();
        Student obj = new Student(1,"Era",98);
        session1.persist(obj);
        transaction1.commit();
        session1.close();
        factory.close();
        System.out.println("Student saved successfully");
    }
}