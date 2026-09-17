package com.nit.twoDArrayProgram;

import java.util.Scanner;

public class Qsn5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Rows : ");
		int rows = sc.nextInt();
		System.out.println("Enter number of Columns : ");
		int column = sc.nextInt();

		int[][] a = new int[rows][column];

		System.out.println("Enter the Matrix : ");
		for (int i = 0; i <= a.length - 1; i++) {

			for (int j = 0; j <= a[i].length - 1; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		
		
		System.out.println("Give the Matrix : ");
		for (int i = 0; i <= a.length - 1; i++) {

			for (int j = 0; j <= a[i].length - 1; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}


if(a.length % 2 != 0){
    System.out.println(a[a.length / 2]);
}
else{
    System.out.println(a[a.length / 2 - 1] + " " + a[a.length / 2]);
}