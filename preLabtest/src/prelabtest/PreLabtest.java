/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelabtest;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Admin
 */
public class PreLabtest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        int current = Calendar.getInstance().get(Calendar.MONTH);
        Employee e1 = new salariedEmployee(5000, "Tamim", "Abdullah", "1234", new Date(5));
        ArrayList<Employee> empList = new ArrayList<Employee>();
    }
    
}
