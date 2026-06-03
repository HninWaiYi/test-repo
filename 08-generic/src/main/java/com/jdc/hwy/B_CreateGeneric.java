package com.jdc.hwy;

@SuppressWarnings("unused")
public class B_CreateGeneric {
	
	public static void main(String[] args) {
		Human<String> human = new Human<>();
		Checker<String> checker = new Checker<>("ss");
		
		useData("hello");
		String s = getData();
	}
	
	static<T> void useData(T t) {
		System.out.println(t);
	}
	
	static <R> R getData() {
		return null;		
	}
}

record Checker<T>(T t) {}

interface Pair<K, V>{
	void setkey(K k);
	void setValue(V v);
}

// what type use do not decise
class OrderPair1<X, Y> implements Pair<X, Y>{

	@Override
	public void setkey(X k) {
		
	}

	@Override
	public void setValue(Y v) {
		
	}	
}

class OrderPair implements Pair<Integer, String>{

	@Override
	public void setkey(Integer k) {
		
	}

	@Override
	public void setValue(String v) {
		
	}
}

class Human<T>{
	
}
