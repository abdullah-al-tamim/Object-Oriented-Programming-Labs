/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p6_sort_by_decreasing_number;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class P6_sort_by_decreasing_number {

    /**
     * @param args the command line arguments
     */
    public static void D_sort(String[] names, int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			int max = scores[i];
			int i_max = i;
			String temp;

			for (int j = i + 1; j < scores.length; j++) {
				if (scores[j] > max) {
					max = scores[j];
					i_max = j;
				}
			}
			
			if (i_max != i) {
				temp = names[i];
				names[i] = names[i_max];
				names[i_max] = temp;

				scores[i_max] = scores[i];
				scores[i] = max;
			}
		}
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		System.out.print("Total students: ");
		String[] names = new String[input.nextInt()];
		int[] scores = new int[names.length];

		System.out.println("Enter name and score of students:");
		for (int i = 0; i < names.length; i++) {
			System.out.print("Student no " + (i+1) + " name: ");
			names[i] = input.next();
			System.out.print("Score of the student: ");
			scores[i] = input.nextInt();
		}

		D_sort(names, scores);
                System.out.println("");
                for (int i = 0; i < names.length; i++) {
                        System.out.print(names[i]+" ");
                        System.out.println(scores[i]);
                }
    }
    
}
