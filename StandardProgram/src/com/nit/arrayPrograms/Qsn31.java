package com.nit.arrayPrograms;

import java.util.Scanner;

public class Qsn31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int[] a = new int[size];

		System.out.println("Enter array element one by one : ");
		for (int i = 0; i <= a.length - 1; i++) {

			a[i] = sc.nextInt();
		}
		System.out.println("Enter targetsum : ");
		int target = sc.nextInt();
		boolean result = false;
		int minIndex = 0;
		int maxIndex = 0;
		outer: for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j <= a.length - 1; j++) {

				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum = sum + a[k];
				}
				if (sum == target) {
					result = true;
					minIndex = i;
					maxIndex = j;
					break outer;
				}
			}
		}
		if (result == true) {
			for (int x = minIndex; x <= maxIndex; x++) {
				System.out.print(a[x] + " ");
			}
		} else {
			System.out.println("There is no such kinda element." + target);
		}
	}
}
