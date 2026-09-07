package com.nit.arrayPrograms;

import java.util.Scanner;

public class Qsn14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		System.out.println("Enter array element one by one : ");
		int[] a = new int[size];

		for (int i = 0; i <= a.length - 1; i++) {

			a[i] = sc.nextInt();
		}
		for(int i = 0; i<=a.length-1;i++) {
			if(i%2==0) {
				System.out.println(a[i]+" ");
			}
		}
	}

}
