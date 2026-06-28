package com.jdc.hwy.model;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Car.class)
public abstract class Car_ {

	public static final String MODEL = "model";
	public static final String ID = "id";
	public static final String BRAND = "brand";
	public static final String CAR_LICENCE = "carLicence";

	
	/**
	 * @see com.jdc.hwy.model.Car#model
	 **/
	public static volatile SingularAttribute<Car, String> model;
	
	/**
	 * @see com.jdc.hwy.model.Car#id
	 **/
	public static volatile SingularAttribute<Car, Integer> id;
	
	/**
	 * @see com.jdc.hwy.model.Car
	 **/
	public static volatile EntityType<Car> class_;
	
	/**
	 * @see com.jdc.hwy.model.Car#brand
	 **/
	public static volatile SingularAttribute<Car, String> brand;
	
	/**
	 * @see com.jdc.hwy.model.Car#carLicence
	 **/
	public static volatile SingularAttribute<Car, CarLicence> carLicence;

}

