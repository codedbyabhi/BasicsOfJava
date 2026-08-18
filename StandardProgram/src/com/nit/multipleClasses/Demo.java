package com.nit.multipleClasses;
public class Demo {
		public static int k = 100;
		public double j = 200;

		public static void main(String[] args) {
			
			
			
			Demo obj = new Demo();
			A obj1 = new A();
			System.out.println(k);
			System.out.println(obj.j);
			System.out.println(A.x);
			System.out.println(obj1.y);
			obj1.run();
			obj1.walk();
		}
	}

	class A {
		public static int x = 300;
		public double y = 400;

		public static void run() {
			System.out.println("Run fast");
		}

		public void walk() {
			System.out.println("walk slowly");
		}
	}

