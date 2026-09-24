package com.nit.stringProgram;

import java.util.Arrays;
import java.util.Scanner;

public class SortTheGivenStringArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		String[] a = new String[size];
		sc.nextLine();
		System.out.println("Enter array element one by one : ");

		for (int i = 0; i < size; i++) {
			a[i] = sc.nextLine();
		}
		for (int cycle = 1; cycle < size; cycle++) {

			for (int i = 0; i < size - 2; i++) {

				if (a[i].compareTo(a[i + 1]) > 0) {
					String temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;

				}
			} 
		}
		System.out.println(Arrays.toString(a));

	}

}
