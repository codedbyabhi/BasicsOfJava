package com.nit.arrayPrograms;

import java.util.Scanner;

public class Qsn17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		System.out.println("Enter array element one by one : ");
		int[] a = new int[size];

		for (int i = 0; i <= a.length - 1; i++) {

			a[i] = sc.nextInt();
		}
		boolean isArrayinAscendingOrder = true;
		for (int i = 0; i <= a.length - 2; i++) {
			if (a[i + 1] < a[i]) {
				isArrayinAscendingOrder = false;
				break;
			}
		}
		if (isArrayinAscendingOrder) {
			System.out.println("Array sorted in Ascending Order");
		} 
		else {
			System.out.println("Array is not sorted in Ascending Order");
		}
	}
}
