/*Write a Java program where you define a static method called sumOfDigits.
The method should take an integer as argument and should not return anything.
It should print the sum of digits of the number.*/
package com.nit.methodsandvariables;

public class MethodDemo14 {
	public static void main(String[] args) {

		sumOfDigits(123);
	}

	public static void sumOfDigits(int a) {
		int sum = 0;
		while (a != 0) {
			int ld = a % 10;
			sum = sum + ld;
			a = a / 10;
		}
		System.out.println(sum);
	}
}
