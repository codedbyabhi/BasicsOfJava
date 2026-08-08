package com.nit.whileLoopPrograms;

import java.util.Scanner;

public class ProductOfTwoDigit {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product : ");
		int n = sc.nextInt();
		int product = 1;
		
		while (n != 0) {

			int ld = n % 10;
			product = product * ld;
			n = n / 10;
		}

		System.out.println(product);
	}

}
