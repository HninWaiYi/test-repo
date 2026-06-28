package com.jdc.hwy.model;

import com.jdc.hwy.model.listener.Times;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;

@StaticMetamodel(Student.class)
public abstract class Student_ {

	public static final String TIMES = "times";
	public static final String ADDRESS = "address";
	public static final String DOB = "dob";
	public static final String CONTACT = "contact";
	public static final String NAME = "name";
	public static final String ID = "id";

	
	/**
	 * @see com.jdc.hwy.model.Student#times
	 **/
	public static volatile SingularAttribute<Student, Times> times;
	
	/**
	 * @see com.jdc.hwy.model.Student#address
	 **/
	public static volatile SingularAttribute<Student, Address> address;
	
	/**
	 * @see com.jdc.hwy.model.Student#dob
	 **/
	public static volatile SingularAttribute<Student, LocalDate> dob;
	
	/**
	 * @see com.jdc.hwy.model.Student#contact
	 **/
	public static volatile SingularAttribute<Student, Contact> contact;
	
	/**
	 * @see com.jdc.hwy.model.Student#name
	 **/
	public static volatile SingularAttribute<Student, String> name;
	
	/**
	 * @see com.jdc.hwy.model.Student#id
	 **/
	public static volatile SingularAttribute<Student, Integer> id;
	
	/**
	 * @see com.jdc.hwy.model.Student
	 **/
	public static volatile EntityType<Student> class_;

}

