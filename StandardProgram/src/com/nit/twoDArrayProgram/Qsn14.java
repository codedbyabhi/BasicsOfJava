package com.nit.twoDArrayProgram;

import java.util.Scanner;

public class Qsn14 {
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

		boolean isIdentity = true;
		outer: for (int i = 0; i <= a.length - 1; i++) {
			inner: for (int j = 0; j <= a[i].length - 1; j++) {

				if ((i == j && a[i][j] != 1) || (i != j && a[i][j] != 0)) {
					isIdentity = false;
					break outer;
				}
			}
		}
		if (isIdentity) {
			System.out.println("Identity Matrix.");
		} 
		else {
			System.out.println("Identity is Not Matrix.");
		}
	}
}
