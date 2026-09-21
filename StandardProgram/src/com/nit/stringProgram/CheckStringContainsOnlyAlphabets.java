package com.nit.stringProgram;

import java.util.Scanner;

public class CheckStringContainsOnlyAlphabets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();

		boolean found = false;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if ((ch >= 'A' && ch <= 'Z')||(ch>='a'&&ch<='z')) {
				found = true;
				break;
			}
		}
			
			if(!found) {
				System.out.println("String Not Contains Alphabets");
			} 
			else {
				System.out.println("String Contains Alphabets");
			}

	}
}
