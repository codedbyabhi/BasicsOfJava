package com.nit.staticNonStaticBlock;

public class Demo5 {
	
	public Demo5(int a) {
		System.out.println("Hellu");
	}
	
	public static void main(String[] args) {
		System.out.println();
		new E();
	}

}
class E extends Demo5{
	
	public E(int b, int c) {
		
		super(10);
		System.out.println("Good");
		
	}
	public E() {
		System.out.println("Byee");
		super(20);
	}
}
