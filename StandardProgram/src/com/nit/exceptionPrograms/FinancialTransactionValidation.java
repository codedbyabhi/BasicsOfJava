package com.nit.exceptionPrograms;

import java.util.Scanner;

class FinancialTransaction {
    public void processTransaction(double amount, long accountNumber) {
        try {
            if (amount <= 0)
                throw new IllegalArgumentException("Transaction amount must be positive.");

            System.out.println("Processing transaction...");
            System.out.println("Transaction successful: Amount Rs." + amount +
                    " transferred to account " + accountNumber);

        } catch (IllegalArgumentException e) {
            System.out.println("Error processing transaction: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Error processing transaction: Unexpected error.");
        }
    }
}

public class FinancialTransactionValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            double amount = Double.parseDouble(sc.nextLine());
            long accountNumber = Long.parseLong(sc.nextLine());

            FinancialTransaction ft = new FinancialTransaction();
            ft.processTransaction(amount, accountNumber);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a valid number for transaction amount.");
        }
    }
}