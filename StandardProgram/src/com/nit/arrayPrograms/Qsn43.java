package com.nit.arrayPrograms;

import java.util.Scanner;

public class Qsn43 {
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
		for (int i = 0; i <= a.length - 1; i++) {

			if (a.length == b.length) {
				System.out.println("Arrays are not equal because of their different length.");
			} 
			else {
				boolean areEqaul = true;
				for (int i1 = 0; i1 <= a.length - 1; i1++) {

					if (a[i1] != b[i1]) {
						areEqaul = false;
						break;
					}

				}
				if (areEqaul) {
					System.out.println("Arrays are equal");
					
				} 
				else {
					System.out.println("Arrays are not Equal. ");
				}
			}
		}

	}
}
