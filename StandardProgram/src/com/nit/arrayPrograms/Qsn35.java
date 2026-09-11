package com.nit.arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Qsn35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int[] a = new int[size];

		System.out.println("Enter array element one by one : ");
		for (int i = 0; i <= a.length - 1; i++) {

			a[i] = sc.nextInt();
		}
		for (int i = 1; i <= a.length - 1; i++) {
			int current = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > current) {
				a[j + 1] = a[i];
				j--;
			}
			a[j + 1] = current;

		}
		System.out.println(Arrays.toString(a));
	}

}
