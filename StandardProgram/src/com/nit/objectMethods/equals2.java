package com.nit.objectMethods;

import java.util.Objects;

public class equals2 {
	public static void main(String[] args) {
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		System.out.println(s1.equals(s2));// true
		Animal1 a = new Animal1(3, "Dog");
		Animal1 b = new Animal1(3, "Dog");
		System.out.println(a.equals(b));// false
	}
}

class Demo {
	public int age;
	public String name;

	public Demo(int age, String name) {
		super();
		this.age = age;
		this.name = name;

	}

	@Override
	public String toString() {
		return "Demo [age=" + age + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Demo other = (Demo) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	

}
