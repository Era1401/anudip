package operations;

import jakarta.persistence.EntityManager;
import model.Doctor;
import model.Patient;
import model.Record;

public class PatientOperations {

    public void insertPatient(Patient p, EntityManager em){
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();

        System.out.println("Patient Inserted Successfully");


    }

    public void updatePatient(Patient p, EntityManager em, String name, String ward, Doctor d, Record r){
        em.getTransaction().begin();
        if(p!=null){
            p.setPatient_name(name);
            p.setPatient_ward(ward);
            p.setDoctor(d);
            p.setRecord(r);
        }


        em.merge(p);
        em.getTransaction().commit();

        System.out.println("Patient Updated Successfully");


    }

    public void displayPatient(Patient p, EntityManager em){
        em.getTransaction().begin();
        System.out.println("Patient Data:");

        if (p != null) {
            System.out.println("Patient ID: " + p.getPatient_id());
            System.out.println("Student Name: " + p.getPatient_name());
            System.out.println("Student Course: " + p.getPatient_ward());

            em.getTransaction().commit();


        }


    }

    public void deletePatient(Patient p, EntityManager em){

        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();

        System.out.println("Patient Deleted Successfully");


    }
}
