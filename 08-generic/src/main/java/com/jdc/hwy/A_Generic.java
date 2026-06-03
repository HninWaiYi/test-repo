package com.jdc.hwy;

import java.util.Date;

public class A_Generic {
	
	public static void main(String[] args) {
		Data d = new Data();
		d.setValue("sss");
		
//		ClassCastException occur.
//		int res = (int) d.getValue();	
//		System.out.println(res);
		
		GenericData<Integer> d1 = new GenericData<>();
		d1.setValue(40);
		int a = d1.getValue();
		System.out.println(a);
		
		GenericData<Date> date = new GenericData<>();
		date.setValue(new Date());
		System.out.println(date.getValue());
	}

}

class GenericData<T>{
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}

class Data{
	private Object value;
	   
	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	
	
}
