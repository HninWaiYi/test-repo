package com.jdc.hwy.model;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Passenger.class)
public abstract class Passenger_ {

	public static final String TRIP_DETAILS = "tripDetails";
	public static final String MAPPING_P_MAP_SELECT_ALL = "p.map.selectAll";
	public static final String PHONE = "phone";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String QUERY_PASSENGER_SELECT_ALL = "Passenger.selectAll";
	public static final String QUERY_P_SELECT_ALL = "p.selectAll";

	
	/**
	 * @see com.jdc.hwy.model.Passenger#tripDetails
	 **/
	public static volatile ListAttribute<Passenger, TripDetail> tripDetails;
	
	/**
	 * @see com.jdc.hwy.model.Passenger#phone
	 **/
	public static volatile SingularAttribute<Passenger, String> phone;
	
	/**
	 * @see com.jdc.hwy.model.Passenger#name
	 **/
	public static volatile SingularAttribute<Passenger, String> name;
	
	/**
	 * @see com.jdc.hwy.model.Passenger#id
	 **/
	public static volatile SingularAttribute<Passenger, Integer> id;
	
	/**
	 * @see com.jdc.hwy.model.Passenger
	 **/
	public static volatile EntityType<Passenger> class_;

}

