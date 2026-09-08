package com.nit.arrayPrograms;

import java.util.*;

class ArrayLabTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size < 0) {
			System.out.println("Invalid Array size.");
		} else {
			int[] a = new int[size];
			for (int i = 0; i < size; i++) {
				a[i] = sc.nextInt();
			}
			int[] b = new int[a.length];
			System.out.print("Output as: ");
			for (int i = 0; i <= a.length - 1; i++) {
				b[i] = a[(a.length - 1) - i];
				System.out.print(b[i] + " ");
			}
		}
	}
}
