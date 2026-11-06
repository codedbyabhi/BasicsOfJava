package com.nit.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableInterfaceDemo {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Abhi", 1000.00, 22));
		list.add(new Employee("Aditya", 2000.00, 34));
		list.add(new Employee("Sanjay", 7000.00, 26));
		list.add(new Employee("Raju", 4000.00, 27));
		list.add(new Employee("Kailash", 5000.00, 41));
		Collections.sort(list);
		System.out.println(list);
	}
}

class Employee implements Comparable<Employee> {
	public String name;
	public double salary;
	public int age;

	public Employee(String name, double salary, int age) {

		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}

	public int compareTo(Employee o) {
		
		//return (int) (this.salary - o.salary); // increase order ->Assending prder
		// return (int) (o.salary-this.salary); //Decrease order ->Decending order
		
		return (int) (this.age-o.age);
	}

}
