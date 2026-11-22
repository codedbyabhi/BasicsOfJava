package com.nit.streamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11, 57, 59, 36, 24));
		Stream<Integer> s = list.stream();
//		System.out.println(s);

//		s.forEach(n -> System.out.println(n)); // by using forEach()
//		
//		Stream<Integer> s1 = s.filter(n -> n > 20);
//		s1.forEach(System.out::println);

//		s.filter(n -> n > 20).forEach(System.out::println);

//		s.filter(Animal::test).forEach(n -> System.out.println(n));
		
		s.map(n->10*n).forEach(System.out::println);
		
		

	}
}

class Animal{
	public static boolean test(Integer t) {

		if (t < 2) {
			return false;
		}
		boolean isPrime = true;

		for (int i = 2; i <= t / 2; i++) {
			if (t % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}

//class MyPredicat implements Predicate<Integer> {
//
//	public boolean test(Integer t) {
//
//		if (t < 2) {
//			return false;
//		}
//		boolean isPrime = true;
//
//		for (int i = 2; i <= t / 2; i++) {
//			if (t % i == 0) {
//				isPrime = false;
//				break;
//			}
//		}
//		return isPrime;
//	}
//
//}