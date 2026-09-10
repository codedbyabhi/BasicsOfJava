package com.nit.encapsulationPrograms;

import java.util.Scanner;

public class PrtTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount3 b = new BankAccount3();
		System.out.println("Enter Account Number: ");
		long accountNumber = sc.nextLong();
		System.out.println("Enter AccountHolder name: ");
		sc.nextLine();
		String accountHolderName =sc.nextLine();
		System.out.println("Enter Balance: ");
		double balance = sc.nextDouble();
		System.out.println("Enter deposit amount: ");
		double amount = sc.nextDouble();
		b.setAccountNumber(accountNumber);
		b.setAccountHolderName(accountHolderName);
		b.diposit(amount);
		
		System.out.println("Account Number: "+b.getAccountNumber());
		System.out.println("Account Holder: "+b.getAccountHolderName());
		System.out.println("Balance: "+b.getBalance());
	}
}

class BankAccount3 {
	private long accountNumber;
	private String accountHolderName;
	private double balance;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		if (accountNumber > 0) {
			this.accountNumber = accountNumber;
		} else {
			this.accountNumber = 0;
		}
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}

	public double diposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
		return balance;
	}

}