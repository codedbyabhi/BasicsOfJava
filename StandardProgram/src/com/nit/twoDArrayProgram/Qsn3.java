package com.nit.twoDArrayProgram;

import java.util.Scanner;

public class Qsn3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First array size : ");
		int size1 = sc.nextInt();
		System.out.println("Enter Second array size : ");
		int size2 = sc.nextInt();

		int[][] a = new int[size1][size2];
		System.out.println("Enter 2D elements One by One : ");
		
		for(int i =0;i<=a.length-1;i++) {
			
			for(int j =0;j<=a[i].length-1;j++) {
				a[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("Given 2D array is : ");
		
		for(int i = 0; i<=a.length-1;i++) {
			
			for(int j =0;j<=a[i].length-1;j++) {
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}

	}

}
