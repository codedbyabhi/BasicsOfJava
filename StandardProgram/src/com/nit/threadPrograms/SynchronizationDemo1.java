package com.nit.threadPrograms;

public class SynchronizationDemo1 {

	public static void main(String[] args) {
		Whatsapp1 wa = new Whatsapp1();
		MYThread4 t1 = new MYThread4(wa, "Ramesh");
		MYThread4 t2 = new MYThread4(wa, "Suresh");
		t1.start();
		t2.start();
	}
}

class MYThread4 extends Thread {
	public Whatsapp1 wa;
	public String name;
	
	public MYThread4(Whatsapp1 wa2, String name) {
		super();
		this.wa = wa2;
		this.name = name;
	}

	public void run() {
		wa.sendMessage(name);
	}
}

class Whatsapp1{
	
	public void sendMessage(String name) {
		System.out.println(name+" Get ready");
		System.out.println(name+" Had Breakfust");
		System.out.println(name+" Wait in hall");
		synchronized (this) {
			System.out.println(name+" go inside interview room");
			System.out.println(name+" give introduction");
			System.out.println(name+" came back from interview Room");
		}
		System.out.println(name+" go toward bus");
		System.out.println(name+" Go to pg");
		
	}
	
}

