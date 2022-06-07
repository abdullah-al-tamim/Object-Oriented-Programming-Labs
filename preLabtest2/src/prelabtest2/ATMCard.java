/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelabtest2;

import java.util.Calendar;

/**
 *
 * @author Admin
 */
public abstract class ATMCard {

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

    public abstract double limit();

    public abstract String tostring();
}
