/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_quadratic_equation;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class P3_quadratic_equation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //float a= sc.nextFloat();
        System.out.println("Enter a, b and c: ");
        float a= sc.nextFloat();
        float b= sc.nextFloat();
        float c= sc.nextFloat();
        float dis = (b*b)-4*a*c;
        //float discri = dis;
        if (dis>0) {
            System.out.println("The eqn has two real rooots");
            double r1 = ((-1*b)+Math.sqrt(dis))/2*a ;
            System.out.println("r1= "+r1);
            double r2 = ((-1*b)-Math.sqrt(dis))/2*a ;
            System.out.println("r2= "+r2);
        }
        else if (dis==0){
            System.out.println("The eqn has one real root");
            double r1 = ((-1*b)+Math.sqrt(dis))/2*a ;
            System.out.println("r1= "+r1);
        }
        else{
            System.out.println("The eqn has no real rooots");
        }
    }
    
}
