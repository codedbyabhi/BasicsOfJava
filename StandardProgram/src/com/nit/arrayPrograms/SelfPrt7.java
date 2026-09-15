package com.nit.arrayPrograms;

import java.util.Scanner;

public class SelfPrt7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		System.out.println("Enter array element one by one : ");
		int [] a =new int [size];
		
		for(int i = 0; i<=a.length-1;i++) {
			
			a[i] = sc.nextInt();
		}
		System.out.println("Enter nth number : ");
		int n = sc.nextInt();
		
		for(int i = 0 ; i<=a.length-1;i++) {
			int count =0;
			
			for(int j =0;j<=a.length-1;j++) {
				
				if(a[j]>a[i]) {
					count++;
				}
			}
			if(count == (n-1)) {
				System.out.println("The "+n+" value is : "+a[i]);
				break;
			}
		}
	}

}
