package com.nit.threadPrograms;

public class BankAccountDepositUsingMultipleThreads {
	public static void main(String[] args) throws InterruptedException {
		BankAccount b = new BankAccount();
		CustomerOne t1 = new CustomerOne(b);
		t1.setName("Ramesh");
		CustomerTwo t2 = new CustomerTwo(b);
		t2.setName("Sharmila");
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final balance is : "+b.balance);
	}
}

class BankAccount {
	public double balance = 1000;

	public synchronized void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit of " + amount + " is done successfully");
	}
}

class CustomerOne extends Thread {
	public BankAccount ba;

	public CustomerOne(BankAccount ba) {
		this.ba = ba;
	}

	public void run() {
		ba.deposit(500);
	}
}

class CustomerTwo extends Thread {
	public BankAccount ba;

	public CustomerTwo(BankAccount ba) {
		this.ba = ba;
	}

	public void run() {
		ba.deposit(700);
	}
}