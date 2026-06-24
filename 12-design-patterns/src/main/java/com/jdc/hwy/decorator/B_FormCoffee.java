package com.jdc.hwy.decorator;

public class B_FormCoffee extends CoffeeDecorator {

	public B_FormCoffee(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public String description() {
		return super.description()+" with form";
	}
	
	@Override
	public double cost() {
		return super.cost()+1000;
	}
}
