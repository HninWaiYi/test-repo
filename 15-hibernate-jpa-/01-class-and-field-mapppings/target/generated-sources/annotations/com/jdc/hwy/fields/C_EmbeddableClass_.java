package com.jdc.hwy.fields;

import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;
import java.time.LocalTime;

@StaticMetamodel(C_EmbeddableClass.class)
public abstract class C_EmbeddableClass_ {

	public static final String DATE = "date";
	public static final String NAME = "name";
	public static final String TIME = "time";
	public static final String LIST = "list";

	
	/**
	 * @see com.jdc.hwy.fields.C_EmbeddableClass#date
	 **/
	public static volatile SingularAttribute<C_EmbeddableClass, LocalDate> date;
	
	/**
	 * @see com.jdc.hwy.fields.C_EmbeddableClass#name
	 **/
	public static volatile SingularAttribute<C_EmbeddableClass, String> name;
	
	/**
	 * @see com.jdc.hwy.fields.C_EmbeddableClass#time
	 **/
	public static volatile SingularAttribute<C_EmbeddableClass, LocalTime> time;
	
	/**
	 * @see com.jdc.hwy.fields.C_EmbeddableClass#list
	 **/
	public static volatile ListAttribute<C_EmbeddableClass, String> list;
	
	/**
	 * @see com.jdc.hwy.fields.C_EmbeddableClass
	 **/
	public static volatile EmbeddableType<C_EmbeddableClass> class_;

}

