package com.nit.classObject;

public class ConstructorCallDemo {
	
	public static void main(String[] args) {
		
		new A();
	}

}
class A{
	
	public A() {
		this(1,2);
		System.out.println("Hiii");
		
	}
	public A(int k ) {
	
		System.out.println("Hello");
		
	}
public A(int a, int b) {
	this(4);
	System.out.println("Byee");
		
	}
}
