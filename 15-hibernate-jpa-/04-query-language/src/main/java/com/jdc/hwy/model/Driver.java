package com.jdc.hwy.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "driver_tbl")
@NamedQuery(name = "driver.findByAge", query = "select d from Driver d where d.dob >= ?1")
@NamedQuery(name = "driver.findByNameLike", query = "select d from Driver d where lower(d.name) like lower(:n) ")
public class Driver {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false, length = 45)
	private String name;
	@Column(nullable = false, length = 45, unique = true)
	private String nrc;
	@Column(nullable = false, length = 45)
	private LocalDate dob;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Address address;
	
	@OneToOne(mappedBy = "driver")
	private DriverLicence driverLicence;

}
