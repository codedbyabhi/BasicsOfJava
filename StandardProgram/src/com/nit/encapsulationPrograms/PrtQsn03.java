package com.nit.encapsulationPrograms;

import java.util.Scanner;

public class PrtQsn03 {
	
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);

	        String itemName = sc.nextLine();
	        double pricePerUnit = sc.nextDouble();
	        int quantityInStock = sc.nextInt();
	        InventoryItem Obj = new InventoryItem(itemName, pricePerUnit, quantityInStock);
	        System.out.println("Item Name       : " + Obj.getItemName());
	        System.out.println("Price Per Unit  : " + Obj.getPricePerUnit());
	        System.out.println("Quantity        : " + Obj.getQuantityInStock());
	        System.out.println("Total Value     : " + Obj.calculateTotalValue());

	        int choice = sc.nextInt();
	        if (choice == 1) {
	            int ch = sc.nextInt();
	            if (ch == 1)
	            {
	                double newPrice = sc.nextDouble();
	                Obj.setPricePerUnit(newPrice);
	            }
	            if (ch == 2) {
	                
	                int newQuantity = sc.nextInt();  
	                Obj.setQuantityInStock(newQuantity);
	            }
	            System.out.println();
	            System.out.println("After Update:");
	            System.out.println();    
	            System.out.println("Item Name       : " + Obj.getItemName());
	            System.out.println("Price Per Unit  : " + Obj.getPricePerUnit());
	            System.out.println("Quantity        : " + Obj.getQuantityInStock());
	            System.out.println("Total Value     : " + Obj.calculateTotalValue());

	        } else if (choice == 2)
	        { 
	            System.exit(0);
	        }
	    }
	}

	class InventoryItem {
	    private String itemName;
	    private double pricePerUnit;
	    private int quantityInStock;

	    public InventoryItem(String itemName, double pricePerUnit, int quantityInStock) {
	        this.itemName = itemName;
	        this.pricePerUnit = pricePerUnit;
	        this.quantityInStock = quantityInStock;
	    }

	    public String getItemName() {
	        return itemName;
	    }

	    public void setItemName(String itemName) {
	        this.itemName = itemName;
	    }

	    public double getPricePerUnit() {
	        return pricePerUnit;
	    }

	    public void setPricePerUnit(double pricePerUnit) {
	        this.pricePerUnit = pricePerUnit;
	    }

	    public int getQuantityInStock() {
	        return quantityInStock;
	    }

	    public void setQuantityInStock(int quantityInStock) {
	        this.quantityInStock = quantityInStock;
	    }

	    public double calculateTotalValue() {
	        return pricePerUnit * quantityInStock;
	    }
	}