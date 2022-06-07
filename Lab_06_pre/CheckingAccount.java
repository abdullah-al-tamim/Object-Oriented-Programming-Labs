import java.util.Calendar;

public class CheckingAccount extends Account {

     private double overdraftLimit;
     public Calendar dateCreate;
     public CheckingAccount(){

     }
     public CheckingAccount(int id, double balance,double interest,double x){
         super(id,balance,interest);
         overdraftLimit=x;
         dateCreate=Calendar.getInstance();


     }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverDraft(){
        return this.overdraftLimit;
    }
    @Override
    public void withdraw(double amount) {

        if (amount < overdraftLimit) {
            setBalance(getBalance()-amount);
        }
        else{
            System.out.println("You have crossed the limit");
        }
    }
    public void deposit(double amount){
         setBalance(getBalance()+amount);
    }
    public void display(){
        System.out.println("This is a checking account");
        System.out.println("Account ID: "+getId());
        System.out.println("Balance: "+getBalance());
        System.out.println("Annual Interest Rate: "+getAnnualInterestRate());
        System.out.println("Monthly interest amount: "+getMonthlyInterest());
        System.out.println("OverdraftLimit: "+overdraftLimit);
        getDateCreated();




    }


    }

