package com.nit.stringProgram;

import java.util.Scanner;

public class StringToLowerCase {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s = sc.nextLine();
		
		String result = "";
		for(int i =0;i<=s.length()-1;i++) {
			char ch =s.charAt(i);
			if(ch>='A'&&ch<='Z') {
				ch =(char)(ch+32);
			}
			result = result +ch;
		}
		System.out.println("Result : "+result);
	}

}