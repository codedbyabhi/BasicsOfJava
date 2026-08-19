package com.nit.classObject;

public class Demo3 {

	public static void main(String[] args) {
		
		student1 s1=new student1();
		s1.name = "Abhi";
		s1.age = 12;
		s1.school = "ABC School";
		s1.city = "Hyderabad";

		student1 s2 = new student1();
		s2.name = "Ramya";
		s2.age = 13;
		s2.school = "ABC School";
		s2.city = "Hyderabad";

		student1 s3 = new student1();
		s3.name = "Shekhar";
		s3.age = 15;
		s3.school = "ABC School";
		s3.city = "Hyderabad";
		
		System.out.println("Student 1 details : ");
		s1.display();
		System.out.println("Student 2 details : ");
		s2.display();
		System.out.println("Student 3 details : ");
		s3.display();
	}
}
class student1{

	public String name;
	public int age;
	public static String school;
	public static String city;

	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("School : "+school);
		System.out.println("City : "+city);
	}		
	
}