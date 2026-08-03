package com.nit.forLoopPrograms;

import java.util.Scanner;

public class FactorialOfGivenNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();

		long factorial = 1;
		for (int i = num; i >= 1; i--) {

			factorial *= i;
		}
		System.out.println("Factorial of num is :" + factorial);

	}
}
