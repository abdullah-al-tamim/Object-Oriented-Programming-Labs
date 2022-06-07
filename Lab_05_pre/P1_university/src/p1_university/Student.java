/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_university;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Student {
    private int studentId;
    private String studentName;
    private double studentCGPA;
    public Student() {
    }
    public Student(int studentId, String studentName, double studentCGPA) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCGPA = studentCGPA;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudentCGPA() {
        return studentCGPA;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentCGPA(double studentCGPA) {
        this.studentCGPA = studentCGPA;
    }

    
    
    
    @Override
    public String toString() {
        return "Student: " + "studentId=" + studentId + " studentName:" + studentName + " studentCGPA:" + studentCGPA + "\n";
    }

}
