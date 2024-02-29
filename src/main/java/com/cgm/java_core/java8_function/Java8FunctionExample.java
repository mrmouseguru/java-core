package com.cgm.java_core.java8_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Java8FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		beforeJava8();
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		java8();

	}

	static void beforeJava8() {
		List<String> list = Arrays.asList("a", "c", "B", "e", "g");

		Stream<String> stream = list.stream();
		Stream<String> stream2 = stream.map(new Function<String, String>() {

			@Override
			public String apply(String t) {
				// TODO Auto-generated method stub
				return t == null ? null : t.toUpperCase();
			}
		});

		stream2.forEach(System.out::println);

	}

	static void java8() {
		List<String> list = Arrays.asList("a", "c", "B", "e", "g");

		Stream<String> stream = list.stream();
		stream.map((s) -> {return s==null ? null : s.toUpperCase();})
			.forEach(System.out::println);
	}

}
