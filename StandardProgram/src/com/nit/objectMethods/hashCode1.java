package com.nit.objectMethods;

import java.util.Objects;

public class hashCode1 {
	public static void main(String[] args) {
		
		Demo1 a = new Demo1(2, "Monkey");
		Demo1 b = new Demo1(2, "Monkey");
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}
}
class Demo1{
	public int age;
	public String name;
	public Demo1(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Demo1 [age=" + age + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Demo1 other = (Demo1) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
}
