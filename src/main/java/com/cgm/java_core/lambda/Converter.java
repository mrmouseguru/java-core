package com.cgm.java_core.lambda;

@FunctionalInterface
public interface Converter <F,T>{
	
	T convert(F from);

}
