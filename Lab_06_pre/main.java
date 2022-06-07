import java.util.ArrayList;
import java.util.*;

public class main {
    public static ArrayList<Account> obj = new ArrayList<Account>();
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 for creating a checking account ");
        System.out.println("Press 2 for creating a Saving Account");
        System.out.println("Press 3 for displaying");
        System.out.println("Press 4 for Exiting ");
        boolean r = false;
        while (true) {
            int p = input.nextInt();
            if (p == 1) {
                System.out.println("Enter an id:");
                int id = input.nextInt();
                System.out.println("Enter a balance:");
                double balance = input.nextDouble();
                System.out.println("Enter annual rate:");
                double an = input.nextDouble();
                System.out.println("Enter overdraftlimit:");
                double xp = input.nextDouble();
                Account obb = new CheckingAccount(id, balance, an, xp);
                System.out.println("Enter deposit amount:");
                int pp = input.nextInt();
                obb.deposit(pp);
                System.out.println("enter withdrawal amount:");
                int prp = input.nextInt();
                obb.withdraw(prp);
                obj.add(obb);
                System.out.println("Done");

            }
            else if (p == 2) {
                System.out.println("Enter an id: ");
                int idr = input.nextInt();
                System.out.println("Enter a balance:");
                double balanc = input.nextDouble();
                System.out.println("Enter annual rate:");
                double an = input.nextDouble();
                Account obb1 = new SavingAccount(idr, balanc, an);
                System.out.println("Enter deposit amount:");
                int xer = input.nextInt();
                obb1.deposit(xer);
                System.out.println("Enter withdrawal amount:");
                int to = input.nextInt();
                obb1.withdraw(to);
                obj.add(obb1);
                System.out.println("Done");
            }
            else if(p==3){
                for (int i = 0; i < obj.size(); i++) {
                    obj.get(i).display();
                }

           }

            if (p == 4) {
                r = false;
                break;
            }
        }
    }
}

