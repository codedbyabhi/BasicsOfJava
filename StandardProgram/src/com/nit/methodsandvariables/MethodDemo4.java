/*Write a Java program that defines a static method called printTable.
The method should not take any arguments and should not return anything.
It should print the multiplication table of 5.*/

package com.nit.methodsandvariables;

public class MethodDemo4 {

	public static void main(String[] args) {
		printTable();
	}

	public static void printTable() {

		int t = 5;
		int s = 0;
		for (int i = 1; i <= 10; i++) {

			s = t * i;
			System.out.println(s);
		}
	}
}
