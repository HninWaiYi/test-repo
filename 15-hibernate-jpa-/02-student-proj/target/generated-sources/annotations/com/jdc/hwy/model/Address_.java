package com.jdc.hwy.model;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Address.class)
public abstract class Address_ {

	public static final String ADDRESS = "address";
	public static final String ID = "id";
	public static final String STATE = "state";
	public static final String TOWNSHIP = "township";

	
	/**
	 * @see com.jdc.hwy.model.Address#address
	 **/
	public static volatile SingularAttribute<Address, String> address;
	
	/**
	 * @see com.jdc.hwy.model.Address#id
	 **/
	public static volatile SingularAttribute<Address, Integer> id;
	
	/**
	 * @see com.jdc.hwy.model.Address#state
	 **/
	public static volatile SingularAttribute<Address, String> state;
	
	/**
	 * @see com.jdc.hwy.model.Address
	 **/
	public static volatile EntityType<Address> class_;
	
	/**
	 * @see com.jdc.hwy.model.Address#township
	 **/
	public static volatile SingularAttribute<Address, String> township;

}

