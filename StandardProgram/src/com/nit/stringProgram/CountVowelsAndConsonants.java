package com.nit.stringProgram;

import java.util.Scanner;

public class CountVowelsAndConsonants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s = sc.nextLine();
		
		int vCount = 0;
		int cCount = 0;
		for(int i =0 ;i<=s.length()-1;i++) {
			char ch = s.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vCount++;
			}
			else if((ch>='A'&&ch<='Z') || (ch>='a'&&ch<='z')) {
				cCount++;
			}
		}
		System.out.println("Vowels is : "+vCount);
		System.out.println("Consonantse is : "+cCount);
	}
}
