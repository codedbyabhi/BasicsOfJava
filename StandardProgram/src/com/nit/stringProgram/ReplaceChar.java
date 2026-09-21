package com.nit.stringProgram;

import java.util.Scanner;

public class ReplaceChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		
		System.out.println("Enter which Char shoild be Replaced : ");
		char oldChar = sc.next().charAt(0);
		System.out.println("Enter by which char the onther char should be replaces");
		char newChar = sc.next().charAt(0);
		
		s = s.replace(oldChar, newChar);
		System.out.println("Result : "+s);
		
	}

}
