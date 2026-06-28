package com.jdc.hwy.jpql;

import java.sql.Driver;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.hwy.JpaFactory;
import com.jdc.hwy.model.Address;
import com.jdc.hwy.model.CarLicence;

public class G_Custom_Join extends JpaFactory {
	
	@Test
	@Disabled
	@Order(3)
	void manyTest() {
		var join = "select ad from Address ad join ad.drivers d";
		var query = em.createQuery(join, Address.class);
		var list = query.getResultList();
	}
	
	@Test
	@Disabled
	@Order(2)
	void oneTest() {
		var join = "select d from Driver d join d.address ad";
		var query = em.createQuery(join, Driver.class);
		var list = query.getResultList();
	}
	
	@Test
	@Order(1)
	void singleFieldTest() {
//		var query = em.createQuery("""
//				select c from Car c
//				""",Car.class);
//		var withoutJoin = "select c from CarLicence c";
//		var join = "select c from CarLicence c where c.carLicence.number = :num"; //single field
		var withJoin = "select cl from CarLicence cl join cl.car c where c.brand = :brand";
		
		var query = em.createQuery(withJoin, CarLicence.class);
		query.setParameter("brand", "Toyoko");
		var list = query.getResultList();
		list.forEach(cl -> System.out.println(cl.getNumber()+"/t"+cl.getCar().getBrand()));
	}

}
