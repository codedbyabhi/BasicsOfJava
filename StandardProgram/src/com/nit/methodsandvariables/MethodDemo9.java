/*Write a Java program where you define a static method called addNumbers.
The method should take two integers as arguments and should not return anything.
It should print the sum of the numbers.*/
package com.nit.methodsandvariables;

public class MethodDemo9 {

	public static void main(String[] args) {
		addNumbers(10, 20);
	}

	public static void addNumbers(int a, int b) {

		int s = a + b;
		System.out.println(s);

	}
}
