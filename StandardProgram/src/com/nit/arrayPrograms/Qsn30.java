package com.nit.arrayPrograms;

import java.util.Scanner;

public class Qsn30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int[] a = new int[size];

		System.out.println("Enter array element one by one : ");
		for (int i = 0; i <= a.length - 1; i++) {

			a[i] = sc.nextInt();
		}
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i <= a.length - 1; i++) {

			for (int j = i; j <= a.length - 1; j++) {

				int sum = 0;
				System.out.print(i + "," + j + " = ");
				for (int m = i; m <= j; m++) {
					System.out.print(a[m] + " ");
					sum = sum + a[m];
				}
				System.out.println("Sum = " + sum);
				if (sum > maxSum) {
					maxSum = sum;
				}
			}
		}
		System.out.println("Max Sub-Array sum = " + maxSum);
	}

}
