/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisible_by_2or3;
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;
/**
 *
 * @author Admin
 */
public class Divisible_by_2or3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        if (num1%6==0) {
            System.out.println("FALSE");
           
        }
        else if (num1%2==0 || num1%3==0) {
            System.out.println("TRUE");
        }
        
        else{
            System.out.println("FALSE");
        }
    }
    
}
