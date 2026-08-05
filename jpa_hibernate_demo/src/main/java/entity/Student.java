package entity;

import jakarta.persistence.*;

@Entity
@Table (name = "student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "student_name",
            nullable = false,
            length = 100)
    private String name;
    private String course;
    private double marks;
    public Student(){}
    public Student(String name, String course, double marks){
        this.name = name;
        this.marks = marks;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}