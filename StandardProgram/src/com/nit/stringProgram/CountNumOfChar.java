package com.nit.stringProgram;

import java.util.Scanner;

public class CountNumOfChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();

		System.out.println("Number of characters is : "+s.length());
	}
}