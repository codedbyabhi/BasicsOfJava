package com.nit.stringProgram;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagramString4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st String : ");
		String s1 = sc.nextLine();
		System.out.println("Enter the 2nd iString : ");
		String s2 = sc.nextLine();

		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		
		for (int cycle = 1; cycle <= a.length - 1; cycle++) {
			for (int i = 0; i < s1.length() - 2; i++) {
				if (a[i + 1] < a[i]) {
					char temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}
		for (int cycle = 1; cycle <= b.length - 1; cycle++) {
			for (int i = 0; i < s2.length() - 2; i++) {
				if (b[i + 1] < b[i]) {
					char temp = b[i];
					b[i] = b[i + 1];
					b[i + 1] = temp;
				}
			}
		}
		if (Arrays.equals(a,b)) {
			System.out.println("Anagram");
		} 
		else {
			System.out.println("Not Anagram");
		}

	}

}
