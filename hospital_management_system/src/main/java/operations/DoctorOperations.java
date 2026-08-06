package operations;

import jakarta.persistence.EntityManager;
import model.Doctor;
import model.Patient;
import model.Record;

public class DoctorOperations {

    public void displayDoctor(Doctor d, EntityManager em){
        em.getTransaction().begin();
        System.out.println("Patient Data:");

        if (d != null) {
            System.out.println("Doctor ID: " + d.getDoctor_id());
            System.out.println("Doctor Name: " + d.getDoctor_name());
            System.out.println("Doctor Speciality: " + d.getDoctor_speciality());

            em.getTransaction().commit();


        }


    }

    public void deleteDoctor(Doctor d, EntityManager em){

        em.getTransaction().begin();
        em.remove(d);
        em.getTransaction().commit();

        System.out.println("Patient Deleted Successfully");


    }




}
