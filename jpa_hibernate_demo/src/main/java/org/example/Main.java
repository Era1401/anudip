package org.example;

import dao.StudentDAO;
import entity.Student;
import jakarta.persistence.EntityManager;
import util.JPAUtil;

public class Main {
    public static void main(String[] args){
        //EntityManager evm = JPAUtil.getEntityManager();
        //System.out.println("JPA Connected Successfully");
        //evm.close();
        //JPAUtil.close();

        //Student obj = new Student("Era", "CSDS", 98);
        Student obj1 = new Student("Shravani", "CSDS", 99);
        Student obj2 = new Student("Trishala", "CSDS", 98);
        StudentDAO dao = new StudentDAO();
        //dao.insertStudent(obj);
        dao.insertStudent(obj1);
        dao.insertStudent(obj2);


    }
}
