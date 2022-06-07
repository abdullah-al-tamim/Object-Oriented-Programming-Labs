/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5_max.min_using_function;
import java.util.Random;
/**
 *
 * @author Admin
 */
public class P5_maxMin_using_function {

    /**
     * @param args the command line arguments
     */
    public static int highest(int [] numbers){
        int high= numbers[0];
        int index=0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>high) {
                high= numbers[i];
                index = i;
            }
        }
        System.out.println("\n\nHighest number INDEX: "+index);
        return high;
    }
    public static int smallest(int[] numbers){
        int small= numbers[0];
        int index=0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<small) {
                small= numbers[i];
                index = i;
            }
        }
        System.out.println("Smallest number INDEX: "+index);
        return small;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= rand.nextInt(100);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]+" ");
        }
        int ret_smallest = smallest(numbers);
        System.out.println("Smallest: "+ret_smallest);
        
        int ret_highest = highest(numbers);
        System.out.println("HIghest: "+ret_highest);
    }
    
}
