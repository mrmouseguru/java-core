package com.cgm.java_core.lambda;

public class ConverterBeforeJava8Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Converter<String, Integer> converter = 
				
				new Converter<String, Integer>() {
			public Integer convert(String from) {
				return Integer.parseInt(from);
			};
		};
		
		
		System.out.println(converter.convert("8"));

	}

}
