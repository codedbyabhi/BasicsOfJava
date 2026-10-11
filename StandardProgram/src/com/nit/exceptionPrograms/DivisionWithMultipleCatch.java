package com.nit.exceptionPrograms;

import java.util.*;

public class DivisionWithMultipleCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (b == 0)
				throw new ArithmeticException();

			System.out.println("Result: " + (a / b));

		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		} catch (InputMismatchException e) {
			System.out.println("Invalid input type");
		}
	}
}