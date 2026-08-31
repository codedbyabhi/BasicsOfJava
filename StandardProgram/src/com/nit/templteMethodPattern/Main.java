package com.nit.templteMethodPattern;

public class Main {
	public static void main(String[] args) {

		Drink d1 = new Tea();
		d1.makeDring();
		Drink d2 = new Coffee();
		d2.makeDring();
	}

}

abstract class Drink {

	// templte method provides a proper-order for method calls
	// templte method should be final.so that sub-classes wont override it.

	final void makeDring() {// its a templte mathod.
		boilWater();
		addMainItem();
		pourIntoCup();
		addExtra();
	}

	public abstract void boilWater();

	public abstract void addMainItem();

	public abstract void pourIntoCup();

	public abstract void addExtra();
}

class Tea extends Drink {

	public void boilWater() {

		System.out.println("Start boiling the Water");
	}

	public void addMainItem() {
		System.out.println("Add tea powder");

	}

	public void pourIntoCup() {

		System.out.println("Drink is poured into cup");
	}

	public void addExtra() {

		System.out.println("Adding sugar...");
	}

}

class Coffee extends Drink {

	public void boilWater() {

		System.out.println("Start boiling the Water");
	}

	public void addMainItem() {
		System.out.println("Add Coffee powder");

	}

	public void pourIntoCup() {

		System.out.println("Drink is poured into cup");
	}

	public void addExtra() {

		System.out.println("Adding sugar...");
	}

}
