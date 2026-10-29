package com.nit.collectionProgram;

public class Generics {

	public static void main(String[] args) {
		StorageBox<Integer> b1 = new StorageBox<Integer>();
		b1.setItem(10);
		StorageBox<String> b2 = new StorageBox<String>();
		b2.setItem("Hello");
		StorageBox<Double> b3 = new StorageBox<Double>();
		b3.setItem(10.5);
		System.out.println(b1 + "\n" + b2 + "\n" + b3);
	}
}

class StorageBox<T> {
	private T item;

	public void setItem(T newValue) {
		this.item = newValue;
		
	}

	public T getItem() {
		return item;
	}

	public String toString() {
		return "StorageBox [item=" + item + "]";
	}
}
