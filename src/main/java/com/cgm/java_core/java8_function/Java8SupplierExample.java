package com.cgm.java_core.java8_function;

import java.util.function.Supplier;

public class Java8SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		beforeJava8();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~`");
		
		java8();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~`");
		
		java8Shortest();

	}
	
	static void display(Supplier<String> supp) {
		System.out.println(supp.get());
	}
	
	static void beforeJava8() {
		display(new Supplier<String>() {
			
			@Override
			public String get() {
				// TODO Auto-generated method stub
				return "Hello world!!!";
			}
		});
	}
	
	static void java8() {
		display(() -> {return "Hello World";});
	}
	
	static void java8Shortest() {
		display(()-> "Hello World");
	}
	
	

}
