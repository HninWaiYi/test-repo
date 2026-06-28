package com.jdc.hwy.model;

import com.jdc.hwy.model.listener.Times;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;
import java.time.LocalTime;

@StaticMetamodel(Register.class)
public abstract class Register_ {

	public static final String TIMES = "times";
	public static final String STUDENT = "student";
	public static final String RG_DATE = "rgDate";
	public static final String CLASS_ROOM = "classRoom";
	public static final String COURSE = "course";
	public static final String RG_TIME = "rgTime";
	public static final String ID = "id";

	
	/**
	 * @see com.jdc.hwy.model.Register#times
	 **/
	public static volatile SingularAttribute<Register, Times> times;
	
	/**
	 * @see com.jdc.hwy.model.Register#student
	 **/
	public static volatile SingularAttribute<Register, Student> student;
	
	/**
	 * @see com.jdc.hwy.model.Register#rgDate
	 **/
	public static volatile SingularAttribute<Register, LocalDate> rgDate;
	
	/**
	 * @see com.jdc.hwy.model.Register#classRoom
	 **/
	public static volatile SingularAttribute<Register, Classroom> classRoom;
	
	/**
	 * @see com.jdc.hwy.model.Register#course
	 **/
	public static volatile SingularAttribute<Register, Course> course;
	
	/**
	 * @see com.jdc.hwy.model.Register#rgTime
	 **/
	public static volatile SingularAttribute<Register, LocalTime> rgTime;
	
	/**
	 * @see com.jdc.hwy.model.Register#id
	 **/
	public static volatile SingularAttribute<Register, RegisterPk> id;
	
	/**
	 * @see com.jdc.hwy.model.Register
	 **/
	public static volatile EntityType<Register> class_;

}

