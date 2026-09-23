package com.nit.stringProgram;

import java.util.Scanner;

public class FirstNonRepeatedChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		
		boolean isNonReapeated = false;
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			if(count==1) {
				System.out.println("First non-reapeated char :"+s.charAt(i));
					isNonReapeated = true;
					break;
			}
		}
		if(isNonReapeated==false) {
			System.out.println("There is no non-repeated character!!!");
		}
	}
}