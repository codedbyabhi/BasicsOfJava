package com.nit.hashTable;

import java.util.Hashtable;

public class HashTableQsn2 {

}

class StudentManagement {

	public Hashtable<Integer, Student> table = new Hashtable<Integer, Student>();

	public void addStudent(Student s) {
		
		table.put(s.studentId, s);
		System.out.println(s.name+" is added sucessfully...!");
	}
	public void display(int id) {
		
		if(table.containsKey(id)) {
			System.out.println(table.get(id));
		}
		else {
			System.out.println("Student ID doesn't exits");
		}

	}

}

class Student {
	public int studentId;
	public String name;
	public double marks;

	public Student(int studentId, String name, double marks) {

		this.studentId = studentId;
		this.name = name;
		this.marks = marks;
	}

	public String toString() {
		
		return "Student [studentId=" + studentId + ", name=" + name + ", marks=" + marks + "]";
	}

}
