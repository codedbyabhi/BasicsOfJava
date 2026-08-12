/*Write a Java program that defines a static method called squareNumber.
The method should take one integer as argument and should not return any value.
It should print the square of the number.*/
package com.nit.methodsandvariables;

public class MethodDemo10 {

	public static void main(String[] args) {
		squareNumber(5);
	}
	public static void squareNumber(int a) {
		
		int s = (int)Math.pow(5,2);
		System.out.println(s);
		
	}
}
