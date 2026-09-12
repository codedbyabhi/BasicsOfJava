package com.nit.arrayPrograms;

import java.util.Scanner;

public class Qsn44 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Size of Array : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter First Array elements : ");
		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = sc.nextInt();

		}
		System.out.println("Enter Second Size of Array : ");
		int size1 = sc.nextInt();
		int b[] = new int[size1];
		System.out.println("Enter Second Array elements : ");
		for (int i = 0; i <= b.length - 1; i++) {
			b[i] = sc.nextInt();
		}

	}

}
