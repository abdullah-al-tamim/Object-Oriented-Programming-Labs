/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labactivities1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LabActivities1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter icecream type, company, and price: ");
            String type1 = sc.next();
            String company1 = sc.next();
            double price1 = sc.nextDouble();
            LA1_IceCream_class ice1 = new LA1_IceCream_class();
            ice1.setIcecreamType(type1);
            ice1.setIcecreamCompany(company1);
            ice1.setIcecreamPrice(price1);
            //LA1_IceCream_class ice1 = new LA1_IceCream_class(type1, company1, price1);
            
            String type2 = sc.next();
            String company2 = sc.next();
            double price2 = sc.nextDouble();
            LA1_IceCream_class ice2 = new LA1_IceCream_class();
            ice1.setIcecreamType(type1);
            ice1.setIcecreamCompany(company1);
            ice1.setIcecreamPrice(price1);
            //LA1_IceCream_class ice2 = new LA1_IceCream_class(type1, company1, price1);
        
//        toString function
            System.out.println(ice1.toString());
            System.out.println(ice2.toString());
        
//        equals function 
        if (ice1.equals(ice2)) {
            System.out.println("True, prices of caller and callee are same");
        }
        else{
            System.out.println("False, prices of caller and callee are not same");
        }
        
//        compareTo function
        int val = ice1.comapreTo(ice2);
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
