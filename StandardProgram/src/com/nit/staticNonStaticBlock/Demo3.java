package com.nit.staticNonStaticBlock;

public class Demo3 {

	public static void main(String[] args) {
		System.out.println("Hello");
		new D();
	}
}

class D extends Demo3 {

	public D() {
		System.out.println("Bye");
	}
}
