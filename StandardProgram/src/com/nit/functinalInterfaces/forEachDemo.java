package com.nit.functinalInterfaces;

import java.util.ArrayList;
import java.util.Iterator;

public class forEachDemo {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
//		list.forEach(n->System.out.println(n));
//		list.forEach(System.out::println);
		Iterator<Integer> itr = list.iterator();
		itr.next();
		itr.forEachRemaining(System.out::println);
	
	
	}
}
