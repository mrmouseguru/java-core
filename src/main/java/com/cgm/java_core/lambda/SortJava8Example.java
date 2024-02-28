package com.cgm.java_core.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortJava8Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Một danh sách các loại quả.
				List<String> fruits = Arrays.asList("Grapefruit", "Apple", "Durian", "Cherry");

				// Sử dụng phương thức tiện ích của Collections 
				// để sắp xếp lại danh sách trên.
				// Cung cấp một Comparator (Bộ so sách).
				Comparator<String> comparator = (o1, o2 ) -> {return o1.compareTo(o2);};
				
				Collections.sort(fruits, comparator
						);

				for (String fruit : fruits) {
					System.out.println(fruit);
				}
		

	}

}
