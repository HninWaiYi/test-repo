package com.jdc.hwy.inheritance;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Officer.class)
public abstract class Officer_ extends com.jdc.hwy.inheritance.Account_ {

	public static final String LAPTOP = "laptop";

	
	/**
	 * @see com.jdc.hwy.inheritance.Officer#laptop
	 **/
	public static volatile SingularAttribute<Officer, String> laptop;
	
	/**
	 * @see com.jdc.hwy.inheritance.Officer
	 **/
	public static volatile EntityType<Officer> class_;

}

