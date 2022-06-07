package com.Safayet;

public class Faculty {
    private int facultyId;
    private String facultyName;
    private  String facultyPosition;
    public Faculty()
    {

    }
    public Faculty(int facultyId,String facultyName,String facultyPosition)
    {
        this.facultyId=facultyId;
        this.facultyName=facultyName;
        this.facultyPosition=facultyPosition;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }


    public String toString()
    {
        return " "+facultyId+facultyName+facultyPosition;
    }
}
