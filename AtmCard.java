
package atmmain;

import java.util.Calendar;


public abstract class AtmCard {
   private int cardNumber;
    private int cvc;
    private double limit;
    private int expireDate;
     

    public AtmCard() {
    }
    
    public AtmCard(int cnum, int cvc, double limit, int ed){
        cardNumber = cnum;
        this.cvc = cvc;
        this.limit = limit;
        expireDate = ed;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
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

    public int getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(int expireDate) {
        this.expireDate = expireDate;
    }

    public void searchCardInformation(AtmCard atmCard){

    }

    public abstract double limit();
    public abstract String tostring();
}
