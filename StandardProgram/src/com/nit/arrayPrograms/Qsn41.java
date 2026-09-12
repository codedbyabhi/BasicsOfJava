package com.nit.arrayPrograms;

import java.util.Scanner;

public class Qsn41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Array Size : ");
		int size = sc.nextInt();
		int a [] = new int[size];
		System.out.println("Enter First Array element : ");
		for (int i = 0; i <= a.length - 1; i++)
		{
			
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter Second Array Size : ");
		int size1 = sc.nextInt();
		int b [] = new int[size1];
		System.out.println("Enter Second Array element : ");
		for (int i = 0; i <= b.length - 1; i++)
		{
			
			b[i] = sc.nextInt();//
		}
		
		for(int i =0; i<=a.length-1;i++) {
			
			boolean isPresent = false;
			for(int j = 0;j<=b.length-1;j++){
				
				if(b[j]==a[i]) {
					isPresent=true;
					break;
				}
				
			}
			if(isPresent) {
				System.out.println(a[i]);
			}
		}
		
	}
}
