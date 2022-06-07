/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4_maintriangle;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
class IllegalTriangleException extends Exception {

    public IllegalTriangleException(String msg) {
        super(msg);
    }

}

public class P4_MainTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the sides a, b, c: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if ((x + y > z) && (x + z > y) && (y + z > x)) {
            System.out.print("Enter the color of triangle: ");
            String color = sc.next();
            System.out.print("The triangle is filled or not, enter true/false: ");
            boolean filled = sc.nextBoolean();
//        initializing object and passing values
                Triangle tri1 = new Triangle(x, y, z);
                tri1.setColor(color);
                tri1.setFilled(filled);
//       printing
                System.out.println(tri1.toString());
                System.out.println();
                System.out.println("Area: " + tri1.getArea() + ", Perimeter: " + tri1.getPerimeter());

            }
            else throw new IllegalTriangleException("The sum of two sides must be greater than the third one");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
