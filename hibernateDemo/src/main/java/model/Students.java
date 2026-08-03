package model;

import jakarta.persistence.*;

@Entity
@Table(name = "students")

public class Students {
    @Id
    private int stu_id;
    private String stu_name;
    private String sem;


    @ManyToOne
    @JoinColumn(name="dept_id")
    private Department dept_id;

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    public Department getDept_id() {
        return dept_id;
    }

    public void setDept_id(Department dept_id) {
        this.dept_id = dept_id;
    }
}
