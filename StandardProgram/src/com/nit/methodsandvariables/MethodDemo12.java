/*Write a Java program where you define a static method called factorial.
The method should take an integer as argument and should not return anything.
It should print the factorial of the number.*/
package com.nit.methodsandvariables;

public class MethodDemo12 {
	
	public static void main(String[] args) {
		factorial(5);
	}
	public static void factorial(int a) {
		long fact = 1;
		for(long i=a;i>=1;i--) {
			fact*=i;
		}
		System.out.println(fact);
		}
		
	}
