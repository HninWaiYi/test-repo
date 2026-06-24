package com.jdc.hwy.decorator;

public abstract class CoffeeDecorator implements Coffee {
	
	private Coffee coffee;
	
	public CoffeeDecorator(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public String description() {
		return coffee.description();
	}
	
	@Override
	public double cost() {
		return coffee.cost();
	}

}
