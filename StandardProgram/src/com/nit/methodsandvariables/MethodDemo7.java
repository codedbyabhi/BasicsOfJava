/*Write a program that defines a static method called sumNumbers.
The method should not take any arguments and should not return anything.
Inside the method calculate and print the sum of numbers from 1 to 10.*/
package com.nit.methodsandvariables;

public class MethodDemo7 {

	public static void main(String[] args) {
		sumNumbers();
	}
	public static void sumNumbers() {
		int sum = 0;
		
		for(int i = 1; i<=10;i++) {
			
			sum = sum + i;
		} 
		System.out.println(sum);
		
		
	}
}
