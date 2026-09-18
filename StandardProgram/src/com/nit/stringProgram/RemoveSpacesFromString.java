package com.nit.stringProgram;

import java.util.Scanner;

public class RemoveSpacesFromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s = sc.nextLine();

//		char ch = sc.next().charAt(0);//dont need this here.
		
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				result += s.charAt(i);
			}
		}
		System.out.println(result);
	}
}
