package com.Safayet;

import java.util.ArrayList;
import java.util.Scanner;
public class Faculty {
    private int facultyId;
    private String facultyName;
    private String facultyPosition;
    public ArrayList<Courses> course = new ArrayList<Courses>();

    public Faculty() {

    }

    public Faculty(int facultyId, String facultyName, String facultyPosition) {

        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.facultyPosition = facultyPosition;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyPosition(String facultyPosition) {
        this.facultyPosition = facultyPosition;
    }

    public String getFacultyPosition() {
        return facultyPosition;
    }

    public String display() {
        return " ID:" + facultyId + " Faculty Name:" + facultyName + " Position:" + facultyPosition;
    }

    public void addcour(Courses t) {
        course.add(t);
    }

    public void diss() {
        System.out.println(" ID:" + facultyId + " Faculty Name:" + facultyName + " Position:" + facultyPosition);
        for (int i = 0; i < course.size(); i++) {

            System.out.println(course.get(i).display());

        }
    }
}
