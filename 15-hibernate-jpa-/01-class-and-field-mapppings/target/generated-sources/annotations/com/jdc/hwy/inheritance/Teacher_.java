package com.jdc.hwy.inheritance;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Teacher.class)
public abstract class Teacher_ extends com.jdc.hwy.inheritance.Account_ {

	public static final String CAR = "car";

	
	/**
	 * @see com.jdc.hwy.inheritance.Teacher#car
	 **/
	public static volatile SingularAttribute<Teacher, Car> car;
	
	/**
	 * @see com.jdc.hwy.inheritance.Teacher
	 **/
	public static volatile EntityType<Teacher> class_;

}

