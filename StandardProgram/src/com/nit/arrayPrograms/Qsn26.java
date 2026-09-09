package com.nit.arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Qsn26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int [] a = new int[size];

		System.out.println("Enter array element one by one : ");
		for (int i = 0; i <= a.length - 1; i++) {

			a[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			if (isPreviouslyPresent(a, i) == false) {
				count++;
			}
		}

		int [] b = new int[count];
		int index = 0;
		for (int i = 0; i <=a.length - 1; i++) {
			if (isPreviouslyPresent(a, i) == false) {
				b[index] = a[i];
				index++;
			}
		}
		System.out.println("Result = " + Arrays.toString(b));
	}

	public static boolean isPreviouslyPresent(int[] a, int i) {

		boolean result = false;
		for (int j = 0; j <= i - 1; j++) {

			if (a[j] == a[i]) {

				result = true;
			}
		}
		return result;
	}
}
