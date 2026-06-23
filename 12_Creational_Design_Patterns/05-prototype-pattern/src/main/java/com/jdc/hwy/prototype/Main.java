package com.jdc.hwy.prototype;

public class Main {

	public static void main(String[] args) {
		Car tesla = new Car("Tesla Model S", "Red");
		
		Car cloneTesla = (Car) tesla.clone();
		
		System.out.println(tesla);
		System.out.println(cloneTesla);
	}
}

interface Prototype{
	Prototype clone();
}

class Car implements Prototype{
	private String model;
	private String color;
	
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	@Override
	public Prototype clone() {
		return new Car(this.model, this.color);
	}
	
	@Override
	public String toString() {
		return model + " - "+color;
	}
}