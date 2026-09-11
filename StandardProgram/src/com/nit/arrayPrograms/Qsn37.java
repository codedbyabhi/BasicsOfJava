package com.nit.arrayPrograms;

import java.util.Scanner;

public class Qsn37 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ente the size of the array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter the array elements ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int sum = sc.nextInt();
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = i + 1; j <= a.length - 1; j++) {
				if (a[i] + a[j] == sum) {
					System.out.println("Element is " + a[i] + a[j]);
				}
			}
		}
	}
}