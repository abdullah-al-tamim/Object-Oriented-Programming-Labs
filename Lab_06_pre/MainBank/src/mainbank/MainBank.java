/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainbank;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MainBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Account acc = new Account(1122, 20000, 4.5);
        acc.withdraw(2500);
        acc.deposit(3000);
        acc.display();
//        ArrayLIst
        ArrayList<Account> accountsList = new ArrayList<Account>();
        boolean flag = true;
        while (flag==true) {            
        System.out.println("Press (1) for creating a Checking Account\n" +
                            "Press (2) for creating a Savings Account\nPress(3) to exit");
            int num = sc.nextInt();
            switch(num){
                case 1:
                    Account checkingAccount = new CheckingAccount(1234, 2000, 3.0, -10000);
                    accountsList.add(checkingAccount);
                    System.out.print("checking Account created! Enter withdraw amount: ");
                    checkingAccount.withdraw(sc.nextDouble());
                    System.out.print("Enter deposit amount: ");
                    checkingAccount.deposit(sc.nextDouble());
                    checkingAccount.display();
                    break;
                case 2:
                    Account savingsAccount = new SavingsAccount(1234567887654321l, 2345, 20000, 3.5);
                    accountsList.add(savingsAccount);
                    System.out.print("Savings Account created! Enter withdraw amount: ");
                    savingsAccount.withdraw(sc.nextInt());
                    System.out.print("Enter deposit amount: ");
                    savingsAccount.deposit(sc.nextInt());
                    savingsAccount.display();
                    break;
                case 3:
                    flag=false;
                    break;
                    
            }
        }
       
        
    }
    
}
