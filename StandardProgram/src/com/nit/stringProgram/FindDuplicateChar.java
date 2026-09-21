package com.nit.stringProgram;

import java.util.Scanner;

public class FindDuplicateChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		String result = "";
		System.out.print("Duplicate characters = ");
		for (int i = 0; i <= s.length() - 1; i++) {
			char ch = s.charAt(i);
			
			if (!result.contains("" + ch)) {
				result += ch;
			} 
			else {
				System.out.print(ch+" ");
			}
		}
	}
}
