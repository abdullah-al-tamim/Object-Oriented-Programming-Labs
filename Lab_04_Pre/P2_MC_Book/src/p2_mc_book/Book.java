/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_mc_book;


public class Book {
     private int isbn, numOfPages, count=0;
     private String bookTitle;

    Book() {
        
    }

    Book(int isbn, String bookTitle, int numOfPages) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.numOfPages = numOfPages;
    }
//  getters

    public int getIsbn() {
        return isbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }
    
    public int getNumOfPages() {
        return numOfPages;
    }

    public int getCount() {
        return count;
    }
     
//    toString
    public String toString(){
        return "ISBN: "+isbn+", Title: "+bookTitle+", Page: "+numOfPages;
    }
//     compareTo
    int compareTo(int page){
        if (page < numOfPages){
            return 1;
        }
        else if (page == numOfPages) {
            return 0;
        }
        else{
            return -1;
        }
    }
     
}
