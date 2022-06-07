/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_university;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class P2_university {

    public static ArrayList<Student2> object1 = new ArrayList<Student2>();
    public static ArrayList<Course2> object2 = new ArrayList<Course2>();
    public static ArrayList<Faculty2> object3 = new ArrayList<Faculty2>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Display");
        System.out.println("4. Search");
        System.out.println("5. Add Students in a course");
        System.out.println("6. Add Faculty in a course ");
        System.out.println("7. Add courses for a student");
        System.out.println("8. Add courses for a faculty");
        System.out.println("9. Update");
        System.out.println("10. Exit");
        System.out.println("Please enter a number:");

        boolean has = false;
        while (true) {
            int n = input.nextInt();
            switch (n) {
                case 1:
                    System.out.println("a. Add  student");
                    System.out.println("b. Add  course");
                    System.out.println("c. Add  faculty");
                    System.out.println("Enter an option:");
                    char cha = input.next().charAt(0);
                    switch (cha) {
                        case 'a':
                            System.out.println("Enter student Id,name,cgpa:");
                            int id = input.nextInt();
                            String nam = input.next();
                            double cg = input.nextDouble();
                            Student2 obj = new Student2(id, nam, cg);
                            object1.add(obj);
                            System.out.println("Student added successfully");
                            break;
                        case 'b':
                            System.out.println("Enter courseTitle,Code,credit:");
                            String h = input.next();
                            int o = input.nextInt();
                            double r = input.nextDouble();
                            Course2 obj1 = new Course2(h, o, r);
                            object2.add(obj1);
                            System.out.println("course has been added successfully");
                            break;
                        case 'c':
                            System.out.println("Enter faculty Id, name, position:");
                            int s = input.nextInt();
                            String t = input.next();
                            String u = input.next();

                            Faculty2 v = new Faculty2(s, t, u);
                            object3.add(v);
                            System.out.println("faculty added successfully");
                            break;
                        default:
                            System.out.println("invalid option");
                            System.out.println("Please try a valid option");
                            break;

                    }
                    break;


                case 2:
                    System.out.println("a. Delete a student");
                    System.out.println("b. Delete a course");
                    System.out.println("c. Delete a faculty");
                    System.out.println("Enter an option:");
                    char ch = input.next().charAt(0);
                    switch (ch) {
                        case 'a':
                            System.out.println("Enter a Student Id:");
                            int n1 = input.nextInt();
                            for (int i = 0; i < object1.size(); i++) {
                                if (object1.get(i).getStudentId() == n1) {
                                    object1.remove(i);
                                }
                            }
                            System.out.println("student deleted successfully");
                            break;
                        case 'b':
                            System.out.println("Enter a Course code:");
                            int n2 = input.nextInt();
                            for (int i = 0; i < object2.size(); i++) {
                                if (object2.get(i).getCourseId() == n2) {
                                    object2.remove(i);
                                }
                            }
                            System.out.println("course deleted successfully");
                            break;
                        case 'c':
                            System.out.println("Enter a Faculty Id:");
                            int n3 = input.nextInt();
                            for (int i = 0; i < object3.size(); i++) {
                                if (object3.get(i).getFacultyId() == n3) {
                                    object3.remove(i);
                                }
                                System.out.println("Faculty removed successfully ");
                                break;
                            }
                        default:
                            System.out.println("invalid option");
                            System.out.println("Please try a valid option");
                            break;
                    }
                    break;
                case 3:
                    for (int i = 0; i < object1.size(); i++) {

                        System.out.println(object1.get(i).display());
                    }

                    for (int i = 0; i < object2.size(); i++) {

                        System.out.println(object2.get(i).display());
                    }
                    for (int i = 0; i < object3.size(); i++) {

                        System.out.println(object3.get(i).display());
                    }

                    break;
                case 4:
                    System.out.println("a. Search  student");
                    System.out.println("b. Search  course");
                    System.out.println("c. Search  faculty");
                    System.out.println("d. search weather student takes a course");
                    System.out.println("e. search weather  faculty takes a course");
                    System.out.println("f. search courses taken by  student ");
                    System.out.println("g. search courses taught by  faculty");
                    System.out.println("Enter an option:");
                    char char1 = input.next().charAt(0);
                    switch (char1) {
                        case 'a':
                            System.out.println("Enter a student id:");
                            int p = input.nextInt();
                            for (int i = 0; i < object1.size(); i++) {
                                if (object1.get(i).getStudentId() == p) {
                                    System.out.println(object1.get(i).display());
                                }
                            }
                            break;
                        case 'b':
                            System.out.println("Enter course code:");
                            int n4 = input.nextInt();
                            for (int i = 0; i < object2.size(); i++) {
                                if (object2.get(i).getCourseId() == n4) {
                                    System.out.println(object2.get(i).display());
                                }
                            }
                            break;
                        case 'c':
                            System.out.println("Enter faculty id:");
                            int n5 = input.nextInt();
                            for (int i = 0; i < object3.size(); i++) {
                                if (object3.get(i).getFacultyId() == n5) {
                                    System.out.println(object3.get(i).display());
                                }
                            }
                            break;
                        case 'd':
                            System.out.println("Enter Student Id:");
                            int n6 = input.nextInt();
                            for (int i = 0; i < object2.size(); i++) {
                                for (int j = 0; j < object2.get(i).studentList.size(); j++) {
                                    if (object2.get(i).studentList.get(j).getStudentId() == n6) {
                                        System.out.println(" The student has taken this course");
                                        object2.get(i).display1();
                                    }
                                }
                            }
                            break;
                        case 'e':
                            System.out.println("Enter Faculty Id:");
                            int n7 = input.nextInt();
                            for (int i = 0; i < object2.size(); i++) {
                                for (int j = 0; j < object2.get(i).faculty.size(); j++) {
                                    if (object2.get(i).faculty.get(j).getFacultyId() == n7) {
                                        System.out.println(" The number faculty has taken this course");
                                        object2.get(i).display2();
                                    }
                                }
                            }
                            break;
                        case 'f':
                            System.out.println("Enter Student Id:");
                            int n8 = input.nextInt();
                            for (int i = 0; i < object1.size(); i++) {
                                if (object1.get(i).getStudentId() == n8) {
                                    for (int j = 0; j < object1.get(i).course.size(); j++) {
                                        System.out.println("course taken by a student successfully");

                                        object1.get(i).dis();
                                        break;

                                    }
                                }

                            }
                            break;
                        case 'g':
                            System.out.println("Enter Faculty Id:");
                            int n9 = input.nextInt();
                            for (int i = 0; i < object3.size(); i++) {
                                if (object3.get(i).getFacultyId() == n9) {
                                    for (int j = 0; j < object3.get(i).course.size(); j++) {
                                        System.out.println("course taken by a faculty successfully");
                                        object3.get(i).diss();
                                        break;
                                    }
                                }
                            }

                            break;

                        default:
                            System.out.println("invalid option ");
                            System.out.println("Please try a valid option");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Enter the course code:");
                    int n10 = input.nextInt();
                    System.out.println("Enter the student id:");
                    int n11 = input.nextInt();
                    for (int i = 0; i < object2.size(); i++) {
                        if (object2.get(i).getCourseId() == n10) {
                            for (int j = 0; j < object1.size(); j++) {
                                if (object1.get(j).getStudentId() == n11) {
                                    object2.get(i).addstudent(object1.get(j));
                                    System.out.println("student added in course successfully");
                                    object2.get(i).display1();
                                }
                            }
                        }
                    }

                    break;
                case 6:
                    System.out.println("Enter the course code:");
                    int n12 = input.nextInt();
                    System.out.println("Enter the faculty id:");
                    int n13 = input.nextInt();
                    for (int i = 0; i < object2.size(); i++) {
                        if (object2.get(i).getCourseId() == n12) {
                            for (int j = 0; j < object3.size(); j++) {
                                if (object3.get(j).getFacultyId() == n13) {
                                    object2.get(i).addfaculty(object3.get(j));
                                    System.out.println("Faculty added in course successfully");
                                    object2.get(i).display2();
                                }
                            }
                        }
                    }

                    break;
                case 7:
                    System.out.println("Enter a Student id:");
                    int n14 = input.nextInt();
                    System.out.println("Enter a Course code:");
                    int n15 = input.nextInt();
                    for (int i = 0; i < object1.size(); i++) {
                        if (object1.get(i).getStudentId() == n14) {
                            for (int j = 0; j < object2.size(); j++) {
                                if (object2.get(j).getCourseId() == n15) {
                                    object1.get(i).addcourse(object2.get(j));
                                    System.out.println("course added for a student");
                                    object1.get(i).dis();
                                }
                            }
                        }
                    }


                    break;
                case 8:
                    System.out.println("Enter faculty id:");
                    int n16 = input.nextInt();
                    System.out.println("Enter course code:");
                    int n17 = input.nextInt();
                    for (int i = 0; i < object3.size(); i++) {
                        if (object3.get(i).getFacultyId() == n16) {
                            for (int j = 0; j < object2.size(); j++) {
                                if (object2.get(j).getCourseId() == n17) {
                                    object3.get(i).addcour(object2.get(j));
                                    System.out.println("course added for a faculty");
                                    object3.get(i).diss();
                                }
                            }
                        }
                    }


                    break;

                case 9:
                    System.out.println("a. Update a student");
                    System.out.println("b. Update a course");
                    System.out.println("c. Update a faculty");
                    char chr1 = input.next().charAt(0);
                    switch (chr1) {
                        case 'a':
                            System.out.println("Enter student ID:");
                            int n18 = input.nextInt();
                            for (int i = 0; i < object1.size(); i++) {
                                if (object1.get(i).getStudentId() == n18) {
                                    System.out.println("Press 20 to change the name");
                                    System.out.println("press 21 to change the CGPA");
                                    int n19 = input.nextInt();
                                    if (n19 == 20) {
                                        System.out.println("Enter a new name:");
                                        String s = input.next();
                                        object1.get(i).setStudentName(s);

                                    } else if (n19 == 21) {
                                        System.out.println("Enter a new CGPA:");
                                        double ss = input.nextDouble();
                                        object1.get(i).setStudentCGPA(ss);
                                    }
                                }
                            }
                            System.out.println("Student's information Updated successfully ");
                            break;
                        case 'b':
                            System.out.println("Please Enter the course code:");
                            int n20 = input.nextInt();
                            for (int i = 0; i < object2.size(); i++) {
                                if (object2.get(i).getCourseId() == n20) {
                                    System.out.println("Press 14 to change the Title:");
                                    System.out.println("press 11 to change the number of Credit:");
                                    System.out.println("press 12 to change the course code:");
                                    int n21 = input.nextInt();
                                    if (n21 == 14) {
                                        System.out.println("Enter a new Course title:");
                                        String s1 = input.next();
                                        object2.get(i).setCourseTitle(s1);

                                    } else if (n21 == 11) {
                                        System.out.println("Enter new credit:");
                                        double x3 = input.nextDouble();
                                        object2.get(i).setCredit(x3);

                                    } else if (n21 == 12) {
                                        System.out.println("Enter a new Course code:");
                                        int n22 = input.nextInt();
                                        object2.get(i).setCourseId(n22);
                                    }
                                }
                                System.out.println("Course information Updated successfully ");
                            }
                            break;
                        case 'c':
                            int m1 = input.nextInt();
                            for (int i = 0; i < object3.size(); i++) {
                                if (object3.get(i).getFacultyId() == m1) {
                                    System.out.println("Press 13 to change the name");
                                    System.out.println("press 15 to change the Position");
                                    int m2 = input.nextInt();
                                    if (m2 == 13) {
                                        System.out.println("Enter a new name:");
                                        String s2 = input.next();
                                        object3.get(i).setFacultyName(s2);

                                    } else if (m2 == 15) {
                                        System.out.println("Enter a new Position:");
                                        int s3 = input.nextInt();
                                        object3.get(i).setFacultyId(s3);
                                    }
                                }
                                System.out.println("Faculty Updated successfully ");
                            }
                            break;
                        default:
                            System.out.println("invalid option");
                            System.out.println("Please try a valid option");
                            break;


                    }
                    break;
                default:
                    System.out.println("invalid option");
                    System.out.println("Please try a valid option");
                    break;
            }
            if (n == 10) {
                System.out.println("thanks");
                has = false;
                break;
            }
        }
    }
    
}
