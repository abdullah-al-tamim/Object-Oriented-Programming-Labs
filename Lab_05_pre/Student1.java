package com.Safayet;


import java.util.*;

public class Student {
    private int studentId;
    private String studentName;
    private double studentCGPA;
    public ArrayList<Courses> course = new ArrayList<Courses>();

    public Student() {

    }

    public Student(int studentId, String studentName, double studentCGPA) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCGPA = studentCGPA;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentCGPA(double studentCGPA) {
        this.studentCGPA = studentCGPA;
    }

    public double getStudentCGPA() {
        return studentCGPA;
    }

    public void addcourse(Courses p) {
        course.add(p);
    }

    public String display() {
        return " ID:" + studentId + " Name:" + studentName + " CGPA:" + studentCGPA;
    }

    public void dis() {
        System.out.println(" ID:" + studentId + " Name:" + studentName + " CGPA:" + studentCGPA);

        for (int i = 0; i < course.size(); i++) {
            System.out.println(course.get(i).display());
        }
    }
}
