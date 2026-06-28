package com.jdc.hwy.jpql;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.hwy.JpaFactory;
import com.jdc.hwy.model.Passenger;


public class C_Result extends JpaFactory {

	@Test
	@Order(1)
	void executeUpdateTest() {
		var query = em.createQuery("""
				update Passenger p set name = ?1 where id = ?2
				""");
		query.setParameter(1, "John");
		query.setParameter(2, 1);
		
		em.getTransaction().begin();
		var row = query.executeUpdate();
		em.getTransaction().commit();
		assertEquals(1, row);
	}
	
	@Test
	@Order(2)
	void getSingleResultTest() {
		var query = em.createQuery("select count(p) from Passenger p", Long.class);
		var count = query.getSingleResult();
		assertEquals(3, count);
	}
	
	@Test
	@Order(3)
	void getResultListTest() {
		var query = em.createQuery("select p from Passenger p", Passenger.class);
		var list = query.getResultList();
		assertEquals(3, list.size());
	}
	
	@Test
	@Order(4)
	void getResultStreamTest() {
		var query = em.createQuery("select p from Passenger p", Passenger.class);
		var stream = query.getResultStream();
		assertEquals(3, stream.count());
	}
}
