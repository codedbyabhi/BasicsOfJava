package com.nit.arrayPrograms;

import java.util.Scanner;

public class Qsn15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		System.out.println("Enter array element one by one : ");
		int[] a = new int[size];

		for (int i = 0; i <= a.length - 1; i++) {

			a[i] = sc.nextInt();
		}
		int sum = 0;
		for (int e : a) {
			sum += e;
		}
		System.out.println("Average = " + (sum / a.length));
	}
}
