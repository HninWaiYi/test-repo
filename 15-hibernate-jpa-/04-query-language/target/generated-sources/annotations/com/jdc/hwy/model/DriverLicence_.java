package com.jdc.hwy.model;

import com.jdc.hwy.model.DriverLicence.BloodType;
import com.jdc.hwy.model.DriverLicence.LicenceType;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(DriverLicence.class)
public abstract class DriverLicence_ extends com.jdc.hwy.model.Licence_ {

	public static final String TRIP_DETAILS = "tripDetails";
	public static final String DRIVER = "driver";
	public static final String LICENCE_TYPE = "licenceType";
	public static final String BLOOD_TYPE = "bloodType";

	
	/**
	 * @see com.jdc.hwy.model.DriverLicence#tripDetails
	 **/
	public static volatile ListAttribute<DriverLicence, TripDetail> tripDetails;
	
	/**
	 * @see com.jdc.hwy.model.DriverLicence#driver
	 **/
	public static volatile SingularAttribute<DriverLicence, Driver> driver;
	
	/**
	 * @see com.jdc.hwy.model.DriverLicence#licenceType
	 **/
	public static volatile SingularAttribute<DriverLicence, LicenceType> licenceType;
	
	/**
	 * @see com.jdc.hwy.model.DriverLicence#bloodType
	 **/
	public static volatile SingularAttribute<DriverLicence, BloodType> bloodType;
	
	/**
	 * @see com.jdc.hwy.model.DriverLicence
	 **/
	public static volatile EntityType<DriverLicence> class_;

}

