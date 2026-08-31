package com.nit.templteMethodPattern;

public class Main01 {

}

abstract class ATM {
	//template method 
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