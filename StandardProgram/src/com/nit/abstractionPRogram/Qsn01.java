package com.nit.abstractionPRogram;

import java.util.Scanner;

public class Qsn01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Payment choice : ");
		int choice = sc.nextInt();
		System.out.println("Enter Deposit amount : ");
		double amount = sc.nextDouble();
		Payment payment = PaymentFactory.getPaymentObject(choice);
		LoanService ls = new LoanService();
		ls.clearLoan(payment, amount);
	}
}

class LoanService {

	public void clearLoan(Payment payment, double amount) {
		if (payment.pay(amount)) {
			System.out.println("Loan cleared successfully");
			System.out.println("Loan clearance certificate generated");
		} else {
			System.out.println("Payment failed. Loan not cleared");
		}
	}
}

class PaymentFactory {
	static Payment getPaymentObject(int choice) {
		switch (choice) {
		case 1 -> {
			return new UPIPayment();
		}
		case 2 -> {
			return new CreditCardPayment();
		}
		case 3 -> {
			return new CryptoPayment();
		}
		case 4 -> {
			return new CashPayment();
		}
		default -> {
			System.out.println("it gives NullpointerException return ");
			return null;
		}

		}
	}
}

interface Payment {

	boolean pay(double amount);

}

class UPIPayment implements Payment {

	public boolean pay(double amount) {
		System.out.println("payment of " + amount + " is done using UPI");
		return true;
	}
}

class CreditCardPayment implements Payment {

	public boolean pay(double amount) {
		System.out.println("payment of " + amount + " is done using CreditCard");
		return true;
	}
}

class CryptoPayment implements Payment {

	public boolean pay(double amount) {
		System.out.println("payment of " + amount + " is done using Crypto currency");
		return true;
	}
}

class CashPayment implements Payment {

	public boolean pay(double amount) {
		System.out.println("payment of " + amount + " is done using Cash Payment");
		return true;
	}
}