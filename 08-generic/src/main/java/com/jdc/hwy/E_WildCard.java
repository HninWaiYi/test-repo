package com.jdc.hwy;

public class E_WildCard {
	
	public static void main(String[] args) {
		withoutWildCard(new Wapper<Object>(30));
		
//		Compile time erroe
//		withoutWildCard(new Wapper<String>("ss"));
		
// 		use wild card avoid compile time error
		withWildCard(new Wapper<String>("ss"));
		
		Wapper<?> w1 = new Wapper<Integer>(40);
		System.out.println(w1.getData());
		
		Wapper<?> w2 = new Wapper<String>("ee");
		System.out.println(w2.getData());
		
	}
	
	static void withWildCard(Wapper<?> wapper) {
		System.out.println(wapper.getData());
	}

	static void withoutWildCard(Wapper<Object> wapper) {
		System.out.println(wapper.getData());
	}
}

class Wapper<T>{
	private T t;
	
	Wapper(T t){
		this.t = t;
	}
	

	public void setData(T t) {
		this.t = t;
	}

	public T getData() {
		return t;
	}

	
	
}


