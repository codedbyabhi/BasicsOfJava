package com.nit.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OnlineShoppingProductManagementSystem{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Product : ");
		int n = sc.nextInt();
		ArrayList<Product> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter Product id, Product name, price and quantity of : " + i);
			int pid = sc.nextInt();
			sc.nextLine();
			String pname = sc.nextLine();
			double price = sc.nextDouble();
			int quantity = sc.nextInt();
			list.add(new Product(pid, pname, price, quantity));
		}
		System.out.println("Enter a product id to Search : ");
		int targetId = sc.nextInt();
		Collections.sort(list);
		for (Product p : list) {
			System.out.println(p);
		}
		
		for (Product p : list) {
			if (p.pid == targetId) {
				System.out.println(p);
				break;

			}
		}
		Collections.binarySearch(list, new Product(targetId, "", 0, 0),(o1,o2)->o1.pid-o2.pid);
		System.out.println(list);
	}

}

class Product implements Comparable<Product> {
	public int pid;
	public String pname;
	public double price;
	public int quantity;

	public Product(int pid, String pname, double price, int quantity) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
	}

	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", quantity=" + quantity + "]";
	}

	public int compareTo(Product o) {

		return this.pid - o.pid;
	}

}
