package com.nit.exceptionPrograms;

import java.util.Scanner;

public class TicketAlreadyCancelled {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ticketId = sc.nextInt();
		
	}
}

class TicketAlreadyCancelledException extends Exception {

	public TicketAlreadyCancelledException(String errorMessage) {
		super(errorMessage);
	}
}