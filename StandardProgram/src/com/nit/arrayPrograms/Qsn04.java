package com.nit.arrayPrograms;

import java.util.Scanner;

public class Qsn04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		System.out.println("Enter array element one by one : ");
		int [] a =new int [size];
		
		for(int i = 0; i<=a.length-1;i++) {
			
			a[i] = sc.nextInt();
		}
		int evenCount = 0;
		int oddCount = 0;
		for (int e : a) {
			if(e%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.println(evenCount);
		System.out.println(oddCount);
	}
}
