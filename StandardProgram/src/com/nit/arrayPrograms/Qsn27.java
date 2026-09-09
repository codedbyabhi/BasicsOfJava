package com.nit.arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Qsn27 {
	public static void main(String []args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		System.out.println("Enter array element one by one : ");
		int[] a = new int[size];

		for (int i = 0; i <= a.length - 1; i++) {

			a[i] = sc.nextInt();
		}
		System.out.println("Result = "+Arrays.toString(reverse(a)));
		
	}
		public static int[] reverse(int []a) {
			
			int left = 0;
			int right =a.length-1;
			while(left<right) {
				int temp = a[left];
				a[left] = a[right];
				a[right]=temp;
				left++;
				right--;
			}
			return a;
	}
}


