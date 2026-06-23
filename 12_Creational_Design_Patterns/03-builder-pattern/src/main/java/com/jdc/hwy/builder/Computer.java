package com.jdc.hwy.builder;

public class Computer {
	private String memory;
	private String graphic;
	private String keyboard;
	private String mouse;
	
	private Computer(ComputerBuilder builder) {
		this.memory = builder.memory;
		this.graphic = builder.graphic;
		this.keyboard = builder.keyboard;
		this.mouse = builder.mouse;
	}

	@Override
	public String toString() {
		return memory+"\t"+graphic+"\t"+keyboard+"\t"+mouse;
		
	}
	
	static class ComputerBuilder{
		private String memory;
		private String graphic;
		private String keyboard;
		private String mouse;
		
		public ComputerBuilder setMemory(String memory) {
			this.memory = memory;
			return this;
		}
		
		public ComputerBuilder setGraphic(String graphic) {
			this.graphic = graphic;
			return this;
		}
		
		public ComputerBuilder setKeyboard(String keyboard) {
			this.keyboard = keyboard;
			return this;
		}
		
		public ComputerBuilder setMouse(String mouse) {
			this.mouse = mouse;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
	}
}
