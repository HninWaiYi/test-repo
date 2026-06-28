package com.jdc.hwy.jpql;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.hwy.JpaFactory;
import com.jdc.hwy.model.Passenger;
import com.jdc.hwy.model.Trip;

public class H_TripTest extends JpaFactory {
	
	@Test
	@Order(3)
	void getPassengerByTrip() {
		var join = """
				select p from Passenger p 
				join p.tripDetails td
				where td.trip.dropOffPoint= :point
				""";
		var jpql = """
				select td.passenger from TripDetail td 
				where td.trip.dropOffPoint = :point
				""";
		var query = em.createQuery(join,Passenger.class);
		query.setParameter("point", "Sule Pagoda");
		var list = query.getResultList();
		list.forEach(p -> System.out.println(p.getName()));
	}
	
	@Test
	@Disabled
	@Order(2)
	void getTripByPassenger() {
		var join = """
				select td.trip from TripDetail td 
				join td.passenger p
				where p.name = :name
				""";
		var jpql = """
				select td.trip from TripDetail td 
				where td.passenger.name = :name
				""";
		var query = em.createQuery(join,Trip.class);
		query.setParameter("name", "John Doe");
		var list = query.getResultList();
		list.forEach(t -> System.out.println(t.getDropOffPoint()));
	}

	@Test
	@Disabled
	@Order(1)
	void getTripByDriver() {
		var join = """
				select td.trip from TripDetail td 
				join td.driverLicence dl 
				join dl.driver d 
				where d.name = :name
				""";
		var jpql = """
				select td.trip from TripDetail td 
				where td.driverLicence.driver.name = :name
				""";
		var query = em.createQuery(jpql,Trip.class);
		query.setParameter("name", "David Brown");
		var list = query.getResultList();
		list.forEach(t -> System.out.println(t.getDropOffPoint()));
	}
	
}
