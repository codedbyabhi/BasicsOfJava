package com.nit.stringProgram;

import java.util.Arrays;
import java.util.Scanner;

public class SortCharInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();

		char[] a = s.toCharArray();

		Arrays.sort(a);

		s = String.valueOf(a);
		System.out.println(s);

	}
}
