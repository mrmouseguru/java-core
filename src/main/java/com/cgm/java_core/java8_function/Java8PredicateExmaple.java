package com.cgm.java_core.java8_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Java8PredicateExmaple {

	public static void main(String[] args) {
		beforeJava8();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~`");
		java8();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~`");
		java8MoreSimle();

	}

	static void beforeJava8() {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 4, 5, 1, 7, 8);

		Stream<Integer> stream = null;
		stream = list.stream();
		
		Predicate<Integer> predicate = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t%2 == 1;
			}
		};

		Stream<Integer> stream2 = stream.filter(predicate);
		stream2.forEach((t) -> System.out.println(t));
		
	}
	
	static void java8() {
		
		List<Integer> list = Arrays.asList(1, 4, 5, 1, 7, 8);

		Stream<Integer> stream = null;
		stream = list.stream();
		
		Stream<Integer> stream2 = stream.filter((num) -> {return num%2 == 1;});
		
		stream2.forEach(System.out::println);
		
	}
	
	static void java8MoreSimle() {
		List<Integer> list = Arrays.asList(1, 4, 5, 1, 7, 8);

		Stream<Integer> stream = null;
		stream = list.stream();
		stream.filter((num) -> {return num%2 ==1;})
						.forEach(System.out::println);
	}
	
	class C implements Predicate<Integer>{

		@Override
		public boolean test(Integer t) {
			// TODO Auto-generated method stub
			return false;
		}
		
	}

}
