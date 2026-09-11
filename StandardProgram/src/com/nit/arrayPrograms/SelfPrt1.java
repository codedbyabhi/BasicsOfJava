package com.nit.arrayPrograms;

import java.util.Scanner;

public class SelfPrt1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter Array elements : ");
		for (int i = 0; i <= a.length - 1; i++) {

			a[i] = sc.nextInt();
		}
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(" " + a[0]);
			System.out.println("  " + a[1]);
			System.out.println("   " + a[2]);
			System.out.println("    " + a[3]);
			System.out.println("     " + a[4]);
			System.out.println("    " + a[5]);
			System.out.println("   " + a[6]);
			System.out.println("  " + a[7]);
			System.out.println(" " + a[8]);
		}
	}
}
