package com.nit.encapsulationPrograms;

import java.util.Scanner;

public class PrtTask3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Product2 p = new Product2();
		
		System.out.println("Enter Product ID : ");
		int productId = sc.nextInt();
		System.out.println("Enter Product Name : ");
		sc.nextLine();
		String productName = sc.nextLine();
		System.out.println("Enter Price : ");
		double price = sc.nextDouble();
		System.out.println("Enter Discount : ");
		int discount = sc.nextInt();
		
		p.setProductId(productId);
		p.setProductName(productName);
		p.setPrice(price);
		
		p.applyDiscount(discount);
		
		System.out.println("Product ID: "+p.getProductId());
		System.out.println("Product Name: "+p.getProductName());
		System.out.println("Price: "+p.getPrice());
		System.out.println("Discount = "+discount+"%");
		
	}

}

class Product2 {
	private int productId;
	private String productName;
	private double price;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		if (productId > 0) {
			this.productId = productId;
		} else {
			this.productId = 0;
		}
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price >= 0) {
			this.price = price;
		}
	}

	public void applyDiscount(double percentage) {
		if (percentage > 0 && percentage < 100) {
			double discountAmount = price * percentage / 100;
			double newPrice = price - discountAmount;
			price = newPrice;
		}

	}

}