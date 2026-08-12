package com.nit.patternProgram;

public class PatternPro14 {

	public static void main(String[] args) {

		int space = 4;
		int starspace = 1;

		for (int i = 1; i <= 5; i++) {

			for (int a = 1; a <= space; a++) {
				System.out.print(" ");

			}
			for (int b = 1; b <= starspace; b++) {

				System.out.print("*_");
			}
			space--;
			starspace++;
			System.out.println();

		}
	}

}
