/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4_string_sort;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class P4_string_sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("How many strings: ");
        int num = sc.nextInt();
        System.out.println("Enter the strings: ");
        String[] str = new String[num];
        for (int i = 0; i < num; i++) {
            str[i] = sc.next();
        }
        
        for(int i = 0; i < num; ++i) {
            for (int j = i + 1; j < num; ++j) {
              if (str[i].compareTo(str[j]) > 0) {

                // swaping the words 
                String temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                    }
                }
            }
    System.out.println("\n\nlexicographical orderly:");
        for(int i = 0; i < num; i++) {
          System.out.println(str[i]);
        }
 }
    
}
