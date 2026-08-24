package com.nit.staticNonStaticBlock;

public class Demo1 {
	public static void main(String[] args) {
		B obj = new B();
		B obj1 = obj;
		obj.k = 200;
		System.out.println(obj1.k);
	}
}

class B {
	public int k = 100;
}