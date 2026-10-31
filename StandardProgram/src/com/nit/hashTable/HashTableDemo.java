package com.nit.hashTable;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();  //Hashtable default size is 11
			  //  key  value  	// we can take same value but not same key.
 		table.put(101, 99);
		table.put(102, 97);
		table.put(103, 95);
		table.put(101, 69);
		System.out.println(table);
	}
}
