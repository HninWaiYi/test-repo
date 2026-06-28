package com.jdc.hwy.jpql;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.hwy.JpaFactory;
import com.jdc.hwy.model.Passenger;

public class A_Query_Vs_TypeQuery extends JpaFactory {

	@Test
	@Order(2)
	void typedQueryTest() {
		var query = em.createQuery("select p from Passenger p", Passenger.class);
		List<Passenger> list = query.getResultList();
		System.out.println(list);
	}
	
	@Test
	@Order(1)
	@SuppressWarnings("unchecked")
	void queryTest() {
		var query = em.createQuery("select p from Passenger p");
		List<Passenger> list = query.getResultList();
		System.out.println(list);
	}
}
