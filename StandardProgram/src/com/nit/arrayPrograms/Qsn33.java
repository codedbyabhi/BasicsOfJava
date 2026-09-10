package com.nit.arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Qsn33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int[] a = new int[size];

		System.out.println("Enter array element one by one : ");
		for (int i = 0; i <= a.length - 1; i++) {

			a[i] = sc.nextInt();
		}
		for (int cycle = 1; cycle <= a.length - 1; cycle++) {

			for (int i = 0; i <= a.length - 2; i++) {

				if (a[i + 1] > a[i]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;

				}
			}
		}
		System.out.println(Arrays.toString(a));

	}
}
