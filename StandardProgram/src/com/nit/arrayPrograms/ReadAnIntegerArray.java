package com.nit.arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ReadAnIntegerArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter Array elements : ");
		
		for(int i =0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
	}

}
