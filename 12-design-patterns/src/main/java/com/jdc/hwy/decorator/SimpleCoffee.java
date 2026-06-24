package com.jdc.hwy.decorator;

public class SimpleCoffee implements Coffee{

	@Override
	public String description() {
		return "Simple coffee";	
	}

	@Override
	public double cost() {
		return 2500.00;
	}

}
