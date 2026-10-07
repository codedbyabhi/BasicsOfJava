package com.nit.exceptionPrograms;

import java.util.Scanner;

public class Qsn {
	public static void main(String[] args) throws IncompatibleClassChangeError {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter AccHolder name, initial balance and withdrawal amount : ");
		String accountName = sc.nextLine();
		double balance = sc.nextDouble();
		double amount = sc.nextDouble();

		BankAccount ba = new BankAccount(accountName, balance);
		try {
			ba.withdraw(amount);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		System.out.printf("Remining Balance: %.2f", ba.getBalance());

	}
}

class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException(String errorMessage) {
		super(errorMessage);
	}

}

class BankAccount {
	private String accountName;
	private double balance;

	public BankAccount(String accountNumber, double balance) {

		this.accountName = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountName;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountName = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) throws InsufficientBalanceException {
		if (amount <= 0) {
			throw new InsufficientBalanceException("Invalid withdrawal amount");
		}
		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance");
		} else {
			balance -= amount;
			System.out.println("Withdraw Successfull");
		}
	}

}
