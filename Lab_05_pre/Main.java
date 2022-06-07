package com.Safayet;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Student> object1 = new ArrayList<Student>();
    public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);

            System.out.println("1.Add");
            System.out.println("2.Delete");
            System.out.println("3.print");
            //System.out.println("4.Search");
            System.out.println("5.exit");
            System.out.println("Please enter a number:");

            boolean has = false;
            while (true) {
                int n = scan.nextInt();
                switch (n) {
                    case 1:
                        System.out.println("a.add a student");

                        char object = scan.next().charAt(0);
                        switch (object) {
                            case 'a':
                                Student oj1 = new Student(141, "has", 3.20);
                                object1.add(oj1);
                                System.out.println("student added");
                                break;
                        }
                        break;


                    case 2:
                        System.out.println("a.delete a student");
                        char adj = scan.next().charAt(0);
                        switch (adj) {
                            case 'a':
                                int y = scan.nextInt();
                                for (int i = 0; i < object1.size(); i++) {
                                    if (object1.get(i).getStudentId() == y) {
                                        object1.remove(i);
                                    }
                                }
                                System.out.println("student deleted");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println(object1.toString());
                        break;
                    default:
                        System.out.println("invalid");
                        break;
                }
                if (n == 5) {
                    has = false;
                    break;
                }
            }
        }
    }


