package com.nit.forLoopPrograms;

public class ProductNum1to5 {

	public static void main(String []args) {

		int product = 1;
		for (int i = 1; i <= 5; i++) {

			product = product * i;
		}

		System.out.println("Product is : " + product);
	}

}