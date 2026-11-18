package com.nit.functinalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(12, 14, 15, 16, 18));
		Iterator<Integer> itr = list.iterator();
		System.out.println(itr.next());
		list.remove(Integer.valueOf(14));
//		System.out.println(itr.next());
		System.out.println(list);
		
//		while (itr.hasNext()) {
//			
//			list.remove(Integer.valueOf(18));
//			System.out.println(itr.next());
//		}
	}

}
