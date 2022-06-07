
package atmmain;


public class Bonus {
    private String bonustype;
    private double amount;

    public Bonus() {
    }

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
    
    public void display(){
        System.out.println("Bonus type: "+bonustype+", Amount: "+amount);
    }
}
