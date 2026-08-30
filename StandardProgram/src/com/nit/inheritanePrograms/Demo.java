package com.nit.inheritanePrograms;

public class Demo {
	public static void main(String[] args) {
		System.out.println(B.k);
	}
}
class A{
	
	static{
		System.out.println("Static A");
	}
	public static int k = 100;
	public static void run() {
		System.out.println("Hello");
	}
}
class B extends A{
	
	static {
		System.out.println("Static B");
		
	}
	public static int m = 200;
	public static void jump() {
		System.out.println("Byeee");
	}
}
