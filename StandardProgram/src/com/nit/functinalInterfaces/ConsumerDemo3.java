package com.nit.functinalInterfaces;

import java.util.function.Consumer;

public class ConsumerDemo3 {
	public static void main(String[] args) {
		
		Consumer<Integer> square = num -> System.out.println(num*num);
		
		square.accept(5);
	}

}
