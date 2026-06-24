package com.jdc.hwy.decorator;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		
		Coffee simple = new SimpleCoffee();
		
		Coffee milk = new A_MilkCoffee(new SimpleCoffee());
		Coffee form = new A_MilkCoffee(new SimpleCoffee());
		
		System.out.println(form.description());
		System.out.println(form.cost());
	}
}

