package com.jdc.hwy.model;

import com.jdc.hwy.model.listener.Times;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Course.class)
public abstract class Course_ {

	public static final String TIMES = "times";
	public static final String NAME = "name";
	public static final String ID = "id";

	
	/**
	 * @see com.jdc.hwy.model.Course#times
	 **/
	public static volatile SingularAttribute<Course, Times> times;
	
	/**
	 * @see com.jdc.hwy.model.Course#name
	 **/
	public static volatile SingularAttribute<Course, String> name;
	
	/**
	 * @see com.jdc.hwy.model.Course#id
	 **/
	public static volatile SingularAttribute<Course, Integer> id;
	
	/**
	 * @see com.jdc.hwy.model.Course
	 **/
	public static volatile EntityType<Course> class_;

}

