package com.nit.exceptionPrograms;

import java.util.Scanner;

public class ProductSelectionUsingAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product: ");
		String product[] = new String[4];

		for (int i = 0; i < product.length; i++) {
			product[i] = sc.nextLine();
		}
		int index = sc.nextInt();

		ProductCatalog pc = new ProductCatalog(product);
		try {
			pc.displayProduct(index);
		} catch (InvalidProductIndexException e) {
			System.out.println(e.getMessage());
		}
	}
}

class InvalidProductIndexException extends Exception {

	public InvalidProductIndexException(String errorMessage) {
		super(errorMessage);
	}
}

class ProductCatalog {
	private String product[];

	public ProductCatalog(String[] product) {
		this.product = product;
	}

	public String[] getProduct() {
		return product;
	}

	public void setProduct(String[] product) {
		this.product = product;
	}

	public void displayProduct(int index) throws InvalidProductIndexException {
		if (index < 0 || index > 3) {
			throw new InvalidProductIndexException("Invalid product index");
		} else {
			System.out.println("Selected Product: " + product[index]);
		}
	}
}