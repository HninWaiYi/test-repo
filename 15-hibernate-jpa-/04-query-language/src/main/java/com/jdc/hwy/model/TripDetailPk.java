package com.jdc.hwy.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class TripDetailPk implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "car_licence_id")
	private String carLicenceId;

	@Column(name = "driver_licence_id")
	private String driverLicenceId;
	
	@Column(name = "passenger_id")
	private int passengerId;
	
	@Column(name = "trip_id")
	private int tripId;

}
