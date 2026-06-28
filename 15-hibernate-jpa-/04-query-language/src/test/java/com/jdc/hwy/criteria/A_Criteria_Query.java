package com.jdc.hwy.criteria;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.hwy.JpaFactory;
import com.jdc.hwy.model.Passenger;
import com.jdc.hwy.model.Passenger_;
import com.jdc.hwy.model.dto.SelectPassenger;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class A_Criteria_Query extends JpaFactory {
	
	@Test
	@Order(4)
	void cqWithProjectionTest() {
		var cb = em.getCriteriaBuilder();
		var cq = cb.createQuery(SelectPassenger.class);
		var root = cq.from(Passenger.class);
		
//		select p.id, p.name, p.phone from Passenger p
		cq.select(
				cb.construct(
						SelectPassenger.class, 
						root.get(Passenger_.id),
						root.get(Passenger_.name),
						root.get(Passenger_.phone))
				);
		
		var query = em.createQuery(cq);
		var list = query.getResultList();
		list.forEach(p -> System.out.println(p.name()));
		
	}
	
	@Test
	@Order(3)
	void cqWithAggregationTest() {
		var cb = em.getCriteriaBuilder();
		var cq = cb.createQuery(Long.class);
		var root = cq.from(Passenger.class);
		
//		select count(p) from Passenger p
		cq.select(cb.count(root));
		
		var query = em.createQuery(cq);
		var count = query.getSingleResult();
		System.out.println("Passenger ::"+count);
	}
	
	@Test
	@Order(2)
	void cqWithPridicateTest() {
		var cb = em.getCriteriaBuilder();
		var cq = cb.createQuery(Passenger.class);
		var root = cq.from(Passenger.class);
		
//		select p from Passenger p
		cq.select(root);
		
//		lower(name) like 'j%' 
		Predicate p1 = cb.like(
				cb.lower(root.get(Passenger_.name)),
				"J".toLowerCase().concat("%"));
//		where lower(name) like 'j%'
		cq.where(p1);
		
		show(cq);
		
	}

	@Test
	@Order(1)
	void criteriaQueryTest() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
//		what we want
		CriteriaQuery<Passenger> cq = cb.createQuery(Passenger.class);
//		where we select
		Root<Passenger> root = cq.from(Passenger.class);
//		select p from Passenger
		cq.select(root);
		
		show(cq);
	}
	
	private void show(CriteriaQuery<Passenger> cq) {
		var query = em.createQuery(cq);
		var list = query.getResultList();
		list.forEach(p -> System.out.println(p.getName()));
	}
}
