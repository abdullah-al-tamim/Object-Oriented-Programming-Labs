/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtestu;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import static labtestu.LabtestU.creditlist;

abstract class ATMCard {

    private int cardnumber;
    private Calendar expirydate;
    private int cvc;
    private double limit;

    ATMCard() {

    }

    ATMCard(int cnum, int cvc, double limit) {
        cardnumber = cnum;
        this.cvc = cvc;
        this.limit = limit;
        expirydate = Calendar.getInstance();
        expirydate.add(Calendar.YEAR, 3);
    }

    public int getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(int cardnumber) {
        this.cardnumber = cardnumber;
    }

    public Calendar getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(Calendar expirydate) {
        this.expirydate = expirydate;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
    public abstract void searchCardInfo(ATMCard c);
    public abstract double limit();

    public abstract String tostring();
}
//###############################################################################################

class DebitCard extends ATMCard {

    private int accbalance;

    DebitCard(int cnum, int cvc, Double limit, int accbalance) {
        super(cnum, cvc, limit);
        this.accbalance = accbalance;
        setExpirydate(Calendar.getInstance());
        getExpirydate().add(Calendar.YEAR, 4);
    }

    public void setAccbalance(int accbalance) {
        this.accbalance = accbalance;
    }

    public int getAccbalance() {
        return accbalance;
    }

    @Override
    public String tostring() {
        return "DebitCard{CardNum:" + getCardnumber() + ", ExpiryDate:" + getExpirydate().getTime() + ", cvc:" + getCvc() + " , lim:" + getLimit() + ", Account Balance" + accbalance + "}";
    }

    @Override
    public double limit() {
        return accbalance;
    }

    @Override
    public void searchCardInfo(ATMCard c) {
        System.out.println(c.tostring());
    }
}
//***************************************************************************************

class CreditCard extends ATMCard {

    private double salary, expense;
    ArrayList<Bonus> bonuslist = new ArrayList<Bonus>();

    public CreditCard() {
    }

    public CreditCard(double salary, double expense, int cnum, int cvc, double limit) {
        super(cnum, cvc, limit);
        this.salary = salary;

        this.expense = expense;
        setExpirydate(Calendar.getInstance());
        getExpirydate().add(Calendar.YEAR, 5);
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

    public ArrayList<Bonus> getBonuslist() {
        return bonuslist;
    }

    public void setBonuslist(ArrayList<Bonus> bonuslist) {
        this.bonuslist = bonuslist;
    }

    public boolean isBonusavailable() {
        if (salary > 60000) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double limit() {
        if (salary > 60000) {
            return salary + expense + 100;
        } else {
            return salary + expense;
        }
    }

    @Override
    public String tostring() {
        return ("CreditCard{CardNum:" + getCardnumber() + ", ExpiryDate:" + getExpirydate().getTime() + ", cvc:" + getCvc() + ", limit:" + limit()+ ", salary: " + salary + ", Expense: " + expense);
    }

    public boolean compare(ATMCard c1, ATMCard c2) {
        if (c1.getLimit() == c2.getLimit()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void searchCardInfo(ATMCard c) {
        System.out.println(c.tostring());
        if (isBonusavailable()) {
            System.out.println("Bonus available!");
        } else {
            System.out.println("BOnus is not available");
        }
    }

}
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

class Bonus {

    private String bonustype;
    private double amount;

    public Bonus(String bonustype, double amount) {
        this.bonustype = bonustype;
        this.amount = amount;
    }

    public String getBonustype() {
        return bonustype;
    }

    public void setBonustype(String bonustype) {
        this.bonustype = bonustype;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}

public class LabtestU {

    static ArrayList<ATMCard> creditlist = new ArrayList<ATMCard>();
    static ArrayList<ATMCard> debitlist = new ArrayList<ATMCard>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1. Press 1 for debit card\n"
                    + "2. Press 2 for credit card\n3. exit\n4. searchCardInfo\n5. compare");
            System.out.print("Choose one: ");
            Scanner sc = new Scanner(System.in);
            int c1 = sc.nextInt();
            if (c1 == 1) {
                System.out.print("Enter cardnumber: ");
                int cnum = sc.nextInt();
                System.out.print("ENter cvc: ");
                int cvc = sc.nextInt();
                System.out.print("Enter limit: ");
                double limit = sc.nextDouble();
                System.out.print("Enter account balance: ");
                int accb = sc.nextInt();
                ATMCard dc1 = new DebitCard(cnum, cvc, limit, accb);
                debitlist.add(dc1);
                System.out.println(debitlist.size());
                System.out.println("Debit card created.");
            } else if (c1 == 2) {
                System.out.print("Enter cardnumber");
                int cnum = sc.nextInt();
                System.out.print("ENter cvc: ");
                int cvc = sc.nextInt();
                System.out.print("Enter limit: ");
                double limit = sc.nextDouble();
                System.out.print("Enter salary: ");;
                double salary = sc.nextDouble();

                System.out.print("Enter expense: ");;
                double expense = sc.nextDouble();
                ATMCard cc1 = new CreditCard(salary, expense, cnum, cvc, limit);
                creditlist.add(cc1);
                System.out.println("Credit card created.");

            } else if (c1 == 3) {
                break;
            } else if (c1 == 4) {
                System.out.print("Enter card: ");
                int s = sc.nextInt();
                for (int i = 0; i < creditlist.size(); i++) {
                    if (s == creditlist.get(i).getCardnumber()) {
                        System.out.println("hello");
                        ATMCard c = new CreditCard();
                        creditlist.get(i).searchCardInfo(creditlist.get(i));
                    }

                }
                for (int i = 0; i < debitlist.size(); i++) {
                    if (s == debitlist.get(i).getCardnumber()) {
                        debitlist.get(i).searchCardInfo(debitlist.get(i));
                    }

                }
            } else if (c1 == 5) {
                System.out.print("Enter 1st object index to compare: ");
                int ob1 = sc.nextInt();
                System.out.print("Enter 2nd object index to compare: ");
                int ob2 = sc.nextInt();
                CreditCard c = new CreditCard();
                System.out.println(c.compare(creditlist.get(ob1), creditlist.get(ob2)));
            }
        }
    }

}
