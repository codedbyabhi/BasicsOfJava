package com.nit.treeMapPrograms;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeManagement em = new EmployeeManagement();

        em.addEmployee(new Employee(101, "Abhijeet", 35000.0, "Dev"));
        em.addEmployee(new Employee(102, "Deepak", 25000.0, "Hr"));
        em.addEmployee(new Employee(103, "Mukesh", 3000.0, "Admin"));
        em.addEmployee(new Employee(104, "Sujit", 23000.0, "Sales"));
        em.addEmployee(new Employee(105, "Raj", 12000.0, "Testing"));

        em.displayAllEmployees();
    }
}

class MyComparator implements Comparator<Integer> {

    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}

class EmployeeManagement {

    public TreeMap<Integer, Employee> map = new TreeMap<Integer, Employee>(new MyComparator());

    public void addEmployee(Employee emp) {

        if (!map.containsKey(emp.getId())) {
            map.put(emp.getId(), emp);
            System.out.println("Employee " + emp.getName() + " is added successfully...!");
        } else {
            System.out.println("Employee Id already Exists.");
        }
    }

    public Employee searchEmployee(int Id) {

        Employee temp = null;

        if (map.containsKey(Id)) {
            temp = map.get(Id);
        } else {
            System.out.println("Employee not Found.");
        }

        return temp;
    }

    public void displayAllEmployees() {

        if (map.isEmpty()) {
            System.out.println("No Employee Record Available.");
            return;
        }

        for (Employee emp : map.values()) {
            System.out.println(emp);
        }
    }

    public int getTotalEmployees() {
        return map.size();
    }
}

class Employee implements Comparable<Employee> {

    private int Id;
    private String Name;
    private double Salary;
    private String Dept;

    public Employee(int id, String name, double salary, String dept) {
        Id = id;
        Name = name;
        Salary = salary;
        Dept = dept;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public String toString() {
        return "Employee [Id=" + Id + ", Name=" + Name +
                ", Salary=" + Salary + ", Dept=" + Dept + "]";
    }

	public int compareTo(Employee o) {
		
		return 0;
	}
}
