package com.jdc.hwy.decorator;

public class A_MilkCoffee extends CoffeeDecorator{

	public A_MilkCoffee(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public String description() {
		return super.description()+" with milk";
	}
	
	@Override
	public double cost() {
		return super.cost()+500;
	}

}
