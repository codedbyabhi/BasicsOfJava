package com.nit.arrayPrograms;

import java.util.Scanner;

public class ProductManage {
	static Product[] a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Products : ");
		int size = sc.nextInt();
		a = new Product[size];

		for (int i = 0; i < a.length; i++) {

			System.out.println("Enter Product Name, Product Id, Category, Price : " + (i + 1));
			String productName = sc.nextLine();
			sc.nextLine();
			int productId = sc.nextInt();
			sc.nextLine();
			String category = sc.nextLine();
			double price = sc.nextDouble();

			a[i] = new Product(productName, productId, category, price);
			sc.nextLine();
		}
		System.out.println("======================================");
		System.out.println("Enter 1 for Product belongs to given Category.");
		System.out.println("Enter 2 for Product price is less than given price.");
		System.out.println("Enter 3 for Average Price.");
		System.out.println("======================================");

		System.out.println("Enter the Choice : ");
		int choice = sc.nextInt();
		switch (choice) {

		case 1 -> {
			System.out.println("Enter the Product name : ");
			String productName = sc.nextLine();
			proBelongToGivenCate(productName);
		}
		case 2 -> {
			System.out.println("Enter the target Price : ");
			double price = sc.nextDouble();
			proGreaterThanGivenPrice(price);
		}
		case 3 -> {
			avgPrice();
		}
		default -> {
			System.out.println("Enter valid Choice : ");
		}
		}

	}

	public static void proBelongToGivenCate(String category) {
		for (Product e : a) {
			if (e.category.equals(category)) {
				System.out.println("==================================");
				e.displayDetails();
			}
		}
	}

	public static void proGreaterThanGivenPrice(double price) {
		for (Product e : a) {
			if (e.price < price) {
				System.out.println("==============================");
				e.displayDetails();
			}
		}
	}

	public static void avgPrice() {
		double sum = 0;

		for (Product e : a) {
			sum += e.price;
		}
		System.out.println("Average Price = " + (sum / a.length));
	}

}

class Product {
	public String productName;
	public int productId;
	public String category;
	public double price;

	public Product(String productName, int productId, String category, double price) {
		this.productName = productName;
		this.productId = productId;
		this.category = category;
		this.price = price;
	}

	public void displayDetails() {
		System.out.println("Product Name : " + productName);
		System.out.println("Product Id : " + productId);
		System.out.println("Product Category : " + category);
		System.out.println("Product Price : " + price);
	}

}
