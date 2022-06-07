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
public class SavingsAccount extends Account{
    private long creditCardNum;
    private Calendar expiryDate;
     

    public SavingsAccount(long creditCardNum, int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
        this.creditCardNum = creditCardNum;
        expiryDate = Calendar.getInstance();
    }

    public long getCreditCardNum() {
        return creditCardNum;
    }

    public void setCreditCardNum(long creditCardNum) {
        this.creditCardNum = creditCardNum;
    }

    
    public Calendar getExpiryDate() {
        return expiryDate;
    }

    
    public double getCreditBalance(){
        return getBalance()*3;
    }
    
    @Override
    public void withdraw(double amount){
        if (amount<getBalance()) {
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
        System.out.println("This is a Saving Account");
        System.out.println("Account ID: "+getId());
        System.out.println("Balance: "+getBalance());
        System.out.println("Annual Interest Rate: "+getAnnualInterestRate());
        System.out.println("Monthly interest amount:"+getMonthlyInterestAmount());
        System.out.println("Credit card number:"+getCreditCardNum());
        expiryDate.add(Calendar.YEAR, 3);
        System.out.println("Card Expiry date:" + expiryDate.getTime());
        System.out.println("Credit balance:"+getCreditBalance());

    }
}
