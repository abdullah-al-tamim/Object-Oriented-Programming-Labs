/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labactivities1;

/**
 *
 * @author Admin
 */
public class LA1_IceCream_class {
    private String icecreamType;
    private String icecreamCompany;
    private double icecreamPrice;

    public LA1_IceCream_class() {
        
    }

    /*public LA1_IceCream_class(String icecreamType, String icecreamCompany, double icecreamPrice) {
        this.icecreamType = icecreamType;
        this.icecreamCompany = icecreamCompany;
        this.icecreamPrice = icecreamPrice;
    }*/
//C.  getters and setters
    public String getIcecreamType() {
        return icecreamType;
    }

    public String getIcecreamCompany() {
        return icecreamCompany;
    }

    public double getIcecreamPrice() {
        return icecreamPrice;
    }

    public void setIcecreamType(String icecreamType) {
        this.icecreamType = icecreamType;
    }

    public void setIcecreamCompany(String icecreamCompany) {
        this.icecreamCompany = icecreamCompany;
    }

    public void setIcecreamPrice(double icecreamPrice) {
        this.icecreamPrice = icecreamPrice;
    }
    
    
//    toString
    public String toString(){
        return "Type: "+icecreamType+", Company:"+icecreamCompany+", Price:"+icecreamPrice;
    }
//    equals
    public boolean equals(LA1_IceCream_class ice2){
        if (ice2.icecreamPrice == icecreamPrice) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public int comapreTo(LA1_IceCream_class ice2){
        if (ice2.icecreamPrice < icecreamPrice) {
            return 1;
        }
        else if (ice2.icecreamPrice == icecreamPrice){
            return 0;
        }
        else{
            return -1;
        }
    }
}
