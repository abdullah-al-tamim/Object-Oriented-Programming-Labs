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
public class Course2 {
    private String courseTitle;
    private int courseId;
    private double credit;
    public ArrayList<Student2> studentList = new ArrayList<Student2>();
    public ArrayList<Faculty2> faculty = new ArrayList<Faculty2>();
    private int numberOfStudents;


    public Course2() {

    }

    public Course2(String courseTitle, int courseId, double credit) {

        this.courseTitle = courseTitle;
        this.courseId = courseId;
        this.credit = credit;
    }

    public String display() {
        return " Title:" + courseTitle + " Course code:" + courseId + " Credit:" + credit;
    }

    public void addstudent(Student2 x) {

        studentList.add(x);
    }

    public void addfaculty(Faculty2 y) {

        faculty.add(y);

    }

    public void display1() {
        System.out.println(" Title:" + courseTitle + " Course code:" + courseId + " Credit:" + credit);

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).display());
        }
    }

    public void display2() {
        System.out.println(" Title:" + courseTitle + " Course code:" + courseId + " Credit:" + credit);

        for (int i = 0; i < faculty.size(); i++) {
            System.out.println(faculty.get(i).display());
        }
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }
}
