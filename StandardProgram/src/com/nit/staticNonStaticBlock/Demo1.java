package com.nit.staticNonStaticBlock;

public class Demo1 {
	static {
		System.out.println("Moon");
	}
	public Demo1() {
		System.out.println("Sun");
	}
	public static void main(String[] args) {
		
		System.out.println("Bye");
		Demo1 d = new Demo1();
		B d1 = new B();
	}
	{
		System.out.println("Hello");
	}
}

class B {
	public B() {
		System.out.println("Good");
	}
	static{
		System.out.println("Hi");
	}
	{
		System.out.println("System");
	}
}