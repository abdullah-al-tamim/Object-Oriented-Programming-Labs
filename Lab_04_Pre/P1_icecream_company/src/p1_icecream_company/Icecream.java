/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_icecream_company;

/**
 *
 * @author Admin
 */
public class Icecream {
    private String icecreamType;
    private String icecreamCompany;
    private double icecreamPrice;

    public Icecream() {
        
    }

    public Icecream(String icecreamType, String icecreamCompany, double icecreamPrice) {
        this.icecreamType = icecreamType;
        this.icecreamCompany = icecreamCompany;
        this.icecreamPrice = icecreamPrice;
    }

    public String getIcecreamType() {
        return icecreamType;
    }

    public String getIcecreamCompany() {
        return icecreamCompany;
    }

    public double getIcecreamPrice() {
        return icecreamPrice;
    }
    
    
    
    public String toString(){
        return "Type: "+icecreamType+", Company:"+icecreamCompany+", Price:"+icecreamPrice;
    }
    
    public boolean equals(Icecream objCallee){
        if (objCallee.icecreamPrice == icecreamPrice) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public int comapreTo(Icecream objCallee){
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
