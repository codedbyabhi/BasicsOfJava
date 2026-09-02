package com.nit.inheritanePrograms;

import java.util.Scanner;

public class LabTask03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name: ");
		String name=sc.nextLine();
		System.out.println("Enter Student Roll Number: ");
		int rollNumber=sc.nextInt();
		System.out.println("Enter Subject1 Marks: ");
		int subject1=sc.nextInt();
		System.out.println("Enter Subject2 Marks: ");
		int subject2=sc.nextInt();
		System.out.println("Enter Subject3 Marks: ");
		int subject3=sc.nextInt();
		
		
		ScienceStudent ss = new ScienceStudent(name, rollNumber, subject1, subject2, subject3);
		
		ss.displayDetails();
	}

}
class Student3{
	protected String name;
	protected int rollNumber;
	
	Student3(String name,int rollNumber){
		this.name=name;
		this.rollNumber=rollNumber;
	}
	public void displayDetails(){
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollNumber);
		
	}
	public double calculatePercentage() {
		
		return 0.0;
	}
}
class ScienceStudent extends Student3{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	
	ScienceStudent(String name, int rollNumber, int physicsMarks, int chemistryMarks, int mathsMarks){
		super(name,rollNumber);
		this.physicsMarks=physicsMarks;
		this.chemistryMarks=chemistryMarks;
		this.mathsMarks=mathsMarks;
		
	}
	public double calculatePercentage() {
		
		return (physicsMarks+chemistryMarks+mathsMarks)/3.0;
	}
	public void displayDetails() {
		if(physicsMarks<0 || physicsMarks>100 || chemistryMarks<0 || chemistryMarks>100 || mathsMarks<0 || mathsMarks>100) {
			System.out.println("Error Invalid Input");
		}
		else {
		super.displayDetails();
		System.out.println("Physics Marks: "+physicsMarks);
		System.out.println("Chemistry Marks: "+chemistryMarks);
		System.out.println("Math Marks: "+mathsMarks);
		
		System.out.println("Percentage: "+calculatePercentage()+"%");
		}
	}
	
	
}
class ArtsStudent extends Student3{
	private int historyMarks;
	private int geographyMarks;
	private int englishMarks;
	public ArtsStudent(String name, int rollNumber, int historyMarks, int geographyMarks, int englishMarks) {
		super(name, rollNumber);
		this.historyMarks = historyMarks;
		this.geographyMarks = geographyMarks;
		this.englishMarks = englishMarks;
	}
	public double calculatePercentage(){
		
		return(historyMarks+geographyMarks+englishMarks)/3.0;
		
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("History Marks: "+historyMarks);
		System.out.println("Geography Marks: "+geographyMarks);
		System.out.println("English Marks: "+englishMarks);
		
		System.out.println("Percentage: "+calculatePercentage()+"%");
	}
}