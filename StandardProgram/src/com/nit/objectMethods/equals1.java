package com.nit.objectMethods;

import java.util.Objects;

public class equals1 {

	public static void main(String[] args) {

		String s1 = new String("ABC");
		String s2 = new String("ABC");
		System.out.println(s1.equals(s2));// true
		Animal1 a = new Animal1(3, "Dog");
		Animal1 b = new Animal1(3, "Dog");
		System.out.println(a.equals(b));// false
	}
}

class Animal1 {
	public int age;
	public String name;

	public Animal1(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public String toString() {
		return "Animal [age=" + age + ", name=" + name + "]";
	}

	public boolean equals(Object obj) {
		Animal1 other = (Animal1) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
}
