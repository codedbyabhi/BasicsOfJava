package com.nit.arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Qsn01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int [] a = new int[size];
		System.out.println("Enter array elements one by one : ");
		for(int i = 0;i<=a.length-1;i++) {
			
			a[i] = sc.nextInt();
			
		}
		System.out.println("Given array is : "+Arrays.toString(a));
		
	}

}
