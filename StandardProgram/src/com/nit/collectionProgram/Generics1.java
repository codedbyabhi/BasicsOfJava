package com.nit.collectionProgram;

public class Generics1 {
	public static void main(String[] args) {
		MyArray1 ob = new MyArray1();
		ob.add('A');
		ob.add(10);
		ob.add(20.1);
		ob.add("hello");
	}
}

class MyArray1<T> {

	T[] arr;
	int index = 0;

	public MyArray1() {
		arr = (T[]) new Object[5];
	}

	public void add(T value) {
		if (index < arr.length) {
			arr[index] = value;
			index++;
		} else {
			System.out.println("Array is full");
		}
	}

	public void display() {
		for (int i = 0; i < index; i++) {
			System.out.println(arr[i]);
		}
	}
}