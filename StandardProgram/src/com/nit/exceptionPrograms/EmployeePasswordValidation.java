package com.nit.exceptionPrograms;

import java.util.Scanner;

public class EmployeePasswordValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id, Name, Password : ");
		int employeeId=sc.nextInt();
		sc.nextLine();
		String employeeName = sc.nextLine();
		String password = sc.nextLine();
		
		Employee1 e = new Employee1(employeeId, employeeName, password);
		try {
			e.registerEmployee(password);
		}
		catch(InvalidPasswordException a) {
			System.out.println(a.getMessage());
		}
		
	}
}

class InvalidPasswordException extends Exception {

	public InvalidPasswordException(String errorMessage) {
		super(errorMessage);
	}
}

class Employee1 {
	private int employeeId;
	private String employeeName;
	private String password;

	public Employee1(int employeeId, String employeeName, String password) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.password = password;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void registerEmployee(String password) throws InvalidPasswordException{
		
		if(password.length()<8) {
			throw new InvalidPasswordException("Password must contain at least 8 characters");
		}
		if(!password.matches(".*[A-Z].*")){
			throw new InvalidPasswordException("Password must contain an uppercase letter");
		}
		if(!password.matches(".*[0-9].*")){
			throw new InvalidPasswordException("Password must contain a digit");
		}
		else {
			System.out.println("Employee registration successful");
		}
		
	}

}
