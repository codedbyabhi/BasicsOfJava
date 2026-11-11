package com.nit.hashMapPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class EmployeeManagementSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		EmployeeManagement e = new EmployeeManagement();

		do {
			System.out.println("1. Add Employee");
			System.out.println("2. Search Employee");
			System.out.println("3. Update Employee salary");
			System.out.println("4. Delete Employee");
			System.out.println("5. Display All Employee");
			System.out.println("6. EXIT");
			choice = sc.nextInt();

			switch (choice) {

			case 1 -> {
				System.out.println("Enter Id, Name, Dept and Salary : ");
				int id = sc.nextInt();
				sc.nextLine();
				String name = sc.nextLine();
				String dept = sc.nextLine();
				double salary = sc.nextDouble();
				e.addEmployee(new Employee(id, name, dept, salary));

				}
			
			case 2 -> {
				System.out.println("Enter Id to Search Employee : ");
				int searchId = sc.nextInt();
				System.out.println(e.searchEmployee(searchId));

				}
			
			case 3 ->{
				System.out.println("Enter Id and new Salary to update : ");
				int updateId = sc.nextInt();
				double newSalary = sc.nextDouble();
				System.out.println("Salary update status : "+e.updateSalary(updateId, newSalary));

				}
			
			case 4 ->{
					System.out.println("Enter Id to Delete Employee : ");
					int deleteId = sc.nextInt();
					System.out.println("Employee Delete status : "+e.deleteEmployee(deleteId));
					
				}
			
			case 5 ->{
					e.displayAllEmployees();
				
				}
			
			case 6 ->{}
			
			default -> System.out.println("Enter valid Input.");
			
			}
		} while (choice != 6);

	}

}

class EmployeeManagement {
	public HashMap<Integer, Employee> map = new HashMap<Integer, Employee>();

	public void addEmployee(Employee emp) {

		map.put(emp.getId(), emp);
		System.out.println("Employee " + emp.getName() + " is added successfully...!");
	}

	public Employee searchEmployee(int id) {

		Employee emp = null;
		if (map.containsKey(id)) {

			emp = map.get(id);
		}

		return emp;
	}

	public boolean updateSalary(int id, double newSalary) {

		if (map.containsKey(id)) {
			map.get(id).setSalary(newSalary);
			return true;
		} else {
			return false;
		}

	}

	public boolean deleteEmployee(int id) {
		if (map.containsKey(id)) {
			map.remove(id);
			return true;

		} else {
			return false;
		}
	}

	public void displayAllEmployees() {
		for (Employee emp : map.values()) {
			System.out.println(map);
		}
	}
}

class Employee {
	private int id;
	private String name;
	private String dept;
	private double salary;

	public Employee(int id, String name, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {

		return "Employee [id = " + id + ", name = " + name + ", dept = " + dept + ", salary = " + salary + "]";
	}

}