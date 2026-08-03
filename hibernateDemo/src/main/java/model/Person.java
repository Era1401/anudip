package model;

import jakarta.persistence.*;

@Entity
@Table(name = "person")
public class Person {
    @Id
    private int person_id;
    private String person_name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aadhar_id")
    private Aadhar aadhar;

    public Person() {
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public Aadhar getAadhar() {
        return aadhar;
    }

    public void setAadhar(Aadhar aadhar) {
        this.aadhar = aadhar;
    }


}
