package com.nit.arrayPrograms;

import java.util.*;

class ArrayLabTask5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size > 0) {
			int[] a = new int[size];
			for (int i = 0; i <= a.length - 1; i++) {
				a[i] = sc.nextInt();
			}
			int smallest = a[0];
			for (int e : a) {
				if (e < smallest) {
					smallest = e;
				}
			}
			System.out.println("Smallest element in the array is: " + smallest);
		} else {
			System.out.println("Negative size not allowed.");
		}
	}
}