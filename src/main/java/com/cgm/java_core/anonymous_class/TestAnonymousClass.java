package com.cgm.java_core.anonymous_class;

import com.cgm.java_core.sample_data.Product;

public class TestAnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String p1 = new Product("Phone", 800, "image1") {
			public String getDescription() {
				return "Iphone cui bap";
			}
		}.getDescription();
		
		//System.out.println(p);
		
		System.out.println(p1);

	}

}
