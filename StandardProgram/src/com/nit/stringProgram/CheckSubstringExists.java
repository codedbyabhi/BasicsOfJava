package com.nit.stringProgram;

import java.util.Scanner;

public class CheckSubstringExists {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		System.out.println("Enter the Substring :");
		String sub = sc.nextLine();

		if (s.contains(sub)) {
			System.out.println("Substring");
		} 
		else {
			System.out.println("Not sub-string");
		}
	}
}
