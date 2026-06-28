package com.jdc.hwy.model.dto;

import java.time.LocalDate;

public record SelectPassengerDriverCarTripDate(
		String passenger,
		String driver,
		String number,
		LocalDate tripDate
		) {
	
	@Override
	public final String toString() {
		return """
				Pasenger       :%s
				Driver         :%s
				Car Licence    :%s
				Trip Date      :%s
				""".formatted(passenger,driver,number,tripDate);
	}

}
