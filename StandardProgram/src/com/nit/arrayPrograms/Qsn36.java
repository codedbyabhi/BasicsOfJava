package com.nit.arrayPrograms;

import java.util.Scanner;

public class Qsn36 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ente the size of the array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter the array elements ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; i++) {
				if (a[i] + a[j] == target) {
					System.out.println("pairs of sum :");
				}
			}
		}
	}
}