//Sorted methiod.
package com.nit.streamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Demo4 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,3,4,7,6,3,2,5,1,8));
		Stream<Integer> s = list.stream();

		s.sorted((o1,o2)-> o2-o1).forEach(System.out::println);
	}
}
