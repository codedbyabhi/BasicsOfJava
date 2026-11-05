package com.nit.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class CamparatorInterfaceDemo {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Abhi", 1000.00, 22));
		list.add(new Employee("Aditya", 2000.00, 34));
		list.add(new Employee("Sanjay", 7000.00, 26));
		list.add(new Employee("Raju", 4000.00, 27)); 
		list.add(new Employee("Kailash", 5000.00, 41));
//		Collections.sort(list,new MyComparator());
//		Collections.sort(list,Collections.reverseOrder());
		Collections.sort(list, (o1,o2)->(int) (o2.salary-o1.salary));
		
		System.out.println(list);
	}

}
//class MyComparator implements Comparator<Employee2> {
//
//	public int compare(Employee2 o1, Employee2 o2) {
//
//		return (int) (o1.salary - o2.salary);
//	}
//}

class Employee2 {
	public String name;
	public double salary;
	public int age;

	public Employee2(String name, double salary, int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public String toString() {
		return "Employee2 [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
}