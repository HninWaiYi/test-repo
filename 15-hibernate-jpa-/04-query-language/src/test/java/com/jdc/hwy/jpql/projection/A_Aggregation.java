package com.jdc.hwy.jpql.projection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.hwy.JpaFactory;
import com.jdc.hwy.model.dto.SelectDNameWithTotalCost;
import com.jdc.hwy.model.dto.SelectDriverPassengerCarByDate;

public class A_Aggregation extends JpaFactory {
	
	@Test
    @Order(4)
	void selectDriverPassengerCarByDateTest() {
		var jpql = """
				select new com.jdc.hwy.model.dto.SelectDriverPassengerCarByDate(
				td.driverLicence.driver.name, p.name, td.carLicence.car.model) from Passenger p 
				join p.tripDetails td
				where td.trip.tripDate between :from and :to
				""";
		var query = em.createQuery(jpql, SelectDriverPassengerCarByDate.class);
		query.setParameter("from", LocalDate.parse("2026-01-01"));
		query.setParameter("to", LocalDate.parse("2026-01-22"));
		var list = query.getResultList();
		list.forEach(r -> System.out.println(r.driver()+"/t"+r.passenger()+"/t"+r.car()));
	}
	
	@Test
    @Order(3)
	void sumWithProjectionTest() {
		var jpql = """
				select new com.jdc.hwy.model.dto.SelectDNameWithTotalCost(
				dl.driver.name as name,sum(td.trip.cost) as total)
				from DriverLicence dl 
				join dl.tripDetails td group by name
				""";
		var query = em.createQuery(jpql, SelectDNameWithTotalCost.class);
		var list = query.getResultList();
		list.forEach(r -> System.out.println(r.driver()+"/t"+r.total()));
	}
	
	@Test
    @Order(2)
	void sumWithPredicateTest() {
		var jpql = """
				select sum(td.trip.cost) from DriverLicence dl 
				join dl.tripDetails td 
				where dl.driver.name = :name
				""";
		var query = em.createQuery(jpql, Double.class);
		query.setParameter("name", "Michael Lee");
		var total = query.getSingleResult();
		System.out.println(total);
	}

	@Test
    @Order(1)
	void countTest() {
		var jpql = "select count(p) from Passenger p";
		var query = em.createQuery(jpql, Long.class);
		var count = query.getSingleResult();
		assertEquals(9, count);
	}
}
