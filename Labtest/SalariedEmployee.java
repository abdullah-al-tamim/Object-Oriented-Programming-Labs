 
package labexam;
 
public class SalariedEmployee extends Employee{
    private double weeklySalary;
    
    public SalariedEmployee(String fName, String lName, String sNum,int birthMonth, double weekSal )
    {
        super(fName, lName, sNum, birthMonth);
        weeklySalary = weekSal;
    }
    
//    public boolean equalBirth(int birthMonth)
//    {
//        if(currentMonth == birthMonth) return true;
//        
//        return false;
//    }
    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    
    @Override
    public String toString()
    {
        return "Employee name: "+ getFirstName()+" "+ getLastName()+ 
                " , Security number: " +getSecurityNumber()+
                " , Birthday Month: " + getBirthDayMonth();
    }
}
