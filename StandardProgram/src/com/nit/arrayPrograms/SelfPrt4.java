package com.nit.arrayPrograms;

import java.util.Scanner;

public class SelfPrt4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		System.out.println("Enter array element one by one : ");
		int[] a = new int[size];

		for (int i = 0; i <= a.length - 1; i++) {

			a[i] = sc.nextInt();
		}
		int even = 0;
		int odd = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] % 2 == 0) {
				even++;
			} 
			else {
				odd++;
			}

		}
		System.out.println("Even Count : " + even);
		System.out.println("Odd Count : " + odd);
	}

}
