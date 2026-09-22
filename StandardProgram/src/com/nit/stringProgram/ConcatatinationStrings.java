package com.nit.stringProgram;

import java.util.Scanner;

public class ConcatatinationStrings {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st String : ");
	String s1 = sc.nextLine();
	System.out.println("Enter 2nd String : ");
	String s2 = sc.nextLine();
	
	System.out.println(s1+s2);//this one is use for concate.
	System.out.println(s1.concat(s2));//this one too use for concate but their is method u have to learn.
}
}
