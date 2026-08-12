package com.nit.patternProgram;

public class PatternPro9 {

	public static void main(String[] args) {
		int star = 1;

		for (int i = 1; i <= 9; i++) {

			
			for (int b = 1; b <= star; b++) {

				System.out.print(" * ");
			}
			
			if(i<=4) {
				
				star++;
			}
			else {
				star--;
			}
			System.out.println();
		}

	}
	                            
}