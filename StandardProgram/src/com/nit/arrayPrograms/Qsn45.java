package com.nit.arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Qsn45 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first array size : ");
		int size1 = sc.nextInt();
		int[] a = new int[size1];
		System.out.println("Enter first array elements one by one : ");

		for (int i = 0; i <= a.length - 1; i++) {

			a[i] = sc.nextInt();
		}
		System.out.println("Enter first array size : ");
		int size2 = sc.nextInt();
		int[] b = new int[size2];
		System.out.println("Enter first array elements one by one : ");

		for (int i = 0; i <= b.length - 1; i++) {

			a[i] = sc.nextInt();
		}

		int[] c = new int[a.length + b.length];
		int index = 0;
		int x = 0;
		int y = 0;
		while (x <= a.length - 1 && y <= b.length - 1) {
			if (a[x] < b[y]) {
				c[index] = a[x];
				x++;
			} else {
				c[index] = a[x];
				y++;
			}
		}
		while (x <= a.length - 1) {
			c[index] = a[x];
			x++;
			index++;
		}
		while (y <= b.length - 1) {
			c[index] = b[y];
			y++;
			index++;
		}
		System.out.println("REsult is : " + Arrays.toString(c));
	}
}
