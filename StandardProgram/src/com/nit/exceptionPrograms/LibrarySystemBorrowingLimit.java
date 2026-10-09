package com.nit.exceptionPrograms;

import java.util.Scanner;

public class LibrarySystemBorrowingLimit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		int borrow = sc.nextInt();
		
		try {
			if(borrow>=limit) {
				throw new BorrowLimitExceededException("BorrowLimitExceededException: Limit "+borrow+" reached");
			}
        System.out.println("Book borrowed successfully");
		}
		catch(BorrowLimitExceededException b) {
			System.out.println(b.getMessage());
		}
	}

}
class BorrowLimitExceededException extends Exception{

	public BorrowLimitExceededException(String errorMessage) {
		super(errorMessage);
	}
}