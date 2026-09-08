package com.nit.arrayPrograms;

import java.util.Scanner;

public class ArrayLabTask6 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("Original Array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				a[index] = a[i];
				index++;
			}
		}
		while (index < a.length) {
			a[index] = 0;
			index++;
		}
		System.out.println();
		System.out.print("Array After Moving Zeros to End: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}
}