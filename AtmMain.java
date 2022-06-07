
package atmmain;

import java.util.ArrayList;
import java.util.Scanner;


public class AtmMain {

    
    public static void main(String[] args) {
        
        ArrayList<AtmCard> debit = new ArrayList<>();
        ArrayList<AtmCard> credit = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        while (true) {
            
            System.out.println("1. Press 1 for debit card");
            System.out.println("2. Press 2 for credit card");
            System.out.println("3. Search card information");
            System.out.println("4. Compare two credit card");
            System.out.println("5. Exit");
            System.out.print("Select a option: ");
            
            int option = input.nextInt();
            
            if (option == 1) {
                //int cnum, int cvc, double limit, int accbalance, int ed
                System.out.print("Enter Card number: ");
                int cnum = input.nextInt();
                System.out.print("Enter Cvc: ");
                int cvc = input.nextInt();
                System.out.print("Enter account balance: ");
                int accbalance = input.nextInt();                          
                AtmCard ac = new DebitCard(cnum, cvc, 0, accbalance, 2025);  //polimorfigim             
                debit.add(ac);
            } else if (option == 2) {
                //int cnum, int cvc, double limit, int ed, d salary, d, exp
                System.out.print("Enter Card number: ");
                int cnum = input.nextInt();
                System.out.print("Enter Cvc: ");
                int cvc = input.nextInt();                             
                System.out.print("Enter salary: ");
                int sal = input.nextInt();
                System.out.print("Enter expenses: ");
                int exp = input.nextInt();
                AtmCard ac = new CreditCard(cnum, cvc, 0, 2025, sal, exp);
                credit.add(ac);
            } else if (option == 3) {
                System.out.print("Enter card number: ");
                int cnum = input.nextInt();
                boolean b = true;
                for (int i = 0; i < credit.size(); i++) {
                    if (credit.get(i).getCardNumber() == cnum) {
                        credit.get(i).searchCardInformation(credit.get(i));
                        b = false;
                        break;
                    }
                }
                if (b) {
                    for (int i = 0; i < debit.size(); i++) {
                        if (debit.get(i).getCardNumber() == cnum) {
                            debit.get(i).searchCardInformation(debit.get(i));
                            b = false;
                            break;
                        }
                    }
                }
                if (b) {
                    System.out.println("No card found.");
                }
            } else if (option == 4) {
                System.out.print("Enter credit card index: ");
                int i1 = input.nextInt();
                System.out.print("Enter credit card index: ");
                int i2 = input.nextInt();
                CreditCard c = new CreditCard();
                System.out.println(c.compareTo(credit.get(i1), credit.get(i2)));
            } else if (option == 5) {
                break;
            } else {
                System.out.println("Invalid option.");
            }


        }
    }
            
        
    
    
}
