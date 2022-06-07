import java.util.Calendar;
import java.util.Random;

public class SavingAccount extends Account {
    Calendar calendar;

    public SavingAccount(int id,double bala,double x ) {
        super(id,bala,x);
        calendar = Calendar.getInstance();
    }

    public double getCreditbalance(){
        double crebalance= getBalance()*3;
        return crebalance;

    }
    @Override
    public void display() {
        long Credit= (long) (999999999999999l+(Math.random()*9999999999999999l));
        System.out.println();
        System.out.println();
        System.out.println("This is a Saving Account");
        System.out.println("Account ID: "+getId());
        System.out.println("Balance: "+getBalance());
        System.out.println("Annual Interest Rate: "+getAnnualInterestRate());
        System.out.println("Monthly interest amount:"+getMonthlyInterest());
        System.out.println("Credit card number:"+Credit);
        calendar.add(Calendar.YEAR, 5);
        System.out.println("Card Expiry date:" + calendar.getTime());
        System.out.println("Credit balance:"+getCreditbalance());

    }
    public void withdraw(double amount){
        setBalance(getBalance()-amount);
    }
    public void deposit(double amount ){
        setBalance(getBalance()+amount);
    }

}
