package model;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "record")

public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int record_id;

    @Column(name = "diagnosis")
    private String diagnosis;

    @Column(name = "prescription")
    private String prescription;

    @Column(name = "date_created")
    private LocalDateTime date_created;

    @OneToOne(mappedBy = "record")
    private Patient patient;

    public Record() {
    }

    public int getRecord_id() {
        return record_id;
    }

    public void setRecord_id(int record_id) {
        this.record_id = record_id;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public LocalDateTime getDate_created() {
        return date_created;
    }

    public void setDate_created(LocalDateTime date_created) {
        this.date_created = date_created;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
