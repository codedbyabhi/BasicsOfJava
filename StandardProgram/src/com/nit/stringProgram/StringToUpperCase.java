package com.nit.stringProgram;

import java.util.Scanner;

public class StringToUpperCase {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s = sc.nextLine();
		
		String result = "";
		for(int i =0;i<=s.length()-1;i++) {
			char ch =s.charAt(i);
			if(ch>='a'&&ch<='z') {
				ch =(char)(ch-32);
			}
			result = result +ch;
		}
		System.out.println("Result : "+result);
//		System.out.println("Result : "+s.toUpperCase());  You can also print like this without creating for as well.
		
	}
}





//if(ch>='A'&&ch<='Z') {
//	ch =(char)(ch+32);
//}

//System.out.println((char)('g'-32));