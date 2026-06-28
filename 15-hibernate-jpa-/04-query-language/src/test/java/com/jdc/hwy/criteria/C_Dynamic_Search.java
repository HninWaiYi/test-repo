package com.jdc.hwy.criteria;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.hwy.JpaFactory;
import com.jdc.hwy.model.dto.SelectPassengerDriverCarTripDate;

public class C_Dynamic_Search extends JpaFactory {

	@Order(1)
	@ParameterizedTest
	@CsvSource({
		"j,,,",
		",Michael Lee,,",
		",,2026-01-01,2026-01-23",
		"j,Michael Lee,,"
	})
	void searchWithJpql(String passenger, String driver, LocalDate from, LocalDate to) {
		StringBuilder sb = new StringBuilder("""
				select td.passenger.name, td.driverLicence.driver.name,
				td.carLicence.number, td.trip.tripDate from TripDetail td 
				where 1=1
				""");
		
		Map<String, Object> temp = new HashMap<>();
		
		if(null != passenger) {
			sb.append(" and lower(td.passenger.name) like lower(:passenger)");
			temp.put("passenger", passenger.concat("%"));
		}
		if(null != driver) {
			sb.append(" and td.driverLicence.driver.name = :driver");
			temp.put("driver", driver);
		}
		if(null != from) {
			sb.append(" and td.trip.tripDate >= :from");
			temp.put("from", from);
		}
		if(null != to) {
			sb.append(" and td.trip.tripDate <= :to");
			temp.put("to", to);
		}
		
		var query = em.createQuery(sb.toString(),SelectPassengerDriverCarTripDate.class);
		
		for(Map.Entry m: temp.entrySet()) {
			query.setParameter((String)m.getKey(), m.getValue());
		}
		
		var list = query.getResultList();
		list.forEach(s -> System.out.println(s));
	}
}
