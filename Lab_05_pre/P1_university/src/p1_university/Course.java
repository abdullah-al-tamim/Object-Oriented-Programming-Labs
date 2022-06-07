/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_university;
import java.util.*;
/**
 * 
 *
 * @author Admin
 */
public class Course {
    private String courseId, courseTitle;
    private double credit;
    private ArrayList<Student> studentList=new ArrayList<Student>();
    private ArrayList<Faculty> facultyList= new ArrayList<Faculty>();
    private ArrayList<Course> courseList = new ArrayList<Course>();
    private int numberOfStudents;
    public Course() {
    }

    public Course(String courseId, String courseTitle, double credit, int numberOfStudents) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
        this.numberOfStudents = numberOfStudents;
    }


    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public String getCourseId() {
        return courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public double getCredit() {
        return credit;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public ArrayList<Faculty> getFacultyList() {
        return facultyList;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void setFacultyList(ArrayList<Faculty> facultyList) {
        this.facultyList = facultyList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
    
    
    @Override
    public String toString() {
        return "Course: " + "courseId=" + courseId + ", courseTitle=" + courseTitle + ", credit=" + credit + ", numberOfStudents=" + numberOfStudents + "\n";
    }

    
    
//    STUDENT
    public void addStudent(Student obj){
        studentList.add(obj);
        
    }
    public void dropStudent(int studentId){
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentId() == studentId) {
                studentList.remove(i);
            }
            
        }
    }
    public void updateStudent( int id, double cgpa){
        for (int j = 0; j < studentList.size(); j++) {
            if (id == studentList.get(j).getStudentId()) {
                studentList.get(j).setStudentCGPA(cgpa);
            }
            
        }
    }
    
//  FACULTY
    public void addFaculty(Faculty facultyObj){
        facultyList.add(facultyObj);
    }
    public void dropFaculty(int facultyId){
        for (int i = 0; i < facultyList.size(); i++) {
            if (facultyList.get(i).getFacultyId()== facultyId) {
                facultyList.remove(i);
            }
            
        }
    }
    public void updateFaculty(int fid, String position){
        for (int i = 0; i < facultyList.size(); i++) {
            if (facultyList.get(i).getFacultyId()== fid) {
                facultyList.get(i).setFacultyPosition(position);
            }
        }
    }
    
//    Course
    public void addCourse(Course courseObj){
        courseList.add(courseObj);
    }
    public void dropCourse(String courseId){
        for (int i = 0; i < studentList.size(); i++) {
            if (courseList.get(i).getCourseId().equalsIgnoreCase(courseId)) {
                courseList.remove(i);
            }
            
        }
    }
    public void updateCourse(String cId, int numberOfStudents){
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCourseId().equalsIgnoreCase(cId)) {
                courseList.get(i).setNumberOfStudents(numberOfStudents);
            }
        }
    }
    
//   d. add students in a course
    public void addStudentInCOurse(String cId, int sId){
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCourseId().equalsIgnoreCase(cId)) {
                for (int j = 0; j < studentList.size(); j++) {
                    if (studentList.get(j).getStudentId()==sId) {
                        courseList.get(i).studentList.add(studentList.get(j));
                        System.out.println("Student added in course!\n");
                        courseList.get(i).displayStudentInCourse();

                    }
                }
                
            }
        }
        
    }
    
    public void displayStudentInCourse(){
        System.out.println("-----Details:----- \nCourse Id:"+courseId+" Course title: "+courseTitle+" Credit: "+credit);
        for (int i = 0; i < studentList.size(); i++) {
            System.out.print(studentList.get(i).toString());
        }
        System.out.println("");
    }

//     f. Add a faculty for a course
    public void addFacultyInCourse(int fid, String cid){
        for (int j = 0; j < courseList.size(); j++) {
            if (courseList.get(j).getCourseId().equalsIgnoreCase(cid)) {
                for (int i = 0; i < facultyList.size(); i++) {
                    if (fid==facultyList.get(i).getFacultyId()) {
                        courseList.get(j).facultyList.add(facultyList.get(i));
                        System.out.println("Faculty added for the course.");
                        courseList.get(j).displayFacultyInCourse();
                    }
                }
            }
        }
    }
    public void displayFacultyInCourse(){
        System.out.println("-----Details:----- \nCourse id:"+courseId+" Course title:"+courseTitle+" Credit:"+credit+" Number of students:"+numberOfStudents);
        for (int i = 0; i < facultyList.size(); i++) {
            System.out.println(facultyList.get(i).toString());
        }
        System.out.println("");
    }
}
