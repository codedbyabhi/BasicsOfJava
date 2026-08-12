/*Write a Java program in which you define a static method called printSquares.
The method should not take any arguments and should not return anything.
It should print the square of numbers from 1 to 5.*/

package com.nit.methodsandvariables;

public class MethodDemo6 {
	
	public static void main(String[] args) {
		printSquares();
	}
	public static void printSquares() {
		
		for(int i = 1;i<=5;i++) {
			
				int l =  (int) Math.pow(i,2);
				
				System.out.println(l);
		}
	}
}
