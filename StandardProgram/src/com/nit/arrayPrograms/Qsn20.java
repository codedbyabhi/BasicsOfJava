package com.nit.arrayPrograms;

import java.util.Scanner;

public class Qsn20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];

		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = sc.nextInt();
		}
		boolean repeated = false;
		for (int i = 0; i <= a.length - 1; i++) {

			boolean isPreviousPresent = false;
			for (int j = 0; j <= i-1; j++) {
				if (a[j] == a[i]) {

					isPreviousPresent = true;
					break;
				}

			}
			if (isPreviousPresent == true) {
				repeated = true;
				System.out.println("First repeated element : " + a[i]);
				break;
			}
			if (repeated == false) {
				System.out.println("No arrays element are repeated");
			}
		}

	}
}
