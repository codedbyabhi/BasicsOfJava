package com.nit.exceptionPrograms;

import java.util.Scanner;

public class Qsn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	}
}

class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException(String errorMessage) {
		super(errorMessage);
	}

}

class BankAccount {
	private String accountNumber;
	private double balance;

	public BankAccount(String accountNumber, double balance) {

		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			throw new InsufficientBalanceException("Invalid withdrawal amount");
		}
		if (amount > getBalance()) {
			throw new InsufficientBalanceException("Insufficient balance");
		} else {
			balance -= amount;
			System.out.println("Withdraw Successfull");
		}
	}

}
