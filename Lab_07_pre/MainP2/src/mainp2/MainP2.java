/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainp2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MainP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        Product pro1 = new Product();
        System.out.print("ENter the weight: ");
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        pro1.productCheck(weight);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
