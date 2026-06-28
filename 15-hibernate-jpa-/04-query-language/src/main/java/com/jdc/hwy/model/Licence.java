package com.jdc.hwy.model;

import java.time.LocalDate;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public class Licence {

	@Id
	private String number;
	private LocalDate issueDate;
	private LocalDate validDate;
}
