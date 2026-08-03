package model;

import jakarta.persistence.*;
import org.hibernate.engine.internal.Cascade;

import java.util.List;

@Entity
@Table(name="department")

public class Department {
    @Id
    private int dept_id;

    private String dept_name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "dept_id")
    private List<Students> student;

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public List<Students> getStudent() {
        return student;
    }

    public void setStudent(List<Students> student) {
        this.student = student;
    }
}
