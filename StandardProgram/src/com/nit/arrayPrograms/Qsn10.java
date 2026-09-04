package com.nit.arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Qsn10 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		System.out.println("Enter array element one by one : ");
		int[] a = new int[size];

		for (int i = 0; i <= a.length - 1; i++) {

			a[i] = sc.nextInt();
		}
		int x = 0;
		int y = a.length-1;
		while(x<y) {
			int temp = a[x];
			a[x]=a[y];
			a[y]=temp;
			x++;
			y--;
		}
		System.out.println("Result = "+Arrays.toString(a));
	}
}
