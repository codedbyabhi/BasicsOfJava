package com.nit.stringProgram;

import java.util.Scanner;

public class ToggleCasing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		s=s.toUpperCase();

		String [] a = s.split(" ");
		String result = "";
		
		for (int i = 0; i < a.length; i++) {
			result = result +((char)(a[i].charAt(0)+32)+a[i].substring(1))+" ";
		}
		System.out.println(result);
	}
}
