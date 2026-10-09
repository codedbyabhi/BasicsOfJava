package com.nit.exceptionPrograms;

import java.util.Scanner;

public class OnlineExamSystem {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		LowScoreException lo = new LowScoreException(null); 
		int score = sc.nextInt();
		
		try {
			lo.evaluateResult(score);
		}
		catch(LowScoreException e) {
			System.out.println(e.getMessage());
		}
	}

}

class LowScoreException extends Exception{

	public LowScoreException(String errorMessage) {
		super(errorMessage);
	}
	
	public static void evaluateResult(int score) throws LowScoreException{
		
		if(score<40) {
			throw new LowScoreException("Failed due to low score: Candidate scored below the minimum pass mark.");
		}
		else {
			System.out.println("Passed");
		}
		
	}
}
