package com.nit.methodOverloading;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.add(10, 20, 30);

	}

	public char[] j;

	public void add() {

		System.out.println("Addition");
	}

	public void add(int a, int b) {

		System.out.println("Sum of :" + (a + b));
	}

	public void add(int a, int b, int c) {

		System.out.println("Sum of :" + (a + b + c));
	}

}
