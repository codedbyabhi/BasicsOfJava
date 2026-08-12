package com.nit.methodsandvariables;

public class ReverseNum {

	public static void main(String[] args) {
		int n1 = 123, n2 = 456, n3 = 789, n4 = 159;

		System.out.println(reverse(n1));
		System.out.println(reverse(n2));
		System.out.println(reverse(n3));
		System.out.println(reverse(n4));

	}

	public static int reverse(int num) {

		int rev = 0;
		while (num != 0) {

			rev = rev * 10 + (num % 10);
			num /= 10;

		}        
		return rev;
	}

}