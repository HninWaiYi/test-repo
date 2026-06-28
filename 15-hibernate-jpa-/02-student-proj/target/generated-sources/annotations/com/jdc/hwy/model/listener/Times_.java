package com.jdc.hwy.model.listener;

import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(Times.class)
public abstract class Times_ {

	public static final String CREATE_TIME = "createTime";
	public static final String UPDATE_TIME = "updateTime";

	
	/**
	 * @see com.jdc.hwy.model.listener.Times#createTime
	 **/
	public static volatile SingularAttribute<Times, LocalDateTime> createTime;
	
	/**
	 * @see com.jdc.hwy.model.listener.Times#updateTime
	 **/
	public static volatile SingularAttribute<Times, LocalDateTime> updateTime;
	
	/**
	 * @see com.jdc.hwy.model.listener.Times
	 **/
	public static volatile EmbeddableType<Times> class_;

}

