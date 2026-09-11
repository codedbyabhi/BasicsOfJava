package com.nit.arrayPrograms;

import java.util.Scanner;

public class Qsn40 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ente the size of the array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter the array elements ");
		for (int i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();
		}
		int n = a[a.length - 1];
		int sum = (n * (n + 1)) / 2;
		int totalsum = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			totalsum += i;
		}
		if (totalsum == sum) {
			System.out.println("No missing elemnts");
		} else {
			System.out.println("the missing elements is " + (totalsum - sum));
		}
	}
}