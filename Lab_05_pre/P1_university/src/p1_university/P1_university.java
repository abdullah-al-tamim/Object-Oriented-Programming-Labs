/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_university;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class P1_university {

    /*
    input:
    123 Tamim 1.23
    321 Abdullah 2.43
    456 Rohim 2.87
    657 Korim 2.90
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        //Faculty faculty;
        Course course = new Course();
        
        boolean run = true;
            System.out.println("a. Add");
            System.out.println("b. Delete");
            System.out.println("c. Update");
            System.out.println("d. Add a student in a course");
            System.out.println("f. Add a faculty in a course");
            System.out.println("h. Print");
            System.out.println("i. Search");
            System.out.println("j. exit");
            System.out.print("Enter the specific letter: ");
        while (run==true) {
            char chrt = sc.next().charAt(0);
            switch (chrt) {
//                a. add
                case 'a':
                    System.out.println("a. Add a student");
                    System.out.println("b. Add a faculty");
                    System.out.println("c. Add a course");
                    System.out.print("Enter the specific letter: ");
                    char chAdd = sc.next().charAt(0);
                    switch (chAdd) {
                        case 'a':
                            System.out.print("Enter student id, name , cgpa: ");
                            int id = sc.nextInt();
                            String name = sc.next();
                            double cgpa = sc.nextDouble();
                            Student student1 = new Student(id, name, cgpa);
                            course.addStudent(student1);
                            System.out.println("\tStudent added!^_^\n");
                            break;
                        case 'b':
                            System.out.print("Enter facultyID, facultyName and facultyPOsition: ");
                            int fid = sc.nextInt();
                            String fName = sc.next();
                            String fPosition = sc.next();
                            Faculty faculty1 = new Faculty(fid, fName, fPosition);
                            course.addFaculty(faculty1);
                            System.out.println("Faculty Added!^_^\n");
                            break;
                        case 'c':
                            System.out.println("Enter courseId, courseTitle, credit, number of students: ");
                            String cId = sc.next();
                            String cTitle = sc.next();
                            double credit = sc.nextDouble();
                            int numberOFStudents = sc.nextInt();
                            Course course1 = new Course(cId, cTitle, credit, numberOFStudents);
                            course.addCourse(course1);
                            System.out.println("Course added!^_^\n");
                            break;
                        case 'd':
                            break;
                    }
                    break;
//              b. drop
                case 'b':
                    System.out.println("a. drop a student");
                    System.out.println("b. drop a faculty");
                    System.out.println("c. drop a course");
                    char chDrop = sc.next().charAt(0);
                    switch (chDrop) {
                        case 'a':
                            System.out.print("Enter the student id: ");
                            int id = sc.nextInt();
                            course.dropStudent(id);
                            System.out.println("Student dropped!:(\n");
                            break;
                        case 'b':
                            System.out.print("Enter the facultyID: ");
                            int fid = sc.nextInt();
                            course.dropFaculty(fid);
                            System.out.println("Faculty dropped!:(\n");
                            break;
                        case 'c':
                            System.out.print("Enter course id: ");
                            String courseId = sc.next();
                            course.dropCourse(courseId);
                            System.out.println("Course dropped!:(\n");
                            break;
                    }
                    break;
//              c. update
                case 'c':
                    System.out.println("a. update a student's cgpa");
                    System.out.println("b. update a faculty");
                    System.out.println("c. update a course");
                    System.out.print("Enter the specific letter: ");
                    char chUpdate = sc.next().charAt(0);
                    switch (chUpdate) {
                        case 'a':
                            System.out.print("Enter student's id and updated cgpa: ");
                            int id = sc.nextInt();
                            double ucgpa = sc.nextDouble();
                            //for (int i = 0; i < course.getStudentList().size(); i++) {
                            // if (course.getStudentList().get(i).getStudentId()==id) {
                            course.updateStudent(id, ucgpa);
                            // }

                            //}
                            System.out.println(" Student's CGPA has updated!¬_¬\n");
                            break;
                        case 'b':
                            System.out.print("Enter faculty's id and updated position");
                            int fid = sc.nextInt();
                            String fPosition = sc.nextLine();
                            course.updateFaculty(fid, fPosition);
                            System.out.println("Faculty position updated!¬_¬\n");
                            break;
                        case 'c':
                            System.out.print("Enter course id and updated number of students: ");
                            String cId = sc.next();
                            int numberOFStudents = sc.nextInt();
                            course.updateCourse(cId, numberOFStudents);
                            System.out.println("Course updated!¬_¬\n");
                            break;
                    }
//                d. Add students in a course
                case 'd':
                    System.out.print("In which course: ");;
                    String cId1 = sc.next();
                    System.out.print("ENter the student's id: ");
                    int sId1 = sc.nextInt();
                    course.addStudentInCOurse(cId1, sId1);
                    break;
//               
//              f. Add a faculty for a course
                case 'f':
                    System.out.print("Enter the faculty id: ");
                    int fId = sc.nextInt();
                    System.out.print("ENter the course id: ");
                    String cId3 = sc.next();
                    course.addFacultyInCourse(fId, cId3);
                    break;
//              
//              h. print
                case 'h':
                    System.out.println("a. Print all students\n" +
                                        "b. Print all course\n" +
                                        "c. Print all faculties\n" +
                                        "d. Print information of a student\n" +
                                        "e. Print information of a course\n" +
                                        "f. Print information of a faculty\n" +
                                        "g. Print student list and faculty information of a course\n" +
                                        "h. Print courses taken by a student");
                    System.out.print("Enter the specific letter: ");
                    char chPrint = sc.next().charAt(0);
                    switch (chPrint){
                        case 'a':
                            System.out.println(course.getStudentList());
                            break;
                        case 'b':
                            System.out.println(course.getCourseList());
                            break;
                        case 'c':
                            System.out.println(course.getFacultyList());
                            break;
                        case 'd':
                            System.out.print("Enter the student's id: ");
                            int sId3 = sc.nextInt();
                            for (int i = 0; i < course.getStudentList().size(); i++) {
                                if (course.getStudentList().get(i).getStudentId()==sId3) {
                                    System.out.println(course.getStudentList().get(i));
                                }
                            }
                        break;
                        case 'e':
                            System.out.print("Enter the course's id: ");
                            String cId5 = sc.next();
                            for (int i = 0; i < course.getCourseList().size(); i++) {
                                if (course.getCourseList().get(i).getCourseId().equalsIgnoreCase(cId5)) {
                                    System.out.println(course.getCourseList().get(i));
                                }
                            }
                        break;
                        case 'f':
                            System.out.print("Enter the faculty's id: ");
                            int fId3 = sc.nextInt();
                            for (int i = 0; i < course.getFacultyList().size(); i++) {
                                if (course.getFacultyList().get(i).getFacultyId()==fId3) {
                                    System.out.println(course.getFacultyList().get(i));
                                }
                            }
                        break;
                        case 'g':
                            System.out.print("Enter the course id: ");
                            String cIdPrint = sc.next();
                            for (int i = 0; i < course.getCourseList().size(); i++) {
                                if (course.getCourseList().get(i).getCourseId().equalsIgnoreCase(cIdPrint)) {
                                    
                                for (int j = 0; j < course.getCourseList().get(i).getStudentList().size(); j++) {
                                    System.out.println(course.getCourseList().get(i).getStudentList().get(j));
                                }
                                for (int k = 0; k < course.getCourseList().get(i).getFacultyList().size(); k++) {
                                    System.out.println(course.getCourseList().get(i).getFacultyList().get(k));
                                }
                              }
                            }
                            break;
                        case 'h':
                            System.out.print("Enter the student id: ");
                            int sId4 = sc.nextInt();
                            System.out.println("The student has taken: ");
                            for (int i = 0; i < course.getCourseList().size(); i++) {
                                for (int j = 0; j < course.getCourseList().get(i).getStudentList().size(); j++) {
                                    if (course.getCourseList().get(i).getStudentList().get(j).getStudentId()==sId4) {
//                                        course.getCourseList().get(i).displayWheatherAStudentTakeSCourse();
                                        System.out.println("CourseId: "+course.getCourseList().get(i).getCourseId()+" "
                                                        + "Course Title: "+course.getCourseList().get(i).getCourseTitle()+" "
                                                        + "Credit: "+course.getCourseList().get(i).getCredit());
                                    }
                                }
                            }
                            break;
                    }
                    break;
//              i. Search
                case 'i':
                    System.out.println("a. Search a Student");
                    System.out.println("b. Search a Course");
                    System.out.println("c. Search a Faculty");
                    System.out.println("d. Search whether a student takes a course");
                    System.out.println("e. Search whether a faculty teaches a course");
                    System.out.println("f. Search courses taken by a student");
                    System.out.println("g. Search courses taught by a faculty");
                    System.out.print("Enter the specific letter: ");
                    char chSearch = sc.next().charAt(0);
                    switch (chSearch){
                        case 'a':
                            System.out.print("Enter the student's id: ");
                            int sId3 = sc.nextInt();
                            for (int i = 0; i < course.getStudentList().size(); i++) {
                                if (course.getStudentList().get(i).getStudentId()==sId3) {
                                    System.out.println(course.getStudentList().get(i));
                                }
                            }
                        break;
                        case 'b':
                            System.out.print("Enter the course's id: ");
                            String cId5 = sc.next();
                            for (int i = 0; i < course.getCourseList().size(); i++) {
                                if (course.getCourseList().get(i).getCourseId().equalsIgnoreCase(cId5)) {
                                    System.out.println(course.getCourseList().get(i));
                                }
                            }
                        break;
                        case 'c':
                            System.out.print("Enter the faculty's id: ");
                            int fId3 = sc.nextInt();
                            for (int i = 0; i < course.getFacultyList().size(); i++) {
                                if (course.getFacultyList().get(i).getFacultyId()==fId3) {
                                    System.out.println(course.getFacultyList().get(i));
                                }
                            }
                        break;
//                       f. Search courses taken by a studentd. Search whether a student takes a course     d. Add a student in a course
                        case 'f':
                            System.out.print("Enter the student id: ");
                            int sId4 = sc.nextInt();
                            System.out.println("The student has taken: ");
                            for (int i = 0; i < course.getCourseList().size(); i++) {
                                for (int j = 0; j < course.getCourseList().get(i).getStudentList().size(); j++) {
                                    if (course.getCourseList().get(i).getStudentList().get(j).getStudentId()==sId4) {
//                                        course.getCourseList().get(i).displayWheatherAStudentTakeSCourse();
                                        System.out.println("CourseId: "+course.getCourseList().get(i).getCourseId()+" "
                                                        + "Course Title: "+course.getCourseList().get(i).getCourseTitle()+" "
                                                        + "Credit: "+course.getCourseList().get(i).getCredit());
                                    }
                                }
                            }
                            break;
//                      g. Search courses taught by a faculty
                        case 'g':
                            System.out.print("Enter the faculty ID: ");
                            int fId4 = sc.nextInt();
                            System.out.println("The faculty teaches: ");
                            for (int i = 0; i < course.getCourseList().size(); i++) {
                                for (int j = 0; j < course.getCourseList().get(i).getFacultyList().size(); j++) {
                                    if (course.getCourseList().get(i).getFacultyList().get(j).getFacultyId()==fId4) {
                                        System.out.println("CourseId: "+course.getCourseList().get(i).getCourseId()+" "
                                                        + "Course Title: "+course.getCourseList().get(i).getCourseTitle()+" "
                                                        + "Credit: "+course.getCourseList().get(i).getCredit());
                                    }
                                }
                                
                            }
                            break;
//                        d. Search whether a student takes a course     d. Add a student in a course
                        case 'd':
                            System.out.print("Enter the student id: ");
                            int sId5 = sc.nextInt();
                            int count1 =0;
                            for (int i = 0; i < course.getCourseList().size(); i++) {
                                for (int j = 0; j < course.getCourseList().get(i).getStudentList().size(); j++) {
                                    if (course.getCourseList().get(i).getStudentList().get(j).getStudentId()==sId5) {
                                        count1++;
                                    }
                                }
                            }
                            System.out.println("The student has taken "+count1+" courses.\n");
                            break;
//                        e. Search whether a faculty teaches a course        f. Add a faculty in a course
                        case 'e':
                            System.out.print("Enter the faculty ID: ");
                            int fId5 = sc.nextInt();
                            int count2=0;
                            for (int i = 0; i < course.getCourseList().size(); i++) {
                                for (int j = 0; j < course.getCourseList().get(i).getFacultyList().size(); j++) {
                                    if (course.getCourseList().get(i).getFacultyList().get(j).getFacultyId()==fId5) {
                                        count2++;
                                    }
                                }
                                
                            }
                            System.out.println("The faculty teaches "+count2+" courses.\n");
                            break;
                    }       
                    break;
                case 'j':
                    run = false;
                    System.out.println("\nCome back again!☺\n");
                    break;
            }
            
        }

    }

}
