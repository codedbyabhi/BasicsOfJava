package com.nit.functinalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
	
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(12, 14, 15, 16, 18));
		
		UnaryOperator<Integer> f = t -> {
			
			int count = 0;
			for (int i = 1; i <= t; i++) {
				
				if (t % i == 0) {
					count++;
				}
			}
			return count;
		};
		for (Integer e : list) {
			
			System.out.println(e + " -> " + f.apply(e));
		}
	}

}
