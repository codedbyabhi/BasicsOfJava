package com.nit.hashTable;

import java.util.Hashtable;
import java.util.Scanner;

public class HospitalPatientAndAppointmentManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hospital h = new Hospital();
		System.out.println("Enter number of Patients : ");
		int n = sc.nextInt();
		
		for(int i =1;i<=n;i++) {
			
			System.out.println("Enter Id, Name, Age and Disease of Patient : "+i);
			
			int patientId = sc.nextInt();
			sc.nextLine();
			String patientName = sc.nextLine();
			int age = sc.nextInt();
			sc.nextLine();
			String disease =sc.nextLine();
				
			h.registerPatient(new Patient(patientId, patientName, age, disease));
		}
		System.out.println("Enter patient id and new disease to update : ");
		
		int id =sc.nextInt();
		sc.nextLine();
		String newDisease = sc.nextLine();
		h.updateDisease(id, newDisease);
		
		System.out.println("Enter oldID and newID to transfer the patient : ");
		int oldId = sc.nextInt();
		int newId = sc.nextInt();
		h.transferPatient(oldId, newId);
		
		System.out.println("Enter patient Id to display : ");
		int displayId = sc.nextInt();
		h.displayPatient(displayId);
		
	
		
	}
}

class Hospital {

	Hashtable<Integer, Patient> patients = new Hashtable<Integer, Patient>();

	public void registerPatient(Patient p) {

		if(!patients.containsKey(p.patientId)) {
			
			patients.put(p.patientId, p);
			System.out.println(p.patientName + " patient registerd successfully...");
		}
		
		else {
			System.out.println("Patient Id already exists.");
		}

	}

	public void updateDisease(int id, String disease) {

		if (patients.containsKey(id)) {

			patients.get(id).disease = disease;
			System.out.println(patients.get(id).patientName + "'s diesease is updated...");
		}
		else {
			System.out.println("Patient is not found");
		}
	}

	public void displayPatient(int id){
		
		if(patients.containsKey(id)) {
			System.out.println(patients.get(id));
		}
		else {
			System.out.println("Patient is not found");
		}
	}

	public void transferPatient(int oldId, int newId) {
		
		if(!patients.containsKey(oldId)) {
			
			System.out.println("Patient not found");
		}
		else if(patients.containsKey(newId)){
			System.out.println("New Id Already exists");
		}
		else {
			
			Patient oldValue = patients.get(oldId);
			oldValue.patientId = newId;
			patients.remove(oldId); 
			patients.put(newId, oldValue);
			System.out.println(patients.get(newId).patientName+"'s Id is updated successfully...");
			
		}
		
	}

}

class Patient {

	public int patientId;
	public String patientName;
	public int age;
	public String disease;

	public Patient(int patientId, String patientName, int age, String disease) {

		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		this.disease = disease;
	}

	public String toString() {

		return "Patient [patientId = " + patientId + ", patientName = " + patientName + ", age = " + age
				+ ", disease = " + disease + "]";
	}
}