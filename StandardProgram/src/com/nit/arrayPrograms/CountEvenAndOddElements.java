package com.nit.arrayPrograms;

import java.util.Scanner;

public class CountEvenAndOddElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter Array elements : ");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int even = 0;
		int odd = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even++;
			}
			if (a[i] % 2 == 1) {
				odd++;
			}

		}
		System.out.println("Even Count is : " + even);
		System.out.println("Odd Count is : " + odd);
	}

}
