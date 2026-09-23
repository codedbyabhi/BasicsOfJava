package com.nit.stringProgram;

import java.util.Scanner;

public class CheckStringRotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String : ");
		String s1 = sc.nextLine();
		System.out.println("Enter 2nd String : ");
		String s2 = sc.nextLine();
		
		if((s1+s2).contains(s2)) {
			System.out.println(s2+"is the rotetion of "+s1);
		}
	}
}
