package com.nit.classObject;

class Demo4 {
	public static void main(String[] args) {
		Car2 c1 = new Car2("Whyyy");
		Car2 c2 = new Car2();
		c1.jump();
	}
}

class Car2 {

	public Car2() {

		System.out.println("Byeee");
	}

	public Car2(String s) {
		System.out.println("Hello");
		System.out.println(s);
	}

	public void jump() {
		System.out.println("Jump Bitchhh");
	}
}
