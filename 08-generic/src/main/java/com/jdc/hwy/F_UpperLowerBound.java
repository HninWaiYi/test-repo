package com.jdc.hwy;

@SuppressWarnings("unused")
public class F_UpperLowerBound {

	public static void main(String[] args) {
		Closer<Object> str = new Closer<>("");
		
		Closer<ClassX> x = new Closer<>(new ClassX()); //generic type use object create
		Closer<ClassY> y = new Closer<>(new ClassY());
		Closer<ClassZ> z = new Closer<>(new ClassZ());
		
		upper(y); //y,z
		lower(y); //y,x,str
	}
	
//	Producer => In Type
	static void upper(Closer<? extends ClassY> closer) {
//		closer.setObj(new ClassY()); //error
		closer.getObj().show();
	}
	
//	Consumers => Out Type
	static void lower(Closer<? super ClassY> closer) {
		closer.setObj(new ClassY());
//		closer.getObj().show(); //error
//		((ClassY) closer.getObj()).show(); //use casting(runtime error)
	}
}

class ClassX{
	void show() {
		System.out.println("Show something");
	}
}
class ClassY extends ClassX{}
class ClassZ extends ClassY{}


class Closer<T>{
	private T obj;
	
	Closer(){
		
	}
	
	Closer(T obj){
		this.obj = obj;
	}
	
	void setObj(T obj) {
		this.obj = obj;
	}
	
	T getObj() {
		return obj;
	}
}
