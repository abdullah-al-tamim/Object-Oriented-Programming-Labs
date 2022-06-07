/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class P1_divisible_by_2or3_or_not {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    if (num1 % 2 == 0)
    {
        System.out.println("TRUE");
    }
    else if (num1 % 3 == 0)
    {
        System.out.println("FALSE");
    }
    
}
