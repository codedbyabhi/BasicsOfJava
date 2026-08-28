import java.util.Scanner;

class InventoryMain {
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		
		String itemName = sc.nextLine();
		double pricePerUnit = sc.nextDouble();
		int quantityInStock = sc.nextInt();
		
		InventoryItem Obj = new InventoryItem(itemName, pricePerUnit, quantityInStock);
		
		System.out.println("Item Name      : " + itemName);
		System.out.println("Price Per Unit : " + pricePerUnit);
		System.out.println("Quantity       : " + quantityInStock);
		System.out.println("Total Value    : " + Obj.calculateTotalValue());
		
		int choice = sc.nextInt();
		if (choice == 1) {
			int ch = sc.nextInt();
			if (ch == 1) {
				double newPrice = sc.nextInt();
			}
			if (ch == 2) {
				double newQuantity = sc.nextDouble();
			}
		} else if (choice == 2) {
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
		double totalValue = pricePerUnit * quantityInStock;
		return totalValue;
	}

}
