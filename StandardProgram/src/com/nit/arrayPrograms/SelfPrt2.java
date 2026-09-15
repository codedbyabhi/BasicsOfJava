package com.nit.arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SelfPrt2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter Array elements : ");
		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 0;i<=a.length-1;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);				
			}
		}
	}
}
