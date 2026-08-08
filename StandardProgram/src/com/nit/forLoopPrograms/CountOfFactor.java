package com.nit.forLoopPrograms;

import java.util.Scanner;

public class CountOfFactor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				
				System.out.println(i);

				count++;
			}
		}
		System.out.println("The count of the Factor : "+count);
	}
}
