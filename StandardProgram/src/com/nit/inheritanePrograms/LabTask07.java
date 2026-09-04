package com.nit.inheritanePrograms;
import java.util.*;

public class LabTask07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter : ");
		int choice = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();

		switch (choice) {

		case 1: {
			Customer5 c = new Customer5(name);
			c.display(choice);
			

		}
		case 2: {
			int loyaltyPoint = sc.nextInt();
			PremiumCustomer p = new PremiumCustomer(name, loyaltyPoint);

			p.display(choice);
			break;
		}
		case 3: {
			Customer5 c1 = new Customer5(name);
			c1.display(choice);
			
			int loyaltyPoint = sc.nextInt();
			PremiumCustomer p1 = new PremiumCustomer(name, loyaltyPoint);
			p1.display(choice);
			
			break;
		}
	  }
   }
}

class Customer5 {
	String name;

	Customer5(String name) {
		this.name = name;
	}

	void display(int choice) {
		System.out.println("Customer Details: ");
		System.out.println("Name: " + name);
	}
}

class PremiumCustomer extends Customer5 {

	int loyaltyPoint;

	PremiumCustomer(String name, int loyaltyPoint) {
		super(name);
		this.loyaltyPoint = loyaltyPoint;
	}

	void display(int choice) {
		System.out.println("Premium Customer Details:");
		System.out.println("Name: " + name);
		System.out.println("Loyalty Points: " + loyaltyPoint);

	}
}