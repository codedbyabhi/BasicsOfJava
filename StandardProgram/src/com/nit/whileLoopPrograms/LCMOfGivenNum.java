package com.nit.whileLoopPrograms;

import java.util.Scanner;

public class LCMOfGivenNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1 and n2 value : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		for(int i = 1; true ; i++) {
			
			if((n1*i)%n2==0) {
			
			System.out.println("LCM is : "+(n1*i));
			break;
			}
		}
	}
}
