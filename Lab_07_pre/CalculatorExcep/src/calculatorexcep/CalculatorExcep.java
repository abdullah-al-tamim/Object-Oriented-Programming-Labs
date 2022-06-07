/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorexcep;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CalculatorExcep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean count1 = true;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter two integers for addition: ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                int x = (int) a, y = (int) b;
                if (x == a && y == b) {
                    Calculator add = new Calculator(x, y);
                    System.out.println("Addition: " + add.add());
                    count1 = false;
                } else {
                    throw new NumberFormatException();
                }

            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            catch(NumberFormatException e){
                System.out.println(e);
            }
            catch(InputMismatchException e){
                System.out.println(e);
            }

        } while (count1 == true);
        boolean count2 = true;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter two integers for subtraction: ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                int x = (int) a, y = (int) b;
                if (x == a && y == b) {
                    Calculator sub = new Calculator(x, y);
                    System.out.println("Subtraction: " + sub.subtract());
                    count2 = false;
                }else {
                    throw new NumberFormatException();
                }
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            catch(NumberFormatException e){
                System.out.println(e);
            }
            catch(InputMismatchException e){
                System.out.println(e);
            }
        } while (count2);
        boolean count3 = true;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter two integers for multiplicaiotn: ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                int x = (int) a, y = (int) b;
                if (x == a && y == b) {
                    Calculator mul = new Calculator(x, y);
                    System.out.println("Multiplicaiton: " + mul.multiplication());
                    count3 = false;
                }else {
                    throw new NumberFormatException();
                }
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            catch(NumberFormatException e){
                System.out.println(e);
            }
            catch(InputMismatchException e){
                System.out.println(e);
            }
        } while (count3);
        boolean count4 = true;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter two integers for division: ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                int x = (int) a, y = (int) b;
                if (x == a && y == b) {
                    Calculator div = new Calculator(x, y);
                    System.out.println("Division: " + div.division());
                    count4 = false;
                }else {
                    throw new NumberFormatException();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            
        } while (count4);
    }

}
