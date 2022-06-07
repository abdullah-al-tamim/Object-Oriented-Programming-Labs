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
public class DebitCard extends ATMCard{
    private int accbalance;
    DebitCard( int cnum, int cvc, Double limit, int accbalance ){
        super(cnum, cvc, limit);
        this.accbalance = accbalance;
    }

    public void setAccbalance(int accbalance) {
        this.accbalance = accbalance;
    }

    public int getAccbalance() {
        return accbalance;
    }

    @Override
    public String tostring() {
          return "DebitCard{CardNum:" + getCardnumber()+"ExpiryDate:" + getExpirydate()+"cvc:" + getCvc()+"lim:" + getLimit()+"Account Balance"+ accbalance+"}";
    }
    @Override
    public double limit() {
        return accbalance;
    }
}
