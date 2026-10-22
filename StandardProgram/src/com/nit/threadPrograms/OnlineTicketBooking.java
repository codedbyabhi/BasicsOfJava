package com.nit.threadPrograms;

public class OnlineTicketBooking {
	public static void main(String[] args) throws InterruptedException {

		TicketBooking t = new TicketBooking();
		Customer t1 = new Customer("Customer A", 4, t);
		Customer t2 = new Customer("Customer B", 2, t);
		Customer t3 = new Customer("Customer C", 2, t);

		t1.setName("Customer A");
		t2.setName("Customer B");
		t3.setName("Customer C");

		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();

		System.out.println("Ticket Remaining: " + t.availableTickets);

	}

}

class TicketBooking {
	public int availableTickets = 5;

	public synchronized void bookTickets(int numberOfTickets) {
		if (numberOfTickets <= availableTickets) {
			availableTickets -= numberOfTickets;

			System.out.println(Thread.currentThread().getName() + " booked " + numberOfTickets + " tickets succesfully.");

		} else {
			System.out.println(
					"Booking failed for " + Thread.currentThread().getName() + ": Not enough tickets available.");
		}

	}
}

class Customer extends Thread {
	public String name;
	public int numberOfTickets;
	public TicketBooking tb;

	public Customer(String name, int numberOfTickets, TicketBooking tb) {

		this.name = name;
		this.numberOfTickets = numberOfTickets;
		this.tb = tb;
	}

	public void run() {
		tb.bookTickets(numberOfTickets);
	}
}
