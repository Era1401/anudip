package model;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doctor_id;

    @Column(name = "doctor_name")
    private String doctor_name;

    @Column(name = "doctor_speciality")
    private String doctor_speciality;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doctor")
    private List<Patient> patients;

    public Doctor() {
    }

    public Doctor(String doctor_name, String doctor_speciality) {
        this.doctor_name = doctor_name;
        this.doctor_speciality = doctor_speciality;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public String getDoctor_speciality() {
        return doctor_speciality;
    }

    public void setDoctor_speciality(String doctor_speciality) {
        this.doctor_speciality = doctor_speciality;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }
}
