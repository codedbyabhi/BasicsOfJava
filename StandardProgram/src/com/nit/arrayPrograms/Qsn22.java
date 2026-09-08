package com.nit.arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Qsn22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		System.out.println("Enter array element one by one : ");
		int[] a = new int[size];

		for (int i = 0; i <= a.length - 1; i++) {

			a[i] = sc.nextInt();
		}
		System.out.println("Enter k value : ");
		int k = sc.nextInt();
		for (int i = 1; i <=k; i++) {

			int temp = a[0];
			for (int j = 1; j <= a.length - 1; j++) {

				a[j - 1] = a[j];
			}
			a[a.length - 1] = temp;
		}
		System.out.println("Array after " + k + " left Rotetation :" + Arrays.toString(a));

	}
}
