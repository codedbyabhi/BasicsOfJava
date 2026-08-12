/*Write a Java program where you define a static method called printNumbers.
The method should not take any arguments and should not return anything.
It should print numbers from 1 to 10. Call this method from main method.*/
package com.nit.methodsandvariables;

public class MethodDemo2 {

	public static void main(String[] args) {
		printNumbers();
	}

	public static void printNumbers() {
		for (int i = 1; i <= 10; i++) {

			System.out.println(i);
		}

	}

}
