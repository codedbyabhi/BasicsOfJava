/*Write a Java program that defines a static method called reverseNumber.
The method should take an integer as argument and should not return anything.
It should print the reverse of the number.*/
package com.nit.methodsandvariables;

public class MethodDemo13 {
	
	public static void main(String[] args) {
		reverseNumber(234);
	}
	public static void reverseNumber(int a) {
		int rev =0;
		while(a!=0) {
			int ld = a%10;
			rev =rev*10+ld;
			a =a /10;
			
		}
		System.out.println(rev);
		
		
	}

}
