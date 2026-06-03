package com.jdc.hwy;

@SuppressWarnings("unused")
public class D_Ingeritance {
	
	public static void main(String[] args) {
		ClassA<Number> num = new ClassB<Number>();
		
//		ClassA<Number> num1 = new ClassB<Integer>();
//		ClassB<Number> num2 = new ClassB<Integer>();
	}

}

class ClassA<X>{}

class ClassB<Y> extends ClassA<Y>{}