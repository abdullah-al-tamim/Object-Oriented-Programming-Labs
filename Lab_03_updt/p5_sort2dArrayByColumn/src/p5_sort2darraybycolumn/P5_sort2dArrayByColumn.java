/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5_sort2darraybycolumn;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class P5_sort2dArrayByColumn {

    /**
     * @param args the command line arguments
     */
    public static void sortByColumn(int matrix[][],int col) {
//        int[][] temp= new int[4][4];
            int min=0;
        for (int i = 0; i < matrix.length; i++) {
            min = matrix[i][col];
            int i_min = i;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][col]<min) {
                    min = matrix[j][col];
                    i_min = i;
                }
                
            }
            if (i_min!=i) {
            for (int k = 0; k < matrix.length; k++) {
                int temp = matrix[i][k];
                matrix[i][k]=matrix[i][i_min];
                matrix[i][i_min] = temp;
                
            }
                System.out.println("");
                
            }
        }
//        System.out.println(min);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
                
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner af= new Scanner(System.in);
       Random rand=new Random();
       int[][] matrix =new int[4][4];
        for(int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rand.nextInt(100);
                                System.out.print(matrix[i][j]+ " ");
			}
                        System.out.println(" ");
		}
        System.out.println("Enter Column number : ");
        int col=af.nextInt();
        sortByColumn(matrix,col);
    }
    
}
