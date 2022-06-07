/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_iminute_oyears;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class P2_iminute_oyears {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int min= sc.nextInt();
        int days = min/(60*24);
        int years = days/365;
        int day = days%365;
        System.out.println(years+ "  "+day);
    }
    
}
