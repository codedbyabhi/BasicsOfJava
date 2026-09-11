package com.nit.arrayPrograms;

import java.util.Scanner;

public class Qsn38 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ente the size of the array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter the array elements ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int minDiff = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				if (a[i] > a[j] && a[i] - a[j] < minDiff) {
					minDiff = a[i] - a[j];
				} 
				else if (a[i] < a[j] && a[j] - a[i] < minDiff) {
					minDiff = Math.abs(a[i] - a[j]);

				}

			}

		}
		System.out.println("Minimum Difference : " + minDiff);

	}
}