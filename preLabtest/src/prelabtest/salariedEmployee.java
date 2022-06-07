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
public class salariedEmployee extends Employee{
    private double weeklysalary;

    public salariedEmployee(double weeklysalary, String firstname, String lastname, String securityNumber, Date birthdate) {
        super(firstname, lastname, securityNumber, birthdate);
        this.weeklysalary = weeklysalary;
    }

    public double getWeeklysalary() {
        return weeklysalary;
    }

    public void setWeeklysalary(double weeklysalary) {
        this.weeklysalary = weeklysalary;
    }

    @Override
    public String toString() {
        return "salariedEmployee{ first name: "+getFirstname()+", last name: "+getLastname()+", security num: "+getSecurityNumber()+", birthdate: "+getBirthdate() + ", weeklysalary=" + weeklysalary + '}';
    }
    
    
    

    @Override
    public double earnings() {
        return weeklysalary*4;
    }
    
}
