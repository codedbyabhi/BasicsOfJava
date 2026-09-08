package com.nit.arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Qsn23 {
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
		for (int i = 1; i <= k; i++) {

			int temp = a[a.length - 1];
		
			for (int j = a.length-2; j >= 0; j--) {

				a[j + 1] = a[j];
			}
			a[0] = temp;
		}
		System.out.println("Array after " + k + " Right Rotetation :" + Arrays.toString(a));

	}
}
