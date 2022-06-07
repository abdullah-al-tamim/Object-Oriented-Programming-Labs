/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labactivites2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LabActivites2 {

    /*input:
    mango zanzee 30
    malai igloo 15
    cone polar 50
    cup bloop 20
    chocobar pran 25
    */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        LA2_IceCream[] objIcecreams = new LA2_IceCream[5];
        System.out.println("Enter icecream type, company, and price: ");
        for (int i = 0; i < objIcecreams.length; i++) {
            String type = sc.next();
            String company = sc.next();
            double price = sc.nextDouble();
            objIcecreams[i] = new LA2_IceCream(type, company, price);
        }
        
//        toString function
        for (int i = 0; i < objIcecreams.length; i++) {
            System.out.println(objIcecreams[i].toString());
            
        }
        
//        equals function 
        if (objIcecreams[0].equals(objIcecreams[1])) {
            System.out.println("True, Prices of caller and callee are same.");
        }
        else{
            System.out.println("False, Prices are not same.");
        }
        
//        compareTo function
        int val = objIcecreams[0].comapreTo(objIcecreams[1]);
        if (val == 1) {
            System.out.println("1, Price of caller is higher");
        }
        else if (val == 0){
            System.out.println("0, Price of caller and callee objects are same");
        }
        else{
            System.out.println("-1, Price of caller is lower");
        }
    }
    
}
