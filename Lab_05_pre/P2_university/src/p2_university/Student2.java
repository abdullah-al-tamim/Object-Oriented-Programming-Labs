/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_university;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Student2 {
    private int studentId;
    private String studentName;
    private double studentCGPA;
    public ArrayList<Course2> course = new ArrayList<Course2>();

    public Student2() {

    }

    public Student2(int studentId, String studentName, double studentCGPA) {
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

    public void addcourse(Course2 p) {
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
