package com.nit.patternProgram;

public class PatternDemo {

	public static void main(String[] args) {
		
		for(int set = 1; set<=4; set++) {
			
			for(int pushup = 1; pushup<=5; pushup++) {
				
				if(set==2 && pushup==2) {
					
					System.out.print("  ");
				}
				else {
					
				System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
	}
}
