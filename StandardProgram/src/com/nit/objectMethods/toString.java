package com.nit.objectMethods;

public class toString {

	public static void main(String[] args) {

		Animal a1 = new Animal(2, "Dog");
		System.out.println(a1);
		Animal a2 = new Animal(3, "Cat");
		System.out.println(a2);

	}
}
class Animal {
	public int age;
	public String name;

	public Animal(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return "Animal [age=" + age + ", name=" + name + "]";
	}

	public void run() {
		System.out.println("Run Fast");
	}
}
