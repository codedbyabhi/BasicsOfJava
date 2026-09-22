package com.nit.stringProgram;

import java.util.Scanner;

public class LargestWordInSentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();

		String[] a = s.split(" ");
		int maxLength = 0;

		for (String e : a)if (e.length() > maxLength)maxLength = e.length();

		for (String e : a)if (e.length() == maxLength)System.out.println(e);

	}
}
