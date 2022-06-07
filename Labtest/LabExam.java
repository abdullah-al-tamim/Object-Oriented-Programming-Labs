
package labexam;

import java.util.ArrayList;
import java.util.Scanner;

public class LabExam {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Bonus bonus = new Bonus();
        
        ArrayList<Employee> salariedEmployees = new ArrayList<>();
        ArrayList<Employee> hourlyEmployees = new ArrayList<>();
        ArrayList<Bonus> bonusList = new ArrayList<>();
        
        while(true)
        {
            System.out.println("1. Press 1 for salaried employee.");
            System.out.println("2. Press 2 for hourly employee.");
            System.out.println("3. Search an employee bonus.");
            System.out.println("4. Compare two employees.");
            System.out.println("5. Exit.");
            System.out.print("Select a option: ");
            
            int option = input.nextInt();
            
            if(option == 1)
            {
                System.out.print("Enter first name: ");
                String fName = input.next();
                System.out.print("Enter last name: ");
                String lName = input.next();
                System.out.print("Enter security number: ");
                String sNum = input.next();
                System.out.print("Enter birthday month: ");
                int birthMonth = input.nextInt();
                System.out.print("Enter weekly salary: ");
                double weekSal = input.nextDouble();
                
                Employee ob = new SalariedEmployee(fName, lName, sNum, birthMonth, weekSal);
                
                salariedEmployees.add(ob);
                
                if(ob.isBirthMonth(birthMonth))
                {
                    bonus.disPlay();
                    System.out.println("Salary with bouns: "+ob.earnings(weekSal, 100));
                }else {
                    System.out.println("He is not eligible for Bonus!");
                    System.out.println("Salary: "+ob.earnings(weekSal, 0));
                }
            }
            
            else if(option == 2){
                System.out.print("Enter first name: ");
                String fName = input.next();
                System.out.print("Enter last name: ");
                String lName = input.next();
                System.out.print("Enter security number: ");
                String sNum = input.next();
                System.out.print("Enter birthday month: ");
                int birthMonth = input.nextInt();
                System.out.print("Enter wage: ");
                double wage = input.nextDouble();
                System.out.print("Enter hour: ");
                double hour = input.nextDouble();
               
                
                Employee ob = new HourlyEmployee(fName, lName, sNum, birthMonth, wage, hour);
                
                hourlyEmployees.add(ob);
                
                System.out.println("Salary: " +ob.earnings(wage, hour));
            }
            
            else if(option == 3)
            {
                System.out.print("Enter security number: ");
                String sNum = null;
                        sNum = input.next();
                boolean b = false;
                
                //in array list we put list of object
                //object = SalariedEmployees.get(i)
                //boject.isBirthMonth(month)
                // month = object.getBirthDayMonth
                
                for (int i = 0; i < salariedEmployees.size(); i++) {
                   
                    if (salariedEmployees.get(i).isBirthMonth(salariedEmployees.get(i).getBirthDayMonth()) && salariedEmployees.get(i).getSecurityNumber().equals(sNum)) {
                        System.out.println(salariedEmployees.get(i));
                        b = true;
                        break;
                    }
                }
                
                if(b){
                    System.out.println("Bonus available.");
                }else {
                    System.out.println("No bonus available.");
                }
            }
            
            
            else if(option == 4)
            {
                System.out.print("Enter 1st object index to compare: ");
                int ob1 = input.nextInt();
                System.out.print("Enter 2nd object index to compare: ");
                int ob2 = input.nextInt();
                
                System.out.println(Employee.compareTo(salariedEmployees.get(ob1), salariedEmployees.get(ob2)));
                
            }
            
            else if(option == 5)
            {
                break;
            }
            
            else {
                System.out.println("Invalid option! Try again.");
            }
        }
        
        
    }
    
}
