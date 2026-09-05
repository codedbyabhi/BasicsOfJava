package com.nit.arrayPrograms;

import java.util.Scanner;

public class Qsn12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		System.out.println("Enter array element one by one : ");
		int[] a = new int[size];

		for (int i = 0; i <= a.length - 1; i++) {

			a[i] = sc.nextInt();
		}
		System.out.println("Enter element to search");
		int target = sc.nextInt();
		int count = 0;
		for (int e : a) {
			if (e == target) {
				count++;
			}
		}
		System.out.println(target + " appeared " + count + " times ");
	}

}
