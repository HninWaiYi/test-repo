package com.jdc.hwy.model;

import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(RegisterPk.class)
public abstract class RegisterPk_ {

	public static final String STUDENT_ID = "studentId";
	public static final String CLASSROOM_ID = "classroomId";
	public static final String COURSE_ID = "courseId";

	
	/**
	 * @see com.jdc.hwy.model.RegisterPk#studentId
	 **/
	public static volatile SingularAttribute<RegisterPk, Integer> studentId;
	
	/**
	 * @see com.jdc.hwy.model.RegisterPk#classroomId
	 **/
	public static volatile SingularAttribute<RegisterPk, Integer> classroomId;
	
	/**
	 * @see com.jdc.hwy.model.RegisterPk
	 **/
	public static volatile EmbeddableType<RegisterPk> class_;
	
	/**
	 * @see com.jdc.hwy.model.RegisterPk#courseId
	 **/
	public static volatile SingularAttribute<RegisterPk, Integer> courseId;

}

