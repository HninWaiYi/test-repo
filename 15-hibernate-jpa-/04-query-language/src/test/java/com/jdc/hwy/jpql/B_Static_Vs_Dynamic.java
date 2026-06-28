package com.jdc.hwy.jpql;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.hwy.JpaFactory;
import com.jdc.hwy.model.Passenger;

public class B_Static_Vs_Dynamic extends JpaFactory {

	@Test
	@Order(1)
	void dynamicQueryTest() {
		var query = em.createQuery("select p from Passenger p", Passenger.class);
		var list = query.getResultList();
		assertEquals(3, list.size());
	}
	
	@Test
	@Order(2)
	void staticQueryTest() {
		var query = em.createNamedQuery("Passenger.selectAll", Passenger.class);
		var list = query.getResultList();
		assertEquals(3, list.size());
	}
}
