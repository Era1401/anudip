package dao;

import entity.Student;
import jakarta.persistence.EntityManager;
import util.JPAUtil;

public class StudentDAO {

    public void insertStudent(Student stu){

        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(stu);
        em.getTransaction().commit();
        em.close();

        System.out.println("Student Inserted Successfully");

    }

}
