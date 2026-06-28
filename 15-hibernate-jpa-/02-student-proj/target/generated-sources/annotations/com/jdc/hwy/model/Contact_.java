package com.jdc.hwy.model;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Contact.class)
public abstract class Contact_ {

	public static final String PRIMARY_PHONE = "primaryPhone";
	public static final String ID = "id";
	public static final String SECONDARY_PHONE = "secondaryPhone";
	public static final String EMAIL = "email";

	
	/**
	 * @see com.jdc.hwy.model.Contact#primaryPhone
	 **/
	public static volatile SingularAttribute<Contact, String> primaryPhone;
	
	/**
	 * @see com.jdc.hwy.model.Contact#id
	 **/
	public static volatile SingularAttribute<Contact, Integer> id;
	
	/**
	 * @see com.jdc.hwy.model.Contact
	 **/
	public static volatile EntityType<Contact> class_;
	
	/**
	 * @see com.jdc.hwy.model.Contact#secondaryPhone
	 **/
	public static volatile SingularAttribute<Contact, String> secondaryPhone;
	
	/**
	 * @see com.jdc.hwy.model.Contact#email
	 **/
	public static volatile SingularAttribute<Contact, String> email;

}

