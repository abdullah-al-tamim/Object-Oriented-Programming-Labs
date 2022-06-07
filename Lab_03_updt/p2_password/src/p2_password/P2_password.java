/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_password;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class P2_password {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String pass = null;
        System.out.print("Enter password: ");

            pass = sc.nextLine();
        if (pass.length()>=8) {
            if (ValidPassword(pass)) {
            System.out.println("Password is VALID: " + pass);
        } 
        else {
            System.out.println("NOT VALID PASSWORD: " + pass);
        }
        }
        else{
            System.out.println("Invalid. Please enter atleast 8 characters");
        }
        
    }
    public static boolean ValidPassword(String password) {


        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);
            if (ch >= '0' && ch <= '9'){
                count1++;
            }
            if ((ch >= 'A' && ch <= 'Z')||(ch >= 'a' && ch <= 'z')) {
                count2++;
            }
            
        }


        if (count1 >= 2 && count2 >= 1) {
            return true;
        }
        else{
            return false;
        }
    }
    
    
}
