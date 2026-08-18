package com.nit.classObject;

public class Demo {
	public static void main(String[] args) {
		
	//Demo obj = new Demo();
	Student s1 =  new Student();
	
	s1.name ="Abhi";
	s1.age = 12;
	s1.school = "ABC School";
	s1.city = "Hyderabad";
	
	Student s2 =  new Student();
	s2.name ="Ramya";
	s2.age = 13;
	s2.school = "ABC School";
	s2.city = "Hyderabad";
	
	Student s3 =  new Student();
	s3.name ="Shekhar";
	s3.age = 15;
	s3.school = "ABC School";
	s3.city = "Hyderabad";
	
	System.out.println("Student 1 details :");
	System.out.println("Name : "+s1.name);
	System.out.println("Age : "+s1.age);
	System.out.println("School : "+s1.school);
	System.out.println("City : "+s1.city);
	
	
	System.out.println("Student 2 details :");
	System.out.println("Name : "+s2.name);
	System.out.println("Age : "+s2.age);
	System.out.println("School : "+s2.school);
	System.out.println("City : "+s2.city);
	
	
	System.out.println("Student 3 details :");
	System.out.println("Name : "+s3.name);
	System.out.println("Age : "+s3.age);
	System.out.println("School : "+s3.school);
	System.out.println("City : "+s3.city);
	
	}
}

class Student {
	
	public String name;
	public int age;
	public static String school = "ABC";
	public static String city = "Hyderabad";
}
