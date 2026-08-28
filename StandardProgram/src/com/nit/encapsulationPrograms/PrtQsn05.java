package com.nit.encapsulationPrograms;

public class PrtQsn05 {

	    private String studentName;
	    private int daysPresent;
	    private double costPerDay;

	    public void setStudentName(String name) {
	        studentName = name;
	    }

	    public void setDaysPresent(int days) {
	        daysPresent = days;
	    }

	    public void setCostPerDay(double cost) {
	        costPerDay = cost;
	    }

	    public double calculateBill() {
	        return daysPresent * costPerDay;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        String name = sc.nextLine();
	        int days = sc.nextInt();
	        double cost = sc.nextDouble();

	        MessBill obj = new MessBill();

	        obj.setStudentName(name);
	        obj.setDaysPresent(days);
	        obj.setCostPerDay(cost);

	        if (days <= 0) {
	            System.out.println("Invalid Days");
	        } 
	        else if (cost <= 0) {
	            System.out.println("Invalid Cost");
	        } 
	        else {
	            System.out.println("Total Bill: " + obj.calculateBill());
	        }
	    }
	}