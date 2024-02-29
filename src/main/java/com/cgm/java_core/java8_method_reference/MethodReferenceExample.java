package com.cgm.java_core.java8_method_reference;

public class MethodReferenceExample {
	
	public static int action(int a, int b, MyFunction myFn) {
		return myFn.doSomething(a, b);
	}
	
	public static void main(String[] args) {
		int c = action(5, 7, MyMathUtils::sum);
		System.out.println(c);
		
		int e = action(5, 7, Math::subtractExact);
		
		MyMathUtils mymath = new MyMathUtils();
		
		int m = action(5, 6, mymath::multiply);
	}

}
