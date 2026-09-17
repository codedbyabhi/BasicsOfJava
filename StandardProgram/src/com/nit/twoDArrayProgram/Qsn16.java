package com.nit.twoDArrayProgram;

import java.util.Scanner;

public class Qsn16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Rows of First Matrix: ");
		int rows = sc.nextInt();
		System.out.println("Enter number of Columns of First Matrix: ");
		int column = sc.nextInt();

		int[][] a = new int[rows][column];

		System.out.println("Enter the First Matrix : ");
		for (int i = 0; i <= a.length - 1; i++) {

			for (int j = 0; j <= a[i].length - 1; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter number of Rows of First Matrix: ");
		int rows1 = sc.nextInt();
		System.out.println("Enter number of Columns of First Matrix: ");
		int column1 = sc.nextInt();

		int[][] b = new int[rows1][column1];

		System.out.println("Enter the First Matrix : ");
		for (int i = 0; i <= a.length - 1; i++) {

			for (int j = 0; j <= a[i].length - 1; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		
		
		
		int[][] c = new int[a.length][b.length];

		System.out.println("Enter the First Matrix : ");
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j <= a.length - 1; j++) {

				int sum = 0;
				for (int k = 0; k <= a.length - 1; k++) {
					sum = sum + a[i][k] * b[k][j];         //this if kinda formula look and revice.
				}
				c[i][j]=sum;
			}	
		}
		for (int i = 0; i <= c.length - 1; i++) {

			for (int j = 0; j <= c[i].length - 1; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
