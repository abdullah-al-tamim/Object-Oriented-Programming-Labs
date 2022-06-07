
package atmmain;

import java.util.ArrayList;
import java.util.Calendar;


public class CreditCard extends AtmCard {
    
   private double salary;
   private double expense;
   
   ArrayList<Bonus> bonus = new ArrayList<>();
   
    public CreditCard(){

    }

    public CreditCard(int cnum, int cvc, double limit, int ed, double sal, double exp) {
        super(cnum, cvc, limit, ed);
        salary = sal;
        if (salary > 60000) {
            salary += 100;
        }
        
        
        expense = exp;
        //getExpireDate(Calendar.YEAR, 5);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public void searchCardInformation(AtmCard c){
        System.out.println(c.tostring());
        isBonusAvailable();
    }

    public void isBonusAvailable(){
        if (salary > 60000) {
            System.out.println("Bonus available.");
        } else {
            System.out.println("No bonus available.");
        }
    }

    public boolean compareTo(AtmCard c1, AtmCard c2){
        if (c1.limit() == c2.limit()){
            return true;
        }
        return false;
    }

    public String tostring() {
        return "Card Number: " + getCardNumber() + " , cvc: " + getCvc() + " , Limit: " + limit() + " , Account Balance: " + salary + " Expiry Date: " + getExpireDate();
    }

    public double limit() {
        return salary + expense;
    }
    
}
