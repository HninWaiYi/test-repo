package com.jdc.hwy.model;

import com.jdc.hwy.model.TripDetail.Status;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(TripDetail.class)
public abstract class TripDetail_ {

	public static final String TRIP = "trip";
	public static final String PASSENGER = "passenger";
	public static final String QTY = "qty";
	public static final String DRIVER_LICENCE = "driverLicence";
	public static final String ID = "id";
	public static final String CAR_LICENCE = "carLicence";
	public static final String STATUS = "status";

	
	/**
	 * @see com.jdc.hwy.model.TripDetail#trip
	 **/
	public static volatile SingularAttribute<TripDetail, Trip> trip;
	
	/**
	 * @see com.jdc.hwy.model.TripDetail#passenger
	 **/
	public static volatile SingularAttribute<TripDetail, Passenger> passenger;
	
	/**
	 * @see com.jdc.hwy.model.TripDetail#qty
	 **/
	public static volatile SingularAttribute<TripDetail, Integer> qty;
	
	/**
	 * @see com.jdc.hwy.model.TripDetail#driverLicence
	 **/
	public static volatile SingularAttribute<TripDetail, DriverLicence> driverLicence;
	
	/**
	 * @see com.jdc.hwy.model.TripDetail#id
	 **/
	public static volatile SingularAttribute<TripDetail, TripDetailPk> id;
	
	/**
	 * @see com.jdc.hwy.model.TripDetail
	 **/
	public static volatile EntityType<TripDetail> class_;
	
	/**
	 * @see com.jdc.hwy.model.TripDetail#carLicence
	 **/
	public static volatile SingularAttribute<TripDetail, CarLicence> carLicence;
	
	/**
	 * @see com.jdc.hwy.model.TripDetail#status
	 **/
	public static volatile SingularAttribute<TripDetail, Status> status;

}

