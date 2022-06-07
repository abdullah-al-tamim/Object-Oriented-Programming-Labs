/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_icecream_company;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class P1_icecream_company {
    
    /*input:
    mango zanzee 30
    malai igloo 15
    cone polar 50
    cup bloop 20
    chocobar pran 25
    */
    public static void searchByCompany(Icecream[] objIcecreams, String com_search){
        for (int i = 0; i < objIcecreams.length; i++) {
            //String s = objIcecreams[i].getIcecreamCompany();
            
            //System.out.println("");
            if ((objIcecreams[i].getIcecreamCompany().compareTo(com_search)) == 0) {
                System.out.print("Type: "+objIcecreams[i].getIcecreamType());
                System.out.print(", Company: "+objIcecreams[i].getIcecreamCompany());
                System.out.println(", Price: "+objIcecreams[i].getIcecreamPrice()+".");
            }
        }
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Icecream[] objIcecreams = new Icecream[5];
        System.out.println("Enter icecream type, company, and price: ");
        for (int i = 0; i < objIcecreams.length; i++) {
            String type = sc.next();
            String company = sc.next();
            double price = sc.nextDouble();
            objIcecreams[i] = new Icecream(type, company, price);
        }
//        toString function
        for (int i = 0; i < objIcecreams.length; i++) {
        System.out.println(objIcecreams[i].toString());
            
        }
        
//        equals function 
        if (objIcecreams[0].equals(objIcecreams[1])) {
            System.out.println("Prices of both icecreams are same.");
        }
        else{
            System.out.println("Prices are not same.");
        }
        
//        compareTo function
        int val = objIcecreams[0].comapreTo(objIcecreams[1]);
        if (val == 1) {
            System.out.println("Price of caller is higher");
        }
        else if (val == 0){
            System.out.println("Price of caller and callee objects are same");
        }
        else{
            System.out.println("Price of caller is lower");
        }
//        lab problem 1
        System.out.print("Enter a company name: ");
        String com_search = sc.next();
        searchByCompany(objIcecreams, com_search);
    }
    
}
