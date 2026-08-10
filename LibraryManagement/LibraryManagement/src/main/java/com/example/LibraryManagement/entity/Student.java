package com.example.LibraryManagement.entity;

public class Student {
    private int student_id;
    private String student_name;
    private String student_dept;


    public Student(int student_id, String student_name, String student_dept) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_dept = student_dept;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_dept() {
        return student_dept;
    }

    public void setStudent_dept(String student_dept) {
        this.student_dept = student_dept;
    }
}
