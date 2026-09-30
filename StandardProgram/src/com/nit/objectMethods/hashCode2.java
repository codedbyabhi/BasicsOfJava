package com.nit.objectMethods;

import java.util.Objects;

public class hashCode2 {
	public static void main(String[] args) {
		
		Demo2 a = new Demo2(2, "Monkey");
		Demo2 b = new Demo2(2, "Monkey");
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}
}
class Demo2{
	public int age;
	public String name;
	public Demo2(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Demo2 [age=" + age + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(true);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Demo2 other = (Demo2) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
}
