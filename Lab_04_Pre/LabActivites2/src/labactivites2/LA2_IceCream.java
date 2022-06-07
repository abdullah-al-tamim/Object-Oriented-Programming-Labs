/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labactivites2;

/**
 *
 * @author Admin
 */
public class LA2_IceCream {
    private String icecreamType;
    private String icecreamCompany;
    private double icecreamPrice;

    public LA2_IceCream() {
        
    }

    public LA2_IceCream(String icecreamType, String icecreamCompany, double icecreamPrice) {
        this.icecreamType = icecreamType;
        this.icecreamCompany = icecreamCompany;
        this.icecreamPrice = icecreamPrice;
    }
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

    
    
    
//    toString
    public String toString(){
        return "Type: "+icecreamType+", Company:"+icecreamCompany+", Price:"+icecreamPrice;
    }
//    equals
    public boolean equals(LA2_IceCream objCallee){
        if (objCallee.icecreamPrice == icecreamPrice) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public int comapreTo(LA2_IceCream objCallee){
        if (objCallee.icecreamPrice < icecreamPrice) {
            return 1;
        }
        else if (objCallee.icecreamPrice == icecreamPrice){
            return 0;
        }
        else{
            return -1;
        }
    }
}
