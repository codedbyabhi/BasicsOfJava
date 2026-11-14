package com.nit.hashTablePrograms;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Double> table = new HashMap<String, Double>();
		table.put("Abhi", 50000.0);
		table.put("Khushi", 40000.0);
		table.put("Raghu", 10000.0);
		table.put("Ram", 30000.0);
		
		
		System.out.println(table.putIfAbsent("Abhi", 7.0));
	}

}
