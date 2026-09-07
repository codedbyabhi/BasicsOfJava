package com.nit.arrayPrograms;

import java.util.Scanner;

public class Qsn18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		System.out.println("Enter array element one by one : ");
		int[] a = new int[size];

		for (int i = 0; i <= a.length - 1; i++) {

			a[i] = sc.nextInt();
		}
		System.out.println("Enter Target element to search : ");
		int target = sc.nextInt();
		boolean isPresent = false;
		int start = 0;
		int end = a.length - 1;

		while (start < end) {
			int midIndex = (start + end) / 2;
			if (a[midIndex] == target) {
				isPresent = true;
				break;
			}
			if (target > a[midIndex]) {
				start = midIndex + 1;
			} 
			else {

				start = midIndex - 1;
			}

		}
		if (isPresent==true) {
			System.out.println(target+" T000000he element is present ");
		} 
		else {
			System.out.println(target+" The element is NOT present");
		}
	}

}
