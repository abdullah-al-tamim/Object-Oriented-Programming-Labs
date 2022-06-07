
package atmmain;

import java.util.Calendar;

public class DebitCard extends AtmCard {
    
   private int accbalance;
    public DebitCard(int cnum, int cvc, double limit, int accbalance, int ed){
        super(cnum, cvc, limit, ed);
        this.accbalance = accbalance;
    }

    public int getAccbalance() {
        return accbalance;
    }

    public void setAccbalance(int accbalance) {
        this.accbalance = accbalance;
    }

    public void searchCardInformation(AtmCard d){
        System.out.println(d.tostring());
        isBonusAvailable();
    }

    public void isBonusAvailable(){
        System.out.println("No bonus available.");
    }
    
    public String tostring(){
        return "Card Number: "+getCardNumber()+" , cvc: "+getCvc()+" , Limit: "+limit()+" , Account Balance: "+accbalance + " Expiry Date:" + getExpireDate();
    }
    
    public double limit(){
        return accbalance;
    }
    
}
