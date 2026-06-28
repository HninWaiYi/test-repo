package com.jdc.hwy.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "driver_licence_tbl")
@EqualsAndHashCode(callSuper = false)
public class DriverLicence extends Licence {
	
	@OneToOne
	private Driver driver;

	@Enumerated(EnumType.STRING)
	private BloodType bloodType;
	
	@Enumerated(EnumType.STRING)
	private LicenceType licenceType;
	
	@OneToMany(mappedBy = "driverLicence")
	private List<TripDetail> tripDetails;
	
	public enum LicenceType{
		A,B,C,D,E
	}
	
	public enum BloodType{
		A,B,AB,O
	}
}
