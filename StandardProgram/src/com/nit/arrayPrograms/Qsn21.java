package com.nit.arrayPrograms;

import java.util.Scanner;

public class Qsn21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		System.out.println("Enter array element one by one : ");
		int[] a = new int[size];

		for (int i = 0; i <= a.length - 1; i++) {

			a[i] = sc.nextInt();
		}
		boolean anyNonRepeated = false;
		for (int i = 0; i <= a.length - 1; i++) {

			int count = 0;
			for (int j = 0; j <= a.length - 1; j++) {
				if (a[j] == a[i]) {
					count++;
				}
			}
			if (count == 1) {
				anyNonRepeated = true;
				System.out.println("First no repeated : " + a[i]);
				break;
			}
		}
		if (anyNonRepeated == false) {
			System.out.println("There is no non-repeated element.");
		}

	}
}
