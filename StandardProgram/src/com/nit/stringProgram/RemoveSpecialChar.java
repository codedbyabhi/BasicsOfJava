package com.nit.stringProgram;

import java.util.Scanner;

public class RemoveSpecialChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char ch = sc.next().charAt(0);
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ch) {
				result = result + s.charAt(i);
			}
		}
		System.out.println(result);
	}
}
