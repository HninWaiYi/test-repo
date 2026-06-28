package com.jdc.hwy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "car_licence_tbl")
@EqualsAndHashCode(callSuper = false)
public class CarLicence extends Licence {

	@OneToOne
	private Car car;
}
