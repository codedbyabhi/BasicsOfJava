package com.nit.arrayPrograms;

import java.util.Scanner;

public class Qsn11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		System.out.println("Enter array element one by one : ");
		int[] a = new int[size];

		for (int i = 0; i <= a.length - 1; i++) {

			a[i] = sc.nextInt();
		}
		System.out.println("Enter element to Search");
		int target = sc.nextInt();
		boolean found = false;
		
		for(int e:a) {
			
			if(e==target) {
				found = true;
				break;
			}
		}
		if(found==true) {
			System.out.println("Array contains the givens target");
		}
		else {
			System.out.println("Array NOT contains the givens target");
		}
	}
}
