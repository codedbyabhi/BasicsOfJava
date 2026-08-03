package com.nit.forLoopPrograms;

import java.util.Scanner;

public class ReadMinMaxValue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start number :");
		int min = sc.nextInt();
		System.out.println("Enter End number :");
		int max = sc.nextInt();

		for (int i = min; i <= max; i++) {

			System.out.println(i);
		}

	}

}
