package com.nit.functinalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PredicatDemo {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(12,14,15,16,18));
		Predicate<Integer> p = t -> t % 2 == 0;

		for (Integer e : list) {
			if (p.test(e)) {
				System.out.println(e);
			}
		}
	}

}
