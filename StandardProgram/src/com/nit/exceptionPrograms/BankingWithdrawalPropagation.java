package com.nit.exceptionPrograms;

import java.util.Scanner;

public class BankingWithdrawalPropagation {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter account holders name ,initial balance and withdrawal amount one by one : ");
		String accountHolderName=sc.nextLine();
		double balance =sc.nextDouble();
		double amount=sc.nextDouble();
		
		BankAccount1 ba=new BankAccount1(accountHolderName, balance);
		try
		{
			ba.Withdraw(amount);
		}
		catch(InsuffcientBalanceException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.printf("Remaining Balance : %.2f",ba.getBalance());
	}


}
class InsuffcientBalanceException extends Exception
{

	public InsuffcientBalanceException(String errorMessage) {
		super(errorMessage);
	}
	
}
class BankAccount1
{
	private String accountHolderName;
	private double  balance;
	public BankAccount1(String accountHolderName, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void Withdraw(double amount)throws InsuffcientBalanceException
	{
		if(amount<=0)
		{
			throw new InsuffcientBalanceException("Invalid Withdrwal Amount: ");
		}
		else if(amount>balance)
		{
			throw new InsuffcientBalanceException("Insufficient Balance ");
		}
		else 
		{
			balance=balance-amount;
			System.out.println("Withdrawal Sucessful ");
		}
	}
	
}