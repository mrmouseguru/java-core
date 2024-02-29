package com.cgm.java_core.java8_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8Consumer {

	public static void main(String[] args) {
		beforeJava8();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		java8();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		methodReference();

	}

	static void beforeJava8() {

		List<String> list = Arrays.asList("a", "b", "c", "a1", "a2");

		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {

				System.out.println(t);

			}
		});

	}

	static void java8() {

		List<String> list = Arrays.asList("a", "b", "c", "a1", "a2");
		list.forEach((e) -> System.out.println(e));

	}

	static void methodReference() {

		List<String> list = Arrays.asList("a", "b", "c", "a1", "a2");
		list.forEach(System.out::println);

	}

}
