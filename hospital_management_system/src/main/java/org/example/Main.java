package org.example;

import jakarta.persistence.EntityManager;
import model.Doctor;
import model.Record;
import model.Patient;
import operations.PatientOperations;
import util.JPAUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        EntityManager evm = JPAUtil.getEntityManager();
        System.out.println("JPA Connected Successfully");
        evm.getTransaction().begin();


        Doctor d1 = new Doctor("Era Todkar", "Neurology");
        Doctor d2 = new Doctor("Trishala Phatangade", "Cardiac Surgeon");

        Record r1 = new Record();
        List<Patient> patients = new ArrayList();

        //Patient p1 = new Patient();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operation to perform: ");
        System.out.println("1. Insert Patient Data ");
        System.out.println("2. Update Patient Data ");
        System.out.println("3. Find Patient Data ");
        System.out.println("4. Delete Patient Data ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                //insert
                PatientOperations patienti = new PatientOperations();
                Patient p1 = new Patient();
                Scanner scp1 = new Scanner(System.in);

                System.out.println("Enter patient name: ");
                p1.setPatient_name(scp1.nextLine());
                System.out.println("Enter patient ward: ");
                p1.setPatient_ward(scp1.nextLine());
                p1.setRecord(r1);
                p1.setDoctor(d1);

                patienti.insertPatient(p1, evm);
                patients.add(p1);

            case 2:
                //update
                PatientOperations patientu = new PatientOperations();
                Patient p2 = new Patient();
                Scanner scp2 = new Scanner(System.in);

            case 3:
                //read
                PatientOperations patientr = new PatientOperations();
                Patient p3 = new Patient();
                Scanner scpr = new Scanner(System.in);

            case 4:
                //delete
                PatientOperations patientd = new PatientOperations();
                Patient p4 = new Patient();
                Scanner scpd = new Scanner(System.in);

            default:
                break;



        }





        evm.persist();
        evm.getTransaction().commit();
        evm.close();
        JPAUtil.close();





    }
}
