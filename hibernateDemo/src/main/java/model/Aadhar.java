package model;


import jakarta.persistence.*;

@Entity
@Table(name = "aadhar")
public class Aadhar {
    @Id
    private int aadhar_id;
    private String aadhar_number;

    public Aadhar() {
    }


    public int getAadhar_id() {
        return aadhar_id;
    }

    public void setAadhar_id(int aadhar_id) {
        this.aadhar_id = aadhar_id;
    }

    public String getAadhar_number() {
        return aadhar_number;
    }

    public void setAadhar_number(String aadhar_number) {
        this.aadhar_number = aadhar_number;
    }

    @Override
    public String toString() {
        return "Aadhar{" +
                "aadhar_id=" + aadhar_id +
                ", aadhar_number='" + aadhar_number + '\'' +
                '}';
    }
}
