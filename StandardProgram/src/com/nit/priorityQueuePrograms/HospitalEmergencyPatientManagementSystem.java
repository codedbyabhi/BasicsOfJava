package com.nit.priorityQueuePrograms;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HospitalEmergencyPatientManagementSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Patients : ");
		int n = sc.nextInt();

		PriorityQueue<Patient> queue = new PriorityQueue<Patient>(new PatientPriorityComparator());

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter " + i + " Patient Id, Name, Age and Priority : ");
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int age = sc.nextInt();
			int priority = sc.nextInt();

			queue.offer(new Patient(id, name, age, priority));
		}

		System.out.println("Next Patient : " + queue.peek());
		System.out.println("All Patient in-Order : ");
//		for (Patient p : queue) {
//
//			System.out.println(p);
//		}

		while (!queue.isEmpty()) {

			System.out.println(queue.poll());
		}

	}

}

class Patient {
	private int id;
	private String name;
	private int age;
	private int priority;

	public Patient(int id, String name, int age, int priority) {

		this.id = id;
		this.name = name;
		this.age = age;
		this.priority = priority;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getPriority() {
		return priority;
	}

	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", priority=" + priority + "]";
	}
}

class PatientPriorityComparator implements Comparator<Patient> {

	public int compare(Patient o1, Patient o2) {

		if (o1.getPriority() != o2.getPriority()) {

			return o1.getPriority() - o2.getPriority();
		} else if (o1.getAge() != o2.getAge()) {

			return o2.getAge() - o1.getAge();
		} else {

			return o1.getId() - o2.getId();
		}
	}

}
