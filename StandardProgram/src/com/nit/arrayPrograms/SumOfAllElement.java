package com.nit.arrayPrograms;

import java.util.Scanner;

public class SumOfAllElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter Array elements : ");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for (int e : a) {
			sum += e;

		}
		System.out.println("Sum of All elements : " + sum);
	}

}
