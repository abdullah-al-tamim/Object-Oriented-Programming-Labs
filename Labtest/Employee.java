
package labexam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    private String firstName;
    private String lastName;
    private String securityNumber;
    private int birthDayMonth;
    private double totalSalary;
    
    Date currentDate = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM");
    int currentMonth = Integer.parseInt(dateFormat.format(currentDate));
    
    public Employee(String firstName, String lastName, String SecurityNumber, int birthDayMonth)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.securityNumber = securityNumber;
        this.birthDayMonth = birthDayMonth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecurityNumber() {
        return securityNumber;
    }

    public void setSecurityNumber(String securityNumber) {
        this.securityNumber = securityNumber;
    }

    public int getBirthDayMonth() {
        return birthDayMonth;
    }

    public void setBirthDayMonth(int birthDayMonth) {
        this.birthDayMonth = birthDayMonth;
    }
    
    public boolean isBirthMonth(int month){
        return currentMonth == month;
    }
    
    public static boolean compareTo(Employee e1, Employee e2)
    {
        return e1.totalSalary == e2.totalSalary;
    }
    
    public double earnings(double wSalary, int bouns)
    {
        totalSalary = wSalary * 4 + bouns;
        return totalSalary;
    }
    
    public double earnings(double wage, double hour)
    {
        return totalSalary = wage * hour;
    }
    
    @Override
    public String toString()
    {
        return "Employee name: "+firstName+" "+lastName+ 
                " , Security number: " +securityNumber + 
                " , Birthday Month: " +birthDayMonth;
    }
}
