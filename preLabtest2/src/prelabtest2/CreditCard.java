/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelabtest2;

/**
 *
 * @author Admin
 */
public class CreditCard extends ATMCard{
    private double salary, expense;

    public CreditCard(double salary, double expense, int cnum, int cvc, double limit) {
        super(cnum, cvc, limit);
        this.salary = salary;
        this.expense = expense;
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

    @Override
    public String toString() {
        return "CreditCard{" + "salary=" + salary + ", expense=" + expense + '}';
    }

    @Override
    public double limit() {
        return salary+expense;
    }

    @Override
    public String tostring() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
