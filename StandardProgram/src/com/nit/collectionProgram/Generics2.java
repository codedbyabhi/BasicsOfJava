package com.nit.collectionProgram;

public class Generics2 {
	public static void main(String[] args) {
		Display<Integer> marks = new Display(85);
		Display<String> name = new Display("Banda");
		Display<Double> productPrice = new Display(69.99);
		System.out.println("Name : " + name);
		System.out.println("Marks : " + marks);
		System.out.println("ProductPrice : " + productPrice);
		System.out.println("Retrived Price : " + productPrice.getValue());
	}
}

class Display<T> {
	private T value;

	public Display(T value) {

		this.value = value;
	}

	public void setValue(T newValue) {
		this.value = newValue;
	}

	public T getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "" + value + "";
	}
}
