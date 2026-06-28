package com.jdc.hwy.sql;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.hwy.JpaFactory;
import com.jdc.hwy.model.dto.SelectPassenger;

public class A_NamedQuery_Vs_DynamicQuery extends JpaFactory {
	
	@Test
	@Order(2)
	void dynamicQueryWithResultSetMapTest() {
		var sql = "select * from passenger_tbl";
		var query = em.createNativeQuery(sql, "p.map.selectAll");
		List<SelectPassenger> list = query.getResultList();
		list.forEach(p -> System.out.println(p.name()+"\t"+p.phone()));
	}
	
	@Test
	@Order(3)
	void namedQueryWithResultSetMapTest() {
		var query = em.createNamedQuery("p.selectAll",SelectPassenger.class);
		List<SelectPassenger> list = query.getResultList();
		list.forEach(p -> System.out.println(p.name()+"\t"+p.phone()));
	}
	
	
	
	@Test
	@Order(1)
	void dynamicQueryWithResultClassTest() {
		var sql = "select * from passenger_tbl";
		var query = em.createNativeQuery(sql,SelectPassenger.class);
		List<SelectPassenger> list = query.getResultList();
		list.forEach(p -> System.out.println(p.name()+"\t"+p.phone()));
	}

}
