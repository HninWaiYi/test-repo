package com.jdc.hwy.inheritance;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Car.class)
public abstract class Car_ {

	public static final String MODEL = "model";
	public static final String ID = "id";
	public static final String BRAND = "brand";

	
	/**
	 * @see com.jdc.hwy.inheritance.Car#model
	 **/
	public static volatile SingularAttribute<Car, String> model;
	
	/**
	 * @see com.jdc.hwy.inheritance.Car#id
	 **/
	public static volatile SingularAttribute<Car, Integer> id;
	
	/**
	 * @see com.jdc.hwy.inheritance.Car
	 **/
	public static volatile EntityType<Car> class_;
	
	/**
	 * @see com.jdc.hwy.inheritance.Car#brand
	 **/
	public static volatile SingularAttribute<Car, String> brand;

}

