package com.nit.linkedListPrograms;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EmployeeManager manager = new EmployeeManager();
		System.out.println("Enter number of Employees : ");
		
		int n = sc.nextInt();
		for(int i =1 ;i<=n;i++) {
			
			System.out.println("Entre Id, name and salary of the Employee : "+i);
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			double salary = sc.nextDouble();
			
			manager.list.add(new Employee(id,name,salary));
		}
		
		manager.sortEmployees();
	}

}

class EmployeeManager {

	public LinkedList<Employee> list = new LinkedList<Employee>();

	public void sortEmployees() {

		Collections.sort(list);
		Iterator<Employee> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

class Employee implements Comparable<Employee> {

	public int id;
	public String name;
	public double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return "Employee [id = " + id + ", name = " + name + ", salary = " + salary + "]";
	}

	public int compareTo(Employee o) {

		if (this.salary != o.salary) {
			return (int) (this.salary - o.salary);
		} else {
			return this.id - o.id;
		}
	}

}