/*Write a Java program where you define a static method called printHelloFiveTimes.
The method should not take any arguments and should not return any value.
It should print Hello Java five times.*/
package com.nit.methodsandvariables;

public class MethodDemo8 {
	
	public static void main(String[] args) {
		printHelloFiveTimes();
	}
	public static void printHelloFiveTimes() {
		
		for(int i =1;i<=5;i++) {
			
			System.out.println("Hello Java");
		}
		
	} 

}
