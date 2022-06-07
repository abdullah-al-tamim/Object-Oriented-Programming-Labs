/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_mc_book;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class P2_MC_Book {

    /*
1234 abcd 432
4321 ghtaf 500
5678 htio 599
     */
    public static void displayAll(Book[] obj){
        for (int i = 0; i < obj.length; i++) {
        System.out.println("Isbn: "+obj[i].getIsbn()+" Booktitle: "+obj[i].getBookTitle()+" NumberOfPage: "+obj[i].getNumOfPages());
            
        }
    }
//    isHeavier
    public static boolean isHeavier(int obj){
        if (obj>500) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Book[] objBook = new Book[3];
        System.out.println("Enter three ISBN, title, and page number: ");
        for (int i = 0; i < objBook.length; i++) {
             int isbn = sc.nextInt();
             String title = sc.next();
             int page = sc.nextInt();
             objBook[i] = new Book(isbn, title, page);
        }
//        displayAll
        displayAll(objBook);
//        toString
        System.out.println("Enter a index number to show book info: ");
        int num2= sc.nextInt();
        System.out.println(objBook[num2].toString());
//        compareTo function
        int num = objBook[1].compareTo(objBook[2].getNumOfPages());
        if (num == 1) {
            System.out.println("1");
        }
        else if (num == 0) {
            System.out.println("0");
        }
        else {
            System.out.println("-1");
        }
//       is heavier
        if (isHeavier(objBook[1].getNumOfPages())) {
            System.out.println("The second book has more than 500 pages.");
        }
        else{
            System.out.println("The second book has less than 500 pages.");
        }
    }
    
}
