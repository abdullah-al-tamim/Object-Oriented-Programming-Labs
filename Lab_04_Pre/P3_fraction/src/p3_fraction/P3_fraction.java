/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_fraction;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class P3_fraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first fraction's numerator and denominator: ");
        int nume1 = sc.nextInt();
        int deno1 = sc.nextInt();
        Fraction f1 = new Fraction(nume1, deno1);
        System.out.print("Enter second fraction's numerator and denominator: ");
        int nume2 = sc.nextInt();
        int deno2 = sc.nextInt();
        Fraction f2 = new Fraction(nume2, deno2);
//        toString
        System.out.println("In 1/2 format, fraction1 = "+f1.toString());
        System.out.println("In 1/2 format, fraction2 = "+f2.toString());
//        calculations
        System.out.println("");
        f1.add(f2);
        f1.sub(f2);
        f1.multiplication(f2);
        f1.division(f2);
    }
    
}
