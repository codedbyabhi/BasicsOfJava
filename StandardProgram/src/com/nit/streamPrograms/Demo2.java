package com.nit.streamPrograms;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Product's price one by one : ");

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			list.add(sc.nextInt());
		}
		
		Stream<Integer> s = list.stream();

		s.map(n -> 0.8 * n).filter(n -> n > 500).forEach(System.out::println);
	}
}