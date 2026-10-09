package com.nit.exceptionPrograms;

import java.util.Scanner;

import javax.naming.InsufficientResourcesException;

public class BankingWithdrawalPropagation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double balance = sc.nextDouble();
		double amount = sc.nextDouble();
		
		Bank b = new Bank(balance, amount);
		
		try {
			b.validate();
		}
		catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
			
		}
		
	}
}

class Bank {
	double balance;
	double amount;

	public Bank(double balance, double amount) {
		this.balance = balance;
		this.amount = amount;
	}

	void validate() throws InsufficientBalanceException {
		process();
	}

	void process() throws InsufficientBalanceException {
		debit();
	}

	void debit() throws InsufficientBalanceException {
		if (amount > balance) {
			throw new InsufficientBalanceException("Error: Insufficient balance");
		}
		System.out.println("Withdrawal successful");
	}
}

class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException(String errorMessage) {
		super(errorMessage);
	}
}