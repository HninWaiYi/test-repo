package com.jdc.hwy.inheritance;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Student.class)
public abstract class Student_ extends com.jdc.hwy.inheritance.Account_ {

	public static final String HOBBIES = "hobbies";

	
	/**
	 * @see com.jdc.hwy.inheritance.Student#hobbies
	 **/
	public static volatile ListAttribute<Student, String> hobbies;
	
	/**
	 * @see com.jdc.hwy.inheritance.Student
	 **/
	public static volatile EntityType<Student> class_;

}

