package com.nit.whileLoopPrograms;

import java.util.Scanner;

public class SumOfDigitGivenNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number : ");
		int n1 = sc.nextInt();
		int sum = 0;
		int ld;
		while(n1!=0) {
			
			ld=n1%10;
			sum = sum +ld;
			n1=n1/10;
		}
		
		System.out.println(sum);
	}
}
