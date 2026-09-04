package com.nit.arrayPrograms;

import java.util.Scanner;

public class Qsn03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int size = sc.nextInt();

		int[] a = new int[size];
		System.out.println("Enter element one by one : ");
		for(int i = 0; i < a.length; i++) {
			
			a[i]= sc.nextInt();
		}
		int sum =0;
		for (int e : a) {
				sum = sum + e;
				System.out.println("Sum is : "+sum);
		}
	}
}