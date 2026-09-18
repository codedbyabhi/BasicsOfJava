package com.nit.stringProgram;

import java.util.Scanner;

public class CountOccurrenceOfCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s = sc.nextLine();
		System.out.println("Enter a character to count the apperance : ");
		char ch = sc.next().charAt(0);

		int count =0;
		for (int i = 0; i < s.length(); i++) {

			if(s.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("Count is : "+count);
	}
}
