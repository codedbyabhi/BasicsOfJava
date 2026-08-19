package com.nit.classObject;

import java.util.Scanner;

public class Qsn02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter AccountHolder Name : ");
		String accountHolderName = sc.nextLine();
		System.out.println("Enter AccountNumber : ");
		String accountNumber = sc.nextLine();
		System.out.println("Enter Balance : ");
		double balance = sc.nextDouble();
		
		BankAccount bank = new BankAccount(accountHolderName, accountNumber, balance);
		bank.deposit(500);
		bank.withdraw(1000);
		bank.displayBalance();
	
	}
}
class BankAccount {

	public String accountHolderName;
	public String accountNumber;
	public double balance;

	public BankAccount(String accountHolderName, String accountNumber, double balance) {

		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposit(double amount) {

		balance = balance + amount;
		System.out.println("Deposit of " + amount + "is done successfully......!");
	}

	public void withdraw(double amount) {
		if (balance <= amount) {

			System.out.println("insufficient balance...!");

		} else {

			balance = balance - amount;
			System.out.println("Amount  of " + amount + " is deducted successfully......!");
		}

	}
	public void displayBalance() {
		
		System.out.println("Current balance is : "+balance);
	}
}
