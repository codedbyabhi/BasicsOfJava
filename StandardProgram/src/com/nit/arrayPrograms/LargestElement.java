package com.nit.arrayPrograms;

import java.util.Scanner;

public class LargestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int size = sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter Array element : ");
		
		for(int i =0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int largest = a[0];
		
		for(int e : a ) {
			if(e>largest) {
				largest = e;
			}
		}
		System.out.println("Largest element is : "+largest);
	}

}
