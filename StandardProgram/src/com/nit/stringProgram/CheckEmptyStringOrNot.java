package com.nit.stringProgram;

import java.util.Scanner;

public class CheckEmptyStringOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		
		if(s.isEmpty()) {
			System.out.println("Given String is Empty.");
		}
		else {
			System.out.println("Given String is Not Empty.");
		}
	}

}
