 
package labexam;
 
public class Bonus {
    private String bounsType = "Birth bonus!";
    private double amount = 100.0;
    
    public Bonus()
    {
        
    }
        
    public Bonus(String bounsType, double amount) {
        this.bounsType = bounsType;
        this.amount = amount;
    }

    public String getBounsType() {
        return bounsType;
    }

    public void setBounsType(String bounsType) {
        this.bounsType = bounsType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public void disPlay()
    {
        System.out.println("Bonus Type: "+bounsType+
                ", Amount: "+amount+" $");
    }
}
