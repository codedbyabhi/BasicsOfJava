package com.nit.forLoopPrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {

			if (num % i == 0) {

				sum = sum + i;

			}
		}
		System.out.println("Sum of factors is : " + sum);
		if (num == sum) {

			System.out.println("The Number is Perfect Number");
		} else {

			System.out.println("The Number is Not Perfect Number");
		}

	}

}