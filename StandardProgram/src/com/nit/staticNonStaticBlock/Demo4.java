package com.nit.staticNonStaticBlock;

public class Demo4 {
	public Demo4(double k) {
		System.out.println("Hello Abhiii");
	}
	public static void main(String[] args) {
		System.out.println("Hii Abhiii");
		
	}
}
class X extends Demo4{
	
	public X(int a, int b) {
		super(1.0);
		System.out.println("Ghost");
	}
	public X() {
		System.out.println("Byee bro");
		super(7.0);
	}
	
}

