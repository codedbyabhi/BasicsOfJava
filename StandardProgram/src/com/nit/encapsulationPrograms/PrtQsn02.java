package com.nit.encapsulationPrograms;

import java.util.Scanner;

public class PrtQsn02 {
	
	    public static void main(String[] args) {
	    Account acc=new Account();

	      Scanner sc=new Scanner(System.in);
	       int currentPin=sc.nextInt();
	       int newPin=sc.nextInt();
	         acc.changePin(currentPin,newPin);
	        
	    }
	}
	class Account{
	    private int pin=1234;


	      public void changePin(int currentPin,int newPin)
	      {
	           if(currentPin==pin)
	           {
	               IO.println("Current PIN: "+currentPin);
	               currentPin=newPin;
	               IO.println("New PIN: "+newPin);
	               IO.println("PIN changed successfully.");

	           }else
	           {
	            IO.println("Incorrect current PIN. PIN change failed.");
	           }
	      }

	}