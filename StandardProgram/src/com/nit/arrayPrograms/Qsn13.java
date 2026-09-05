package com.nit.arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Qsn13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		System.out.println("Enter array element one by one : ");
		int[] a = new int[size];

		for (int i = 0; i <= a.length - 1; i++) {

			a[i] = sc.nextInt();
		}
		int [] b = new int[a.length];
		for(int i = 0; i<=a.length-1;i++) {
			b[i]=a[i];
			
		}
		System.out.println(Arrays.toString(a));
	}
}
