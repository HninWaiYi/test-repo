package com.jdc.hwy.factory;

public class Main {

	public static void main(String[] args) {
		Vehicle v = vehicleFactory("bike");
		v.drive();
	}
	
	static Vehicle vehicleFactory(String name) {
		return switch(name) {
			case "car" -> new Car();
			case "bike" -> new Bike();
			default -> null;
		};
	}

}

interface Vehicle{
	void drive();
}

class Car implements Vehicle{

	@Override
	public void drive() {
		System.out.println("Driving Car");		
	}
	
}

class Bike implements Vehicle{

	@Override
	public void drive() {
		System.out.println("Driving Bike");		
	}
	
}