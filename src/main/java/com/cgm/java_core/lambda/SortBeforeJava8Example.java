package com.cgm.java_core.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBeforeJava8Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Một danh sách các loại quả.
				List<String> fruits = Arrays.asList("Grapefruit", "Apple", "Durian", "Cherry");

				// Sử dụng phương thức tiện ích của Collections 
				// để sắp xếp lại danh sách trên.
				// Cung cấp một Comparator (Bộ so sách).
				Collections.sort(fruits, new Comparator<String>() {

					@Override
					public int compare(String o1, String o2) {
						return o1.compareTo(o2);
					}

				});

				for (String fruit : fruits) {
					System.out.println(fruit);
				}
		

	}

}
