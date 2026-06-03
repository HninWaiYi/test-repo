package com.jdc.hwy;

@SuppressWarnings("unused")
public class C_BoundedType {

	public static void main(String[] args) {
		Order<Fruit> o = new Order<>();
		Order<Apple> o1 = new Order<>();
		
		o1.setValue(new Apple());
		o1.getValue().getPrice(23);
		
		System.out.println(format(new Fruit()));
	}
	
	static <T extends Fruit> String format(T t){
		return String.format("Value :::%d", t.getPrice(40));
	}
}

class Fruit{
	int getPrice(int p) {
		return p;
	}
}

class Orange extends Fruit{}

class Apple extends Fruit{}

interface Test<Y>{}

class Order<T extends Fruit> implements Test<T> {
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}
