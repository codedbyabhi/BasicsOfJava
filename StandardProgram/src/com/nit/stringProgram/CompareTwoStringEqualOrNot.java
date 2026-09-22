package com.nit.stringProgram;

import java.util.Scanner;

public class CompareTwoStringEqualOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String : ");
		String s1 = sc.nextLine();
		System.out.println("Enter 2nd String : ");
		String s2 = sc.nextLine();
		
									  //we can also use .equal method but it shows not equal for upper and lower cases.
		if(s1.equalsIgnoreCase(s2)){  //this equalsIgnoreCase is use for ignore upper lower case not equal problem.
			System.out.println("String are Equal");
		}
		else {
			System.out.println("String are Not Equal");
		}
	}
}
