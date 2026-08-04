package org.example;

import model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        /*StudentOperation obj = new StudentOperation();


        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an operation to perform: ");
        System.out.println("1. Insert ");
        System.out.println("2. Get ");
        System.out.println("3. Update ");
        System.out.println("4. Delete ");
        System.out.println("5. Get All Students ");
        System.out.println("6. Get Average Marks ");
        System.out.println("7. Get Maximum Marks ");
        System.out.println("8. Get Minimum Marks ");
        System.out.println("9. Get Count ");
        System.out.println("10. Get Sum of Marks ");

        int choice = sc.nextInt();

        switch(choice){
            case 1:
                Scanner id_sc1 = new Scanner(System.in);
                Scanner name_sc1 = new Scanner(System.in);
                Scanner marks_sc1 = new Scanner(System.in);
                System.out.println("Enter ID for new student");
                int id = id_sc1.nextInt();
                id_sc1.nextLine();
                System.out.println("Enter Name for new student");
                String name = name_sc1.nextLine();
                System.out.println("Enter Marks for new student");
                double marks = marks_sc1.nextDouble();

                obj.addStudent(session, transaction, id, name, marks);
                break;

            case 2:
                System.out.println("Enter id to get: ");

                Scanner sc2 = new Scanner(System.in);
                int search_id = sc2.nextInt();
                obj.getStudent(session, search_id);
                break;

            case 3:

                Scanner id_sc3 = new Scanner(System.in);
                Scanner marks_sc3 = new Scanner(System.in);
                System.out.println("Enter student id to update marks: ");
                int update_id = id_sc3.nextInt();
                id_sc3.nextLine();
                System.out.println("Enter marks to update: ");
                double update_marks = marks_sc3.nextDouble();
                obj.updateStudent(session, transaction, update_id, update_marks);
                break;

            case 4:
                System.out.println("Enter id to delete: ");
                Scanner sc4 = new Scanner(System.in);
                int delete_id = sc4.nextInt();
                obj.deleteStudent(session, transaction, delete_id);
                break;

            case 5:
                obj.getAllStudent(session);
                break;

            case 6:
                obj.getAverage(session);
                break;

            case 7:
                obj.getMax(session);
                break;

            case 8:
                obj.getMin(session);
                break;

            case 9:
                obj.getCount(session);
                break;

            case 10:
                obj.getSum(session);
                break;

            default:
                System.out.println("Enter valid input.");
                break;
        }
        */

        /*Aadhar a1 = new Aadhar();
        a1.setAadhar_id(1);
        a1.setAadhar_number("123456789012");

        Person p1 = new Person();
        p1.setPerson_id(1);
        p1.setPerson_name("Era");
        p1.setAadhar(a1);
        */

        /*
        Department d1 = new Department();
        d1.setDept_name("CSDS");
        d1.setDept_id(123);


        Students s1 = new Students();
        s1.setStu_id(101);
        s1.setStu_name("Era");
        s1.setSem("7");
        s1.setDept_id(d1);

        Students s2 = new Students();
        s2.setStu_id(102);
        s2.setStu_name("Trishala");
        s2.setSem("7");
        s2.setDept_id(d1);

        List<Students> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);

        d1.setStudent(students);
        */


        Employees e1 = new Employees();
        Employees e2 = new Employees();
        Projects p1 = new Projects();
        Projects p2 = new Projects();


        e1.setEmp_id(101);
        e1.setEmp_name("Era");

        e2.setEmp_id(102);
        e2.setEmp_name("Trishala");

        p1.setProject_id(145);
        p1.setProject_name("Company Website");

        p2.setProject_id(158);
        p2.setProject_name("Payment portal");

        e1.addProject(p1);
        e2.addProject(p2);
        e2.addProject(p2);

        session.persist(e1);
        session.persist(e2);
        session.persist(p1);
        session.persist(p2);

        transaction.commit();
        session.close();
        factory.close();

    }


}