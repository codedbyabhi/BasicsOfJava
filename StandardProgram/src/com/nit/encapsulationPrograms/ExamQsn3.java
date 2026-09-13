package com.nit.encapsulationPrograms;
import java.util.*;
class ExamQsn3{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double balance = sc.nextDouble();
        int choice = sc.nextInt();
        switch(choice){
            case 1 -> {
                BankAccount4 b1 = new BankAccount4(balance);
                double amount = sc.nextDouble();
                b1.deposit(amount);
            }
            case 2 -> {
                BankAccount4 b1 = new BankAccount4(balance);
                double amount = sc.nextDouble();
                b1.withdraw(amount);
            }
            case 3 -> {
                BankAccount4 b1 = new BankAccount4(balance);
                b1.getBalance();
            }

        }
    }

}
class BankAccount4{
    private double balance;

    BankAccount4(double balance){
        this.balance=balance;
    }
    public void deposit(double amount){
        if(amount>0&&amount<50000){
            balance=balance+amount;
            System.out.println("Deposit successful.");
            System.out.println("Balance: "+balance);
            
        }
        else{
            System.out.println("Invalid deposit amount.");
            System.out.println("Balance: "+balance);
        }
    }
    public void withdraw(double amount){
        if(amount>0){
            balance=balance-amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Balance: "+balance);
        }
        else{
            System.out.println("Invalid withdrawal amount.");
            System.out.println("Balance: "+balance);
        }
    }
    public double getBalance(){
        return balance;
    }
}