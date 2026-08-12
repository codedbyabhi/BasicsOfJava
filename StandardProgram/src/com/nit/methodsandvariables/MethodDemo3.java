/*Write a program in Java where you define a static method named printEvenNumbers.
The method should not accept arguments and should not return anything.
It should print all even numbers between 1 and 20.call this method from main method.*/
package com.nit.methodsandvariables;

public class MethodDemo3 {

	public static void main(String[] args) {

		printEvenNumbers();
	}

	public static void printEvenNumbers() {
		for (int num = 1; num <= 20; num++) {

			if (num % 2 == 0) {
				System.out.println(num);

			}
		}
	}

}
