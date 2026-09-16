//To determine two matrix are equal or not. 
package com.nit.twoDArrayProgram;

import java.util.Scanner;

public class Qsn8 {
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
		System.out.println("Enter number of Rows of Second Matrix: ");
		int rows1 = sc.nextInt();
		System.out.println("Enter number of Columns of Second Matrix: ");
		int column1 = sc.nextInt();

		int[][] b = new int[rows1][column1];

		System.out.println("Enter the Matrix : ");
		for (int i = 0; i <= b.length - 1; i++) {

			for (int j = 0; j <= b[i].length - 1; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		
		boolean isEqual = true;
		outer:
		for (int i = 0; i <= b.length - 1; i++) {
			inner:
			for (int j = 0; j <= b[i].length - 1; j++) {
				if(a[i][j]!=b[i][j]) {
					isEqual = false;
					break outer;
				}
			}
		}
		if(isEqual) {
			System.out.println("Matrix are Equal.");
		}
		else {
			System.out.println("Matrix are Not Equal");
		}
		
	}

}
