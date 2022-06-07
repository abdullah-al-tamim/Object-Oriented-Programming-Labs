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
public class Faculty {
    private int facultyId;
    private String facultyName, facultyPosition;
    public Faculty() {
    }
    public Faculty(int facultyId, String facultyName, String facultyPosition) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.facultyPosition = facultyPosition;
    }

    @Override
    public String toString() {
        return "Faculty:" + "facultyId:" + facultyId + ", facultyName:" + facultyName + ", facultyPosition:" + facultyPosition + "\n";
    }

    public int getFacultyId() {
        return facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public String getFacultyPosition() {
        return facultyPosition;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public void setFacultyPosition(String facultyPosition) {
        this.facultyPosition = facultyPosition;
    }

}
