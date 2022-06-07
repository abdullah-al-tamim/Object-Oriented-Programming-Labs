 
package labexam;
 
public class HourlyEmployee extends Employee{
    private double wage;
    private double hour;
    
    public HourlyEmployee(String fName, String lName, String sNum, int birthMonth, double wage, double houre)
    {
        super(fName, lName, sNum, birthMonth);
        this.hour = hour;
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }
    
    @Override
    public String toString()
    {
        return "Employee name: "+getFirstName()+" "+getLastName()+
                " , Security number: " +getSecurityNumber()+
                " Birthday Month: "+getBirthDayMonth();
    }
}
