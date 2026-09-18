package com.nit.stringProgram;

import java.util.Scanner;

public class ReveseAndCheckPalindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();

		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (rev.equals(s)) {
			System.out.println("Palendrome");
		} 
		else {
			System.out.println("Not Palendrome");
		}
	}

}
