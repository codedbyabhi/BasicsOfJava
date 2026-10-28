package com.nit.vectorPrograms;

import java.util.Vector;

public class VectorQuestion5 {
	public static void main(String[] args) {
		Hospital apollo = new Hospital();
		apollo.addEquipment(new MedicalEquipment(101, "ECG machine"));
		apollo.addEquipment(new MedicalEquipment(102, "Wheelchair"));
		apollo.addEquipment(new MedicalEquipment(103, "Oxygen concentrator"));
		
		apollo.issueEquipment(102);
		apollo.issueEquipment(102);
		apollo.returnEquipment(102);
		System.out.println();
		apollo.displayAllEquipment();
		
	}
}

class MedicalEquipment {
	public int equipmentId;
	public String equipmentName;
	public boolean available = true;

	public MedicalEquipment(int equipmentId, String equipmentName) {

		this.equipmentId = equipmentId;
		this.equipmentName = equipmentName;
	}

	public boolean issueEquipment() {
		if (available) {
			available = false;
			return true;
		} else {
			return false;
		}
	}

	public void returnEquipment() {
		if (available == false) {
			available = true;
		}
	}

	public void displayEquipment() {
		System.out.println("Equipment Id : " + equipmentId);
		System.out.println("Equipment Name : " + equipmentName);
		System.out.println("Available status = " + available);
	}
}

class Hospital {
	public Vector<MedicalEquipment> equipmentList = new Vector<MedicalEquipment>();

	public void addEquipment(MedicalEquipment equipment) {
		equipmentList.add(equipment);
		System.out.println(equipment.equipmentName + " is added to EquipmentList");
	}

	public void issueEquipment(int equipmentId) {
		boolean isEquipmentFound = false;
		for (MedicalEquipment e : equipmentList) {

			if (e.equipmentId == equipmentId) {
				if (e.available) {
					e.issueEquipment();
					System.out.println("Equipment issue successfully..!");
				} else {
					System.out.println("Equipment is currently unavailable.");
				}
				isEquipmentFound = true;
			}
		}
		if (isEquipmentFound == false) {
			
			System.out.println("Equipment not Found.");
		}

	}
	public void returnEquipment(int equipmenId) {
		
		boolean isEquipmentFound = false;
		for (MedicalEquipment e : equipmentList) {

			if (e.equipmentId == equipmenId) {
				if (e.available==false) {
					e.returnEquipment();
					System.out.println("Equipment return successfully..!");
				} else {
					System.out.println("Equipment is already available.");
				}
				isEquipmentFound = true;
			}
		}
		if (isEquipmentFound == false) {
			
			System.out.println("Equipment not Found.");
		}
		
	}
	public void displayAllEquipment() {
		for(MedicalEquipment e : equipmentList) {
			
			e.displayEquipment();
			System.out.println();
		}
	}
}