package com.nit.staticNonStaticBlock;

public class Demo {
	public static int x =10;

	public static void main(String[] args) {

		System.out.println();
		run();
		A ob = new A();
	}

	public static void run() {

		System.out.println("Bhag mukesh Bhag 🏃🏿‍♂️‍➡️🏃🏿‍♂️‍➡️🏃🏿‍♂️‍➡️ ");
	}

	static {
		
		System.out.println("Abhijeet sabka papa "+x);
	
	}
	static {
	
		System.out.println("HEeey "+x);
	
	}
}
class A{
	
	public A() {
		
		System.out.println("Sujit Deepak");
	}
	
	static {
		System.out.println("party When? ");
	}
	
}