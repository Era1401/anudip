package model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
//create join table employee_projects
@Entity
@Table(name="employees")
public class Employees {
    @Id
    private int emp_id;

    private String emp_name;

    @ManyToMany
    @JoinTable(
            name = "employee_projects",
            joinColumns = @JoinColumn(name = "emp_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    private List<Projects> projects = new ArrayList<>();

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public List<Projects> getProjects() {
        return projects;
    }

    public void setProjects(List<Projects> projects) {
        this.projects = projects;
    }

    public void addProject(Projects project) {
        projects.add(project);
        project.getEmployees().add(this);
    }
}
