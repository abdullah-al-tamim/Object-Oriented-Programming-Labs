import java.util.Calendar;

public abstract class Account {
    private int id ;
    private double balance;
    private static double annualInterestRate;
    private Calendar dateCreated;
    public Account(){
        id=0;
        balance=0.0;
        annualInterestRate=0.0;
    }
    public Account(int id,double balance,double x){
        this.id=id;
        this.balance=balance;
        annualInterestRate=x;
       // dateCreated=Calendar.getInstance();
    }
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void getDateCreated() {
        dateCreated=Calendar.getInstance();
        System.out.println("Date:"+ dateCreated.getTime());
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double y) {
        annualInterestRate = y;
    }
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public abstract void withdraw(double amount);
    //{
       // balance -= amount;
  //  }

    public abstract void deposit(double amount);
    //{
        //balance += amount;
    //}
    public void display(){
        System.out.println(" id:"+id+" "+balance+" "+annualInterestRate);
    }

}
