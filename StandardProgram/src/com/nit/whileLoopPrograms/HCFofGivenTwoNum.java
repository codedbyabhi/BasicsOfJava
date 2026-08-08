package com.nit.whileLoopPrograms;

import java.util.Scanner;

public class HCFofGivenTwoNum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value one by one : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		for (int i = n1; i >= 1; i--) {

			if (n1 % i == 0 && n2 % i == 0) {

				System.out.println("HCF is " + i);
				break;
			}

		}
	}

}
