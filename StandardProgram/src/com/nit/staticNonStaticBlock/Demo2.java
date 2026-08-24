package com.nit.staticNonStaticBlock;

public class Demo2 {

	public static void main(String[] args) {

		C obj = new C(10, 20);
		C obj1 = new C(obj);

		System.out.println(obj1.k + "------" + obj.j);
	}
}

class C {

	public int k;
	public int j;

	public C(int k, int j) {

		this.k = k;
		this.j = j;

	}

	public C(C ob) {

		this.k = ob.k;
		this.j = ob.j;
	}

}