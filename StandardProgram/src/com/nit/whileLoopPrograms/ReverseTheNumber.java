package com.nit.whileLoopPrograms;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		int sum = 0;
		
		while(n!=0) {
			
			int ld = n%10;
			sum = sum * 10 + ld;
			n=n/10;
		}
		System.out.println(sum);
		
	}
}
