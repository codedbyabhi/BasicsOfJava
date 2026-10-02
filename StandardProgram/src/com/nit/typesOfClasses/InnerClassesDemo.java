package com.nit.typesOfClasses;

public class InnerClassesDemo {
	public static void main(String[] args) {
		Car.Engine eng = new Car().new Engine(200, 15);
		Car cr = new Car("i20",eng);
		System.out.println(cr);
	}

}

class Car {
	public String name;
	public Engine engine;

	public Car() {}
	public Car(String name, Engine eng) {

		this.name = name;
		this.engine = eng;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", engine=" + engine + "]";
	}

	class Engine {
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
}