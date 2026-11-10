package com.nit.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeSalaryManagementSystem{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Employess : ");
		int n = sc.nextInt();
		ArrayList<Employee3> list = new ArrayList<Employee3>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter Id, name and salary of the employee : " + i);
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			double salary = sc.nextDouble();
			list.add(new Employee3(id, name, salary));

		}
		Collections.sort(list, (o1, o2) -> (int) (o1.salary - o2.salary));
		System.out.println();
		System.out.println("After sorting based on salary in ascending order");
		for (Employee3 emp : list) {
			System.out.println(emp);
		}

		Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name));
		System.out.println();
		System.out.println("After sorting based on name in alphabetical order");
		for (Employee3 emp : list) {
			System.out.println(emp);

		}

	}

}

class Employee3 {
	public int id;
	public String name;
	public double salary;

	public Employee3(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return "Employee3 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}