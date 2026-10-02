package com.nit.typesOfClasses;

public class InnerClassesDemo {
	public static void main(String[] args) {
		Car.Engine eng = new Car.Engine(200, 15);
		Car cr = new Car("Nexon", eng);
		System.out.println(cr);
	}
	
}

class Car {

	private class Engine {
		public int hp;
		public double milage;

		public Engine(int hp, double milage) {
			this.hp = hp;
			this.milage = milage;
		}

		@Override
		public String toString() {
			return "Engine [hp=" + hp + ", milage=" + milage + "]";
		}

	}

	public String name;
	public String engine;

	@Override
	public String toString() {
		return "Car [name=" + name + ", engine=" + engine + "]";
	}
}