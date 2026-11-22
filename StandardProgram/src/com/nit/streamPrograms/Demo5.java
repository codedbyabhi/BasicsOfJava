//distinct method it removes Duplicate.
package com.nit.streamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Demo5 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 5, 8, 9, 4, 5, 6, 7, 8));
		Stream<Integer> s = list.stream();

		s.distinct().forEach(n -> System.out.println(n));
	}
}