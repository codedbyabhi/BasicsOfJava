package com.nit.arrayPrograms;

import java.util.Scanner;

public class Qsn42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Array size : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter First Array elements : ");
		for (int i = 0; i <= a.length - 1; i++) {

			a[i] = sc.nextInt();
		}
		System.out.println("Enter Second Array size : ");
		int size1 = sc.nextInt();
		int b[] = new int[size1];
		System.out.println("Enter Second Array elements : ");
		for (int i = 0; i <= b.length - 1; i++) {

			b[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i <= b.length - 1; i++) {
			boolean isPreviouslyPresent = false;

			for (int j = 0; j <= a.length - 1; j++) {
				if (a[j] == a[i]) {
					isPreviouslyPresent = true;
					break;
				}
			}
			if (isPreviouslyPresent == false) {
				count++;
			}
			
		}
		
		
	}

}
