/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_fraction;

/**
 *
 * @author Admin
 */
public class Fraction {
    private int numerator, denominator;
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
//  getters and setters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
//    toString
    public String toString(){
        return numerator+"/"+denominator;
    }
//    add
    public void add(Fraction f2){
        int multi_deno = denominator*f2.denominator;
        int div_deno1 = multi_deno/denominator;
        int div_deno2 = multi_deno/f2.denominator;
        System.out.println("Addition of fractions is: "+((numerator*div_deno1)+(f2.numerator*div_deno2))+"/"+(multi_deno));
    }
//    substtraction
    public void sub(Fraction f2){
        int multi_deno = denominator*f2.denominator;
        int div_deno1 = multi_deno/denominator;
        int div_deno2 = multi_deno/f2.denominator;
        System.out.println("Substraction of fractions is: "+((numerator*div_deno1)-(f2.numerator*div_deno2))+"/"+(multi_deno));
    }
//    multiplication
    public void multiplication(Fraction f2){
        System.out.println("Multiplication of fractions is: "+(numerator*f2.numerator)+"/"+(denominator*f2.denominator));
    }
//    division
    public void division(Fraction f2){
        System.out.println("Division of fractions is: "+(numerator*f2.denominator)+"/"+(denominator*f2.numerator));
    }
    
}
