package org.example;

import model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class StudentOperation {

        public void addStudent(Session session, Transaction transaction, int id, String name, double marks) {

            Student obj = new Student(id, name, marks);
            session.persist(obj);
            transaction.commit();
            System.out.println("Students saved successfully");

            session.close();


        }

        public void getStudent(Session session, int id) {

            Student student = session.get(Student.class, id);

            if (student != null) {
                System.out.println("Student ID: " + student.getId());
                System.out.println("Student Name: " + student.getName());
                System.out.println("Student Marks: " + student.getMarks());

            }
            else{
                System.out.println("Student not found");
            }

            session.close();

        }

        public void updateStudent(Session session, Transaction transaction, int id, double update_marks) {


            Student student = session.find(Student.class, id);
            student.setMarks(update_marks);

            session.merge(student);
            transaction.commit();
            System.out.println("Student updated successfully");

            session.close();
        }

        public void deleteStudent(Session session, Transaction transaction, int id) {

            Student student = session.find(Student.class, id);
            session.remove(student);
            transaction.commit();

            System.out.println("Student deleted successfully");

            session.close();

        }

        public void getAllStudent(Session session, Transaction transaction) {

            List<Student> students = session
                    .createQuery("FROM Student", Student.class)
                    .list();

            for (Student student : students) {
                System.out.println(
                        "ID: " + student.getId() +
                        ", Name: " + student.getName() +
                        ", Marks: " + student.getMarks()
                );
            }

        }


}
