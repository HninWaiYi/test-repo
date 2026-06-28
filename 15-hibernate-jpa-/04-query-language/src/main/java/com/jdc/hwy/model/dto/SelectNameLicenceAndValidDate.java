package com.jdc.hwy.model.dto;

import java.time.LocalDate;

public record SelectNameLicenceAndValidDate(
		String name,
		String number,
		LocalDate validDate
		) {

}
