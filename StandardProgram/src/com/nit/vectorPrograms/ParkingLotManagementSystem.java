package com.nit.vectorPrograms;

import java.util.Vector;

public class ParkingLotManagementSystem {

	public static void main(String[] args) {
		ParkingLot p1 = new ParkingLot();
		p1.parkVehicle(2, "MH27DG9950");
		p1.parkVehicle(2, "MH39BA5567");
		p1.removeVehicle(2);
		p1.displayAllSlots();

	}

}

class ParkingSlot {
	public int slotNumer;
	public String vehicleNumber = "";
	public boolean occupied = false;

	public ParkingSlot(int slotNumer) {

		this.slotNumer = slotNumer;
	}

	public boolean parkVehichal(String vehicleNumber) {

		if (occupied == false) {
			this.vehicleNumber = vehicleNumber;
			occupied = true;
			return true;
		} else {
			return false;
		}
	}

	public void removeVehichal() {

		if (occupied == true) {
			vehicleNumber = "";
			occupied = false;
		}
	}

	public void displaySlot() {
		System.out.println("Slot Nummber : " + slotNumer);
		System.out.println("Occupied status : " + occupied);
		if (occupied == true) {
			System.out.println("Vehicle number : " + vehicleNumber);
		}
	}
}

class ParkingLot {

	public Vector<ParkingSlot> slots = new Vector<ParkingSlot>();

	public ParkingLot() {

		for (int i = 1; i <= 5; i++) {
			slots.add(new ParkingSlot(i));
		}
	}

	public void parkVehicle(int slotNumber, String vehicleNumber) {
		boolean isSlotFound = false;
		for (ParkingSlot slot : slots) {

			if (slot.slotNumer == slotNumber) {
				isSlotFound = true;
				if (slot.parkVehichal(vehicleNumber)) {
					System.out.println("Vehicle parked successfully...!");
				} else {
					System.out.println("Slot is already occupied");
				}

			}
			if (isSlotFound == false) {
				System.out.println("Invalid slot Number. ");
			}
		}

	}

	public void removeVehicle(int slotNumber) {
		boolean isSlotFound = false;
		for (ParkingSlot slot : slots) {
			if (slot.slotNumer == slotNumber) {
				if (slot.occupied == true) {
					slot.removeVehichal();
					System.out.println("Vehicle remove successfully...!");
					isSlotFound = true;

				} else {
					System.out.println("Slot is already Empty.");
				}

			}
		}
		if (isSlotFound == false) {
			System.out.println("Invalid slot Numeber.");
		}

	}

	public void displayAllSlots() {
		for (ParkingSlot slot : slots) {
			slot.displaySlot();
			System.out.println();

		}
	}

}
