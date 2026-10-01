package com.nit.stringProgram;
import java.util.*;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String accountNumber1=sc.nextLine();
        String accountType1=sc.nextLine();
        String accountHolder1=sc.nextLine();
        double balance1 = sc.nextDouble();
        sc.nextLine();
        
        String accountNumber2=sc.nextLine();
        String accountType2=sc.nextLine();
        String accountHolder2=sc.nextLine();
        double balance2 = sc.nextDouble();
        sc.nextLine();
        
        if(balance1<0||0>balance2){
            System.out.println("Error: Balance must be non-negative");
            return;
        }
        BankAccount b1 = new BankAccount(accountNumber1, accountType1, accountHolder1, balance1);
        BankAccount b2 = new BankAccount(accountNumber2, accountType2, accountHolder2, balance2);

        if(b1.equals(b2)){
            System.out.println("Accounts are equal");
        }
        else{
            System.out.println("Accounts are not equal");

        }
    }
}
class BankAccount{
    public String accountNumber;
    public String accountType;
    public String accountHolder;
    public double balance;

        BankAccount(String accountNumber, String accountType, String accountHolder, double balance){
            this.accountNumber=accountNumber;
            this.accountType=accountType;
            this.accountHolder=accountHolder;
            this.balance=balance;
        }

        public boolean equals(Object obj){
            BankAccount b = (BankAccount) obj;

            return accountNumber.equals(b.accountNumber) && accountType.equals(b.accountType);
       
        }
}