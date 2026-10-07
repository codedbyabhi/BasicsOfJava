package com.nit.exceptionPrograms;

public class ExceptionDemo {
	public static void main(String[] args) {

		try {
			System.out.println(10/0);
		}
		catch(Exception e){
			System.out.println("Exception Handled.");
		}
		finally {
			System.out.println("Finally always execute when try bllock exe");
			
		}
	}
}

class Employee extends Throwable{
	
}
