/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainbank;

import java.util.Calendar;

/**
 *
 * @author Admin
 */
public class Account {
    private int id=0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Calendar dateCreated;

    public Account() {
    }

    public Account(int id, double  balance, double annualInterestRate) {
        this.dateCreated = Calendar.getInstance();
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Calendar getDateCreated() {
        return dateCreated;
    }
    
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    public double getMonthlyInterestAmount(){
        return (balance*getMonthlyInterestRate())/100;
    }

    public void setDateCreated(Calendar dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    public void withdraw(double amount){
        if (amount<balance) {
            balance-=amount;
        }
        else{
            System.out.println("Inputted amount crossess total balance!");
        }
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void display(){
        System.out.println("Balance: "+getBalance()+", Monthly Interest: "
                + ""+getMonthlyInterestAmount()+", Date Created: "+getDateCreated().getTime());
    }
}
