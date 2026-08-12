/*Write a Java program where you define a static method named printPattern.
The method should not accept arguments and should not return anything.
It should print the following pattern:
*
**
***
****
*/
package com.nit.methodsandvariables;

public class MethodDemo5 {
	public static void main(String[] args) {
		printPattern();

	}

	public static void printPattern() {

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {

				

					System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
