package com.nit.arrayPrograms;

import java.util.*;

class ArraysLabTask4 {
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
			System.out.print("Even elements are : ");
			for (int x : a) {
				if (x % 2 == 0) {
					System.out.print(x + " ");
				}
			}
			System.out.print("\nOdd elements are : ");
			for (int x : a) {
				if (x % 2 != 0) {
					System.out.print(x + " ");
				}
			}
		}
	}
}