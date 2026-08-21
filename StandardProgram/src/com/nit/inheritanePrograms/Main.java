package com.nit.inheritanePrograms;

public class Main {
	public static void main(String[] args) {

		Addition add = new Addition(10, 20);
		add.getSum(); 
		Substraction sub=new Substraction(5,3);
		sub.getSub();
		Multiplecation mul=new Multiplecation(5,2);
		mul.getProduct();
		Division div=new Division(4,2);
		div.getqutient();
		Reminder rem=new Reminder(9,2);
		rem.getReminder();
		
	}

}

class Calculation {

	public int x;
	public int y;
}

class Addition extends Calculation {

	public Addition(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public void getSum() {

		System.out.println("additon : "+(x + y));
	}

}

class Substraction extends Calculation {

	public Substraction(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public void getSub() {

		System.out.println("substraction: "+(x - y));
	}

}

class Multiplecation extends Calculation {

	public Multiplecation(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public void getProduct() {
		
		System.out.println("product: "+x*y);

	}
}
class Division extends Calculation {

	public Division(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public void getqutient() {
		
		System.out.println("division: "+x%y);

	}
}
class Reminder extends Calculation {

	public Reminder(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public void getReminder() {
		
		System.out.println("Reminder: "+x%y);

	}
}