package com.nit.inheritanePrograms;

import java.util.Scanner;

public class Qsn02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name of the product : ");
		String name = sc.nextLine();
		System.out.println("Enter Price of the product : ");
		double price = sc.nextDouble();
		System.out.println("Enter Quantity of the product : ");
		double quantity = sc.nextDouble();
		System.out.println("Enter the Discount :");
		double discount = sc.nextDouble();

		DiscountProduct d = new DiscountProduct(name, price, quantity, discount);
		d.displayDetails();
	}
}

class Product {

	public String name;
	public double price;
	public double quantity;

	public Product(String name, double price, double quantity) {

		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public void displayDetails() {

		System.out.println("Product name : " + name);
		System.out.println("Price of the product : " + price);
		System.out.println("Quantity of the product : " + quantity);
		System.out.println("Total : " + calculateTotal());
	}

	public double calculateTotal() {
		return price * quantity;
	}
}

class DiscountProduct extends Product {

	public double discount;

	public DiscountProduct(String name, double price, double quantity, double discount) {
		super(name, price, quantity);
		this.discount = discount;
	}

	public void displayDetails() {
		super.displayDetails();

	}

	public double calculateTotal() {
		double total = super.calculateTotal();
		return total - ((total * discount) / 100);
	}
}