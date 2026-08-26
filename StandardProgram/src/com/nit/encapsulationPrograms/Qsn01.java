package com.nit.encapsulationPrograms;

import java.util.Scanner;

public class Qsn01 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("AccNo & Balance : ");
	String accountNumber = sc.nextLine();
	double balance = sc.nextDouble();
	System.out.println("Enter amount to deposit : ");
	double deposit = sc.nextDouble();
	System.out.println("Enter amount to withdraw :");
	double withdraw = sc.nextDouble();
	MobileApp acc = new MobileApp(accountNumber, balance);
	acc.deposit(deposit);
	acc.withdraw(withdraw);
	System.out.println("Final available balance : "+acc.getBalance());
	
}

}
class BankAccount {

	private String accountNumber;
	private double balance;

	public BankAccount(String accountNumber, double balance) {

		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposit(double amount) {

		if (amount > 0) {

			balance += amount;
			System.out.println("Amount of " + amount + "is been deposited...!");
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {

			balance -= amount;
			System.out.println("Withdrawl of " + amount + "is dome successfully...!");
		} else {
			System.out.println("Insufficient Balance ");
		}

	}

	public double getBalance() {

		return balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

}

class MobileApp extends BankAccount {

	public MobileApp(String accountNumber, double balance) {
		
		super(accountNumber, balance);

	}
	public void withdraw(double amount) {
		
		if(amount>25000) {
			System.out.println("Daily limit is exceeded...!");
		}
		else {
			super.withdraw(amount);
		}
		
	}

} 
