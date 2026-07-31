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

        //Insert
        Session session1 = factory.openSession();
        Transaction transaction1 = session1.beginTransaction();

        Student obj = new Student(1,"Era",98);
        Student obj1 = new Student(2, "Trishala", 100);
        session1.persist(obj);
        session1.persist(obj1);
        transaction1.commit();
        System.out.println("Student saved successfully");

        //Update
        Session session2 = factory.openSession();
        Transaction transaction2 = session2.beginTransaction();
        Student student = session2.get(Student.class, 1);
        if(student != null){
            student.setName("Era Ajay Todkar");
            student.setMarks(99);
        }
        transaction2.commit();
        System.out.println("Student updated successfully");

        //Delete
        Session session3 = factory.openSession();
        Transaction transaction3 = session3.beginTransaction();
        student = session3.get(Student.class, 1);
        session3.remove(student);
        transaction3.commit();
        System.out.println("Student deleted successfully");


        session1.close();
        session2.close();
        session3.close();

        factory.close();

    }
}
