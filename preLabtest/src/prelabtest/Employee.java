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
//class Date{
//    
//}
public abstract class Employee {

    private String firstname, lastname, securityNumber;
    private Date birthdate;

    public Employee(String firstname, String lastname, String securityNumber, Date birthdate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.securityNumber = securityNumber;
        this.birthdate = birthdate;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSecurityNumber() {
        return securityNumber;
    }

    public void setSecurityNumber(String securityNumber) {
        this.securityNumber = securityNumber;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public abstract String toString();
    public abstract double earnings();
}
