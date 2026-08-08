package com.nit.forLoopPrograms;

import java.util.Scanner;

public class CheckNumIsPrimeOrNot {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		boolean isNPrime = true;
		for (int i = 2; i < num; i++) {

			if (num % i == 0) {

				isNPrime = false;
				break;
			}

		}
		if (isNPrime && num > 1) {

			System.out.println("Prime Number");

		} else {

			System.out.println("Not a Prime Number");
		}
	}

}
