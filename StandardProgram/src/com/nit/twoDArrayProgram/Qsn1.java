//First way to Create 2D Array
package com.nit.twoDArrayProgram;

import java.util.Scanner;

public class Qsn1 {
	public static void main(String[] args) {
		// Scanner sc = new Scanner (System.in);// in 2D u can't take input from user.

		int[][] a = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		for (int i = 0; i <= a.length - 1; i++) {

			for (int j = 0; j <= a[i].length - 1; j++) {

				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
