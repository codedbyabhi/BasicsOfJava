package com.nit.exceptionPrograms;

import java.util.Scanner;

public class CustomerEmailValidationSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	}
}

class InvalidEmailException extends Exception {

	public InvalidEmailException(String errorMessage) {
		super(errorMessage);
	}
}

class Customer {
	private String customerName;
	private String email;

	public Customer(String customerName, String email) {

		this.customerName = customerName;
		this.email = email;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void registerCustomer() throws InvalidEmailException{
		
		if(!email.contains("@")) {
			throw new InvalidEmailException("Email must contain @ symbol");
		}
		if(email.indexOf("@") != email.lastIndexOf("@")) {
			throw new InvalidEmailException("Email must contain only one @ symbol");
		}
		int at = email.indexOf("@");
		if(at == 0||at==email.length()-1) {
			throw new InvalidEmailException("Invalid email format");
		}
		int dot=email.indexOf(".",at);
		if(dot==-1) {
			throw new InvalidEmailException("Email must contain a dot after @.");
		}
		if(dot==at+1||dot==email.length()-1) {
			throw new InvalidEmailException("Invalid email format");
		}
		
		System.out.println("Cutomer registration successful");
	}

}
