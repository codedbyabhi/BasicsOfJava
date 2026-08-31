package com.nit.interfacePrograms;

public class InterfaceDemo {

	public static void main(String[] args) {
		
		Device d = new Fan();
		d.turnOn();
		d.turnOff();
		Device d1 = new Light();
		d1.turnOn();
		d1.turnOff();
		Speaker d2 = new Speaker();
		d2.turnOn();
		d2.connectToWifi();
		d2.turnOff();

	}

}

interface Device {

	void turnOn();//this is by default public, final  and abstract.

	void turnOff();

}

interface BluetoothDevice {
	public abstract void connectToWifi();

}

class Speaker implements Device, BluetoothDevice{

	public void connectToWifi() {
		System.out.println("Connected to Wifi...");
		
	}
	public void turnOn() {
		System.out.println("Speaker turend on");
	}

	public void turnOff() {
		System.out.println("Speaker turend OFF");
	}

}

class Fan implements Device {

	public void turnOn() {
		System.out.println("Fan is turned On");

	}

	public void turnOff() {
		System.out.println("Fan is turend OFF");

	}

}

class Light implements Device {

	public void turnOn() {
		System.out.println("Light is turned On");

	}

	public void turnOff() {
		System.out.println("Light is turend OFF");

	}

}
