package com.nit.stringProgram;

import java.util.Scanner;

public class CountWordsInAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s = sc.nextLine();
		
		int count =0;
		
		for(int i =0 ; i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("Number of String is : "+(count+1));
	}
}




//.length is variable and .length() is method.


//second way to solve this by using Array.

//		System.out.print("Enter String : ");
//		String s = sc.nextLine();
//		String [] a = s.split(" ");
//		System.out.println("Count of words = "+a.length);	
//		System.out.println(Arrays.toString(a));	

