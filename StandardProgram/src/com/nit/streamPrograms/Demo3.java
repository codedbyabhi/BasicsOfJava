package com.nit.streamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Demo3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8));
		Stream<Integer> s = list.stream();

		long c = s.filter(n -> n % 2 == 0).count();
		System.out.println(c);

	}
}
