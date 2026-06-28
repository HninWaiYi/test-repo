package com.jdc.hwy.model;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Account.class)
public abstract class Account_ {

	public static final String BALANCE = "balance";
	public static final String NAME = "name";
	public static final String ID = "id";

	
	/**
	 * @see com.jdc.hwy.model.Account#balance
	 **/
	public static volatile SingularAttribute<Account, Double> balance;
	
	/**
	 * @see com.jdc.hwy.model.Account#name
	 **/
	public static volatile SingularAttribute<Account, String> name;
	
	/**
	 * @see com.jdc.hwy.model.Account#id
	 **/
	public static volatile SingularAttribute<Account, Integer> id;
	
	/**
	 * @see com.jdc.hwy.model.Account
	 **/
	public static volatile EntityType<Account> class_;

}

