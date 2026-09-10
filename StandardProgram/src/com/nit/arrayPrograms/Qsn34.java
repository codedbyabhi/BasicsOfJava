package com.nit.arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Qsn34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int[] a = new int[size];

		System.out.println("Enter array element one by one : ");
		for (int i = 0; i <= a.length - 1; i++) {

			a[i] = sc.nextInt();
		}
		for (int i = 0; i <= a.length - 1; i++) {
			int minIndex = i;
			for (int j = i; j <= a.length - 1; j++) {
				if (a[j] < a[minIndex]) {
					minIndex = j;
				}
			}
			int temp = a[minIndex];
			a[minIndex] = a[i];
			a[i] = temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
