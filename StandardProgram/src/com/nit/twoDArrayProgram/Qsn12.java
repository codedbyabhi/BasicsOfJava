package com.nit.twoDArrayProgram;

import java.util.Scanner;

public class Qsn12 {
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

		
		
		for (int i = 0; i <= a.length - 1; i++) {
			int sum = 0;
			for (int j = 0; j <= a[i].length - 1; j++) {
				sum = sum + a[i][j];
			}
			System.out.println("Sum of "+(i+1)+" Row : "+sum);
		}
		for (int i = 0; i <= a.length - 1; i++) {
			int sum = 0;
			for (int j = 0; j <= a[i].length - 1; j++) {
				sum = sum + a[j][i];
			}
			System.out.println("Sum of "+(i+1)+" Column : "+sum);
		}
	}
}
