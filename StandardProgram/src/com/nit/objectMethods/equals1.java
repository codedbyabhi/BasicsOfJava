package com.nit.objectMethods;

import java.util.Objects;

public class equals1 {

	public static void main(String[] args) {
		
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		System.out.println(s1.equals(s2));//true
		Animal a = new Animal(3, "Dog");
		Animal b = new Animal(3, "Dog");
		System.out.println(a.equals(b));//false
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

	
	public int hashCode() {
		return Objects.hash(Integer.valueOf(age), name);
	}

	public boolean equals(Object obj) {
		Animal other = (Animal) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
}
