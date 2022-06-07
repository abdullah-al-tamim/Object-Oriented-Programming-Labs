/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorexcep;

import java.lang.reflect.Modifier;

/**
 *
 * @author Admin
 */
public class Calculator {

    private int a, b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int add() throws ArithmeticException,NumberFormatException {
        
         if (a < 0 || b < 0) {
            throw new ArithmeticException(" Enter two positiv"
                    + "e integers for addition");
        } else {
            return a + b;
        }
    }

    public int subtract() throws ArithmeticException {
        if (a < 0 || b < 0) {
            throw new ArithmeticException(" Enter two positiv"
                    + "e integers for subtraction");
        } else {
            return a - b;
        }
    }

    public int multiplication() throws ArithmeticException {
        if (a == 0 || b == 0) {
            throw new ArithmeticException(" Enter two numbers except 0 for multiplication");
        } else {
            return a * b;
        }
    }

    public int division() throws ArithmeticException {
        if (a == 0 || b == 0) {
            throw new ArithmeticException(" Enter two numbers except 0 for division");
        } else {
            return a / b;
        }
    }
}
