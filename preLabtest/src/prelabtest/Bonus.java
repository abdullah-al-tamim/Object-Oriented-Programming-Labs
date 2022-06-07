/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelabtest;

/**
 *
 * @author Admin
 */
public class Bonus {
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

    
    
    @Override
    public String toString() {
        return "Bonus{" + "bonustype=" + bonustype + ", amount=" + amount + '}';
    }
    
}
