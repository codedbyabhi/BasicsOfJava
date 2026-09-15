package com.nit.twoDArrayProgram;

import java.util.Scanner;

public class Qsn4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter outer array size : ");
		int outterArray = sc.nextInt();
		int[][] a = new int[outterArray][];
		System.out.println("Enter 2D elements One by One : ");
		for (int i = 0; i <= a.length - 1; i++) {
			
			System.out.println("Enter "+(i+1)+" inner array size");
			int innerArray = sc.nextInt();
			a[i]= new int [innerArray];
			System.out.println("Enter "+(i+1)+" inner array element one by one : ");
			for (int j = 0; j <= a[i].length - 1; j++) {
				a[i][j] = sc.nextInt();
			}

		}
		System.out.println("Given two directional jagged array is : ");
		for(int i =0; i<=a.length-1;i++) {
			
			for(int j = 0; j<=a[i].length-1;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
