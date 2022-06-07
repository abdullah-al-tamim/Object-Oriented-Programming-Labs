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
public class CheckingAccount extends Account{
    private static double  overdraftLimit;
    
    public CheckingAccount(int id, double balance, double annualInterestRate, double overdraftLimit) {
        super(id, balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
        setDateCreated(Calendar.getInstance());
    }

    public static double getOverdraftLimit() {
        return overdraftLimit;
    }

    public static void setOverdraftLimit(double overdraftLimit) {
        CheckingAccount.overdraftLimit = overdraftLimit;
    }

    
    @Override
    public void withdraw(double amount){
        if (amount>overdraftLimit) {
            setBalance(getBalance()-amount);
        }
        else{
            System.out.println("Withdrawal amount crosses overdraft limit!");
        }
    }
    @Override
    public void deposit(double amount){
            setBalance(getBalance()+amount);
    }
    
    @Override
    public void display(){
        System.out.println("This is a checking account: ");
                    System.out.println("Account ID: "+getId());
                    System.out.println("Date Created: "+getDateCreated().getTime());
                    System.out.println("Current Balance: "+getBalance());
                    System.out.println("Annual Interest Rate: "+getAnnualInterestRate());
                    System.out.println("Monthly interest amount: "+getMonthlyInterestAmount());
                    System.out.println("Overdraft Limit: "+getOverdraftLimit());
    }
}
