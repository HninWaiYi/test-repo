package com.jdc.hwy.model;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(CarLicence.class)
public abstract class CarLicence_ extends com.jdc.hwy.model.Licence_ {

	public static final String CAR = "car";

	
	/**
	 * @see com.jdc.hwy.model.CarLicence#car
	 **/
	public static volatile SingularAttribute<CarLicence, Car> car;
	
	/**
	 * @see com.jdc.hwy.model.CarLicence
	 **/
	public static volatile EntityType<CarLicence> class_;

}

