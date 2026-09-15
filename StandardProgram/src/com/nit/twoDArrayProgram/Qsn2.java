//Second way to Create 2D Array.
package com.nit.twoDArrayProgram;

import java.util.Scanner;

public class Qsn2 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int size1 = sc.nextInt();
//		int size2 = sc.nextInt();

		int[][] a = new int[3][3];
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;
		a[2][0] = 70;
		a[2][1] = 80;
		a[2][2] = 90;
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j <= a[i].length - 1; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();

		}
	}

}
