package com.nit.arrayPrograms;

import java.util.Scanner;

public class Qsn06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		System.out.println("Enter array element one by one : ");
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
		System.out.println("The largest element is " + smallest);
	}
}
