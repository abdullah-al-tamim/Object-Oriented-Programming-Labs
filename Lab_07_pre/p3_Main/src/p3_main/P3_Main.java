/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_main;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class P3_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();
            int[] arr = new int[100];
            for(int i=0; i<arr.length; i++){
                arr[i] = rand.nextInt(100);
            }
            System.out.print("Enter the index number: ");
            int index = sc.nextInt();
            if (index>99||index<0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            else {
                for (int i = 0; i < arr.length; i++) {
                    if (index==i) {
                        System.out.println("Value: "+arr[index]);
                    }
                }
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
