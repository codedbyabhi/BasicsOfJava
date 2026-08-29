package com.nit.hasArelationshipProgram;

public class AggregationDemo {
	public static void main(String[] args) {
		
		Customer c1 = new Customer("Mukesh","Saving", 4000);
		Customer c2 = new Customer("Kotti","Current", 7000);
		Customer c3 = new Customer("Sujit","Fixed deposit", 2000);
		
		Bank b = new Bank("SBI", "Navsari", c1, c2, c3);
		b.disply();
				
	}

}

class Bank {

	String name;
	String place;
	Customer c1;
	Customer c2;
	Customer c3;

	public Bank(String name, String place, Customer c1, Customer c2, Customer c3) {
		this.name = name;
		this.place = place;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
	}
	public void disply() {
		
		System.out.println(name);
		System.out.println(place);
		System.out.println("\n");
		System.out.println("C1 details");
		c1.display();
		System.out.println("\n");
		System.out.println("C2 details");
		c2.display();
		System.out.println("\n");
		System.out.println("C3 details");
		c3.display();
		System.out.println("\n");
		
	}

}

class Customer {
	String name;
	String accType;
	double balance;

	public Customer(String name, String accType, double balance) {

		this.name = name;
		this.accType = accType;
		this.balance = balance;
	}

	public void display() {

		System.out.println(name);
		System.out.println(accType);
		System.out.println(balance);
	}

}