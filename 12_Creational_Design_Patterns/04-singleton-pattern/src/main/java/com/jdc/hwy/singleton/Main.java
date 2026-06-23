package com.jdc.hwy.singleton;

public class Main {

//	Only one object in application,
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		System.out.println(s);
	}
}

class Singleton{
	
	private Singleton() {}
	
	private static class Holder{
		private static final Singleton INSTANCE = new Singleton();
	}
	
	public static Singleton getInstance() {
		return Holder.INSTANCE;
	}
}