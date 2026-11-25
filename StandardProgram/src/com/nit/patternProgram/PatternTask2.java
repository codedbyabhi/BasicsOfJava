package com.nit.patternProgram;

public class PatternTask2 {
	public static void main(String[] args) {

		int a = 1;

		for (int i = 0; i <= 5; i++) {
			int sum = 0;
			for (int j = 0; j < i; j++) {
				System.out.print(a * a + " ");
				a++;

			}
			System.out.println();
		}
	}
}
