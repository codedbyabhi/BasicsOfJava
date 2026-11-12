package com.nit.functinalInterfaces;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionDemo3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for Square : ");
		int n = sc.nextInt();
		
		Function<Integer, Integer> square = num -> num * num;
		
		System.out.println(square.apply(n));
		
	}

}
