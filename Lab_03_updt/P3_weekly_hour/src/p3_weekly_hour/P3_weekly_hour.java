/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_weekly_hour;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class P3_weekly_hour {

    /**
     * @param args the command line arguments
     */
    public static int [] sum(int [][]matrix,int []sum_arr) {
       
        for (int i = 0; i < matrix.length; i++) {
          int   sum =0;
            for (int j = 0; j < matrix.length; j++) {
               sum+=matrix[i][j];
                
            }
            sum_arr[i]=sum;
        }
        return sum_arr;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand=new Random();
        Scanner af=new Scanner(System.in);
        System.out.print("How many employees: ");
         int num=af.nextInt();
        
       
       int[][] arr =new int[num][7];
        for(int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
                        arr[i][j] = rand.nextInt(8);
                        System.out.print(arr[i][j]+ " ");
                }
                    System.out.println(" ");
		}
        int[] sum_arr=new int[arr.length];
        int sum;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            sum_arr[i] = sum;
        }
         System.out.println("In decreasing order : ");
          for (int i = 0; i < arr.length; i++) {
            int max =sum_arr[0];
            int position = 0;
            for (int j = 0; j < arr.length; j++) {
                if (sum_arr[j] > max) {
                    max = sum_arr[j];
                    position = j;
                }
            }
            
            System.out.print("Employee number " + position + " : ");
            for (int m = 0; m < arr[position].length; m++) {
                System.out.print("  " + arr[position][m]);
            }
            System.out.println();
            sum_arr[position] = 0;
        }
    }
    
}
