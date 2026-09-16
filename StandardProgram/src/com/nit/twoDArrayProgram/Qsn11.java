package com.nit.twoDArrayProgram;

import java.util.Scanner;

public class Qsn11 {
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
		int even = 0;
		int odd = 0;
		for (int i = 0; i <= a.length - 1; i++) {

			for (int j = 0; j <= a[i].length - 1; j++) {
				if (a[i][j] % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			}
		}
		System.out.println("Frequency of even Number : " + even);
		System.out.println("Frequency of odd Number : " + odd);

	}
}
