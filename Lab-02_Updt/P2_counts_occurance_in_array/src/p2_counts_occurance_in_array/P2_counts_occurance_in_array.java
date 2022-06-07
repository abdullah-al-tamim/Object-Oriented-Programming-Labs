/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_counts_occurance_in_array;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class P2_counts_occurance_in_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num;
        int[] array = new int[100];
        System.out.print("Enter the integers between 1 and 100 : ");
           for (int i = 0; i < array.length; i++) {
            num = sc.nextInt();
            array[i]=num;          
            if(num==0){
                break;
            }
        }
        int flag=0;
        for (int i = 1; i <=100; i++) {
            int count=0;
            for (int j = 0; j < array.length; j++) {
                if (array[j]==i) {
                    count++;
                }
            }
            if (count>1) {
                System.out.println(i+" occurs "+count+" times");
            }
            else if (count == 1){
                System.out.println(i+" occurs "+count+" time");
            }
            
        }
    }
    
}
