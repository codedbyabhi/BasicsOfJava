package com.nit.stringProgram;

import java.util.Scanner;

public class PrintASCIIValuesOfGivenString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			System.out.println(ch + " = " + (int) ch);
		}
	}
}
