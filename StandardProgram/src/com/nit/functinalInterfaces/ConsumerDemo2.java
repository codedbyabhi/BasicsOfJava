package com.nit.functinalInterfaces;

import java.util.function.Consumer;

public class ConsumerDemo2 {
	public static void main(String[] args) {
		
		//In Consumer is one method void accept(T t).
		//accept() method Nothing is to returned.
		
		Consumer<String> printName = name -> System.out.println(name);
		
		printName.accept("Abhi");
	}

}
