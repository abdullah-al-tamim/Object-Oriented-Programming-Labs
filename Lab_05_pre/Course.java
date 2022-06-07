package com.Safayet;

public class Course
{
    private  String courseId;
    private  String courseTitle;
    private  double credit;
    private  Student []studentList;
    private  int numberOfStudents;
    private  Faculty faculty;
    public Course()
    {

    }
    public Course(String courseId,String courseTitle,double credit)
    {
        this.courseId=courseId;
        this.courseTitle=courseTitle;
        this.credit=credit;

    }
    public String toString()
    {
        return " "+courseId+courseTitle+credit;
    }
    public void AddStudent(Student[] A)
    {
        studentList=A;
    }
}
