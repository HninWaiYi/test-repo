package com.jdc.hwy.model;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;

@StaticMetamodel(Driver.class)
public abstract class Driver_ {

	public static final String ADDRESS = "address";
	public static final String QUERY_DRIVER_FIND_BY_AGE = "driver.findByAge";
	public static final String QUERY_DRIVER_FIND_BY_NAME_LIKE = "driver.findByNameLike";
	public static final String DOB = "dob";
	public static final String NAME = "name";
	public static final String DRIVER_LICENCE = "driverLicence";
	public static final String ID = "id";
	public static final String NRC = "nrc";

	
	/**
	 * @see com.jdc.hwy.model.Driver#address
	 **/
	public static volatile SingularAttribute<Driver, Address> address;
	
	/**
	 * @see com.jdc.hwy.model.Driver#dob
	 **/
	public static volatile SingularAttribute<Driver, LocalDate> dob;
	
	/**
	 * @see com.jdc.hwy.model.Driver#name
	 **/
	public static volatile SingularAttribute<Driver, String> name;
	
	/**
	 * @see com.jdc.hwy.model.Driver#driverLicence
	 **/
	public static volatile SingularAttribute<Driver, DriverLicence> driverLicence;
	
	/**
	 * @see com.jdc.hwy.model.Driver#id
	 **/
	public static volatile SingularAttribute<Driver, Integer> id;
	
	/**
	 * @see com.jdc.hwy.model.Driver
	 **/
	public static volatile EntityType<Driver> class_;
	
	/**
	 * @see com.jdc.hwy.model.Driver#nrc
	 **/
	public static volatile SingularAttribute<Driver, String> nrc;

}

