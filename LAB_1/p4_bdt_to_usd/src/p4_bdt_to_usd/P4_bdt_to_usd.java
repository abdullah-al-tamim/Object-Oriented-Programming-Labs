/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4_bdt_to_usd;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class P4_bdt_to_usd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        switch (num){
            case 0: System.out.println("Enter USD: ");
                float usd= sc.nextFloat();
                double bdt= usd*84.0;
                System.out.println("The amount in bdt is "+bdt+" tk");
                break;
            case 1: System.out.println("Enter BDT: ");
                float bdt2= sc.nextFloat();
                float usd2= (bdt2/84) ;
                System.out.println("The amount in USD is: "+usd2+" $");
                break;
            default: System.out.println("Invalid input");
        }
    }
    
}
