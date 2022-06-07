/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5_distance_in_circle;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class P5_distance_in_circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the center: ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println("Enter the radius: ");
        int rad= sc.nextInt();
        System.out.println("Enter a point: ");
        int x= sc.nextInt();
        int y= sc.nextInt();
        double distance= Math.sqrt(((p-x)*(p-x))+((q-y)*(q-y)));
        if (distance<rad)
        {
            System.out.println("Inside the circel");
        }
        else if (distance>rad)
        {
            System.out.println("Outside the circle");
        }
        else if (distance == rad) {
            System.out.println("On the circle");
        }
    }
    
    
}
