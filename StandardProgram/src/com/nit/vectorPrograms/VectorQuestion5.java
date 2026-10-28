package com.nit.vectorPrograms;

import java.util.Vector;

public class VectorQuestion5 {

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
		} 
		else {
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
		for(int i )
	}
}