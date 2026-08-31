package com.nit.templteMethodPattern;

public class Main01 {
	public static void main(String[] args) {

//		ATM op1 = new Withdraw();
//		op1.process();
		ATM op2 = new Deposit();
		op2.process();
//		ATM op3 = new CheckBalance();
//		op3.process();

	}
}

abstract class ATM {
	// template method
	final public void process() {
		insertCard();
		enterPIN();
		doTransaction();
		printRecept();
	}

	public void insertCard() {
		System.out.println("Card is inserted...");
	}

	public void enterPIN() {
		System.out.println("PIN entered successfull...");
	}

	public abstract void doTransaction();

	public void printRecept() {
		System.out.println("Recept is printed...");
	}
}

class Withdraw extends ATM {

	public void doTransaction() {

		System.out.println("Amount is withdrawn successfully...");

	}

}

class Deposit extends ATM {
	public void doTransaction() {

		System.out.println("Amount is deposited successfully...");
	}

}

class CheckBalance extends ATM {

	public void doTransaction() {
		System.out.println("Check the Available balance successfully...");
	}

}