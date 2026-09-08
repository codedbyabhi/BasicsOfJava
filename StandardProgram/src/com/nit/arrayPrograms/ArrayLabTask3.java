package com.nit.arrayPrograms;

import java.util.*;

class ArrayLabTask3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];

		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for (int b : a) {
			if (b % 2 == 0) {
				sum += b;
			}
		}
		System.out.println("Sum of even elements : " + sum);
	}
}
