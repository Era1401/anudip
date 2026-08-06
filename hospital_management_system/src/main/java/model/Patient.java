package model;


import jakarta.persistence.*;

@Entity
@Table(name = "patient")

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patient_id;

    @Column(name = "patient_name")
    private String patient_name;

    @Column(name = "patient_ward")
    private String patient_ward;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "record_id")
    private Record record;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    public Patient() {
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getPatient_ward() {
        return patient_ward;
    }

    public void setPatient_ward(String patient_ward) {
        this.patient_ward = patient_ward;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
