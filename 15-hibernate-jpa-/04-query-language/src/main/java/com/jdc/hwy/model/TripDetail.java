package com.jdc.hwy.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "trip_detail_tbl")
public class TripDetail {
	
	@EmbeddedId
	private TripDetailPk id;
	
	@ManyToOne
	@MapsId("carLicenceId")
	@JoinColumn(name = "car_licence_id")
	private CarLicence carLicence;
	
	@ManyToOne
	@MapsId("driverLicenceId")
	@JoinColumn(name = "driver_licence_id")
	private DriverLicence driverLicence;
	
	@ManyToOne
	@MapsId("passengerId")
	private Passenger passenger;
	
	@ManyToOne
	@MapsId("tripId")
	private Trip trip;
	
	private int qty;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	public enum Status{
		PENDING,ONDRIVE,COMPLETED,CANCLED
	}
}
