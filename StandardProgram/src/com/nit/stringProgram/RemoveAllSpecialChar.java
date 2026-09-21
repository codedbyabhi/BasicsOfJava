package com.nit.stringProgram;

import java.util.Scanner;

public class RemoveAllSpecialChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		String result = "";
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')||(ch>='0'&&ch<='9')) {
				result+=ch;
			}
		}
		System.out.println(result);
	}
}

