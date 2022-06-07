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
public class HourlyEmployee extends Employee{
    private double wage, hour;

    public HourlyEmployee(double wage, double hour, String firstname, String lastname, String securityNumber, Date birthdate) {
        super(firstname, lastname, securityNumber, birthdate);
        this.wage = wage;
        this.hour = hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHour() {
        return hour;
    }

    public double getWage() {
        return wage;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{ first name: "+getFirstname()+", last name: "+getLastname()+", security num: "+getSecurityNumber()+", birthdate: "+getBirthdate()+ " wage=" + wage + ", hour=" + hour + '}';
    }

    @Override
    public double earnings() {
        return wage*hour;
    }
    
    
}
