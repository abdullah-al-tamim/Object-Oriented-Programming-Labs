package com.Safayet;

import java.util.*;

public class Courses {
    private String courseTitle;
    private int courseId;
    private double credit;
    public ArrayList<Student> studentList = new ArrayList<Student>();
    public ArrayList<Faculty> faculty = new ArrayList<Faculty>();
    private int numberOfStudents;


    public Courses() {

    }

    public Courses(String courseTitle, int courseId, double credit) {

        this.courseTitle = courseTitle;
        this.courseId = courseId;
        this.credit = credit;
    }

    public String display() {
        return " Title:" + courseTitle + " Course code:" + courseId + " Credit:" + credit;
    }

    public void addstudent(Student x) {

        studentList.add(x);
    }

    public void addfaculty(Faculty y) {

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
