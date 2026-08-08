package com.nit.patternProgram;

public class PatternDemo5 {
public static void main(String[] args) {
		
		for(int set = 1; set<=5; set++) {
			
			for(int pushup = 1; pushup<=5; pushup++) {
				
				if(set==1 || set==5||pushup==1||pushup==5) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}