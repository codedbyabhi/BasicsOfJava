package com.nit.basicsofjava;

import java.util.Scanner;

public class RelationalOperator2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numOfDays = sc.nextInt();
		int currentBooking = sc.nextInt();

		if (numOfDays <= 2 && currentBooking < 6) {
			System.out.println("Tatkal Allowed");
		} else {
			System.out.println("Not Allowed");
		}
	}
}
