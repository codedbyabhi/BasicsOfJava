package com.nit.arrayPrograms;

import java.util.Scanner;

public class SelfPrt3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size :");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter array elements : ");
		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for(int e : a) {
			sum = sum + e;
		}
		System.out.println("Sum of the elements :-> "+sum);
	}
}
