//Account.java attribute for storing the account balance.
public class Account {
    private double balance;

//Constructor that gets the initial account balance
    public Account(double initialBalance){
if(initialBalance >= 0){
    this.balance = initialBalance;
}else {
    System.out.print("Error, initial balance can not be negative.");
}
    }

//Method to get the current account balance.
    public double getBalance(){
        return this.balance;
    }

//Method to deposit an amount into the account.
    public void deposit(double amount){
        if (amount > 0) {
this.balance += amount;
        }else {
            System.out.print("Error, deposit amount must be positive.");
        }
    }

//Method to withdraw an amount from the account.
    public void withdraw(double amount){
        if(amount > 0 && amount <= this.balance){
            this.balance -= amount;
        }else{
            System.out.print("Error, invalid withdrawal amount.");
        }
    }

//Method to transfer an amount out of the account.
    public void transfer(Account toAccount, double amount){
        if(amount > 0 && amount <= this.balance){
            this.balance -= amount;
            toAccount.deposit(amount);
        }else{
            System.out.print("Error, invalid transfer amount.");
        }
    }
}