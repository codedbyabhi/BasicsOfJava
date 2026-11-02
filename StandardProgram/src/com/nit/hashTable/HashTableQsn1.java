package com.nit.hashTable;

import java.util.Hashtable;

public class HashTableQsn1 {
	public static void main(String[] args) {
		String s = "ABACBAD";
		Hashtable<Character, Integer> table = new Hashtable<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {

			Character ch = s.charAt(i);
			if (!table.containsKey(ch)) {
				table.put(ch, 1);
			} else {
				table.put(ch, (table.get(ch) + 1));
			}

		}
		System.out.println(table);
	}

}
