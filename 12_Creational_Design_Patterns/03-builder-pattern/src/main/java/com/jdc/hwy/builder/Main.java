package com.jdc.hwy.builder;

public class Main {
// This pattern is used for complex construct parameters.
	public static void main(String[] args) {
		Computer c = new Computer.ComputerBuilder()
				.setMemory("4Gb")
				.setMouse("wireless")
				.setKeyboard("standard keyboard")
				.setGraphic("2gb")
				.build();
		
		System.out.println(c);
	}
}
