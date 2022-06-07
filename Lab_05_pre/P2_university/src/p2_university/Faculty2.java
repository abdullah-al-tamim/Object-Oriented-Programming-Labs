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
public class Faculty2 {
    private int facultyId;
    private String facultyName;
    private String facultyPosition;
    public ArrayList<Course2> course = new ArrayList<Course2>();

    public Faculty2() {

    }

    public Faculty2(int facultyId, String facultyName, String facultyPosition) {

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

    public void addcour(Course2 t) {
        course.add(t);
    }

    public void diss() {
        System.out.println(" ID:" + facultyId + " Faculty Name:" + facultyName + " Position:" + facultyPosition);
        for (int i = 0; i < course.size(); i++) {

            System.out.println(course.get(i).display());

        }
    }
}
