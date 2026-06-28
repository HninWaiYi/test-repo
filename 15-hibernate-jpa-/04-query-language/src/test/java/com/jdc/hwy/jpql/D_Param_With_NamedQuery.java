package com.jdc.hwy.jpql;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.hwy.JpaFactory;
import com.jdc.hwy.model.Driver;

public class D_Param_With_NamedQuery extends JpaFactory {

	@Test
	@Order(1)
	void useIndexParam() {
		var query = em.createNamedQuery("driver.findByAge", Driver.class);
		query.setParameter(1, LocalDate.of(1984, 01, 01));
		var size = query.getResultList().size();
		assertEquals(2, size);
	}
	
	@Test
	@Order(1)
	void useNameParam() {
		var query = em.createNamedQuery("driver.findByNameLike", Driver.class);
		query.setParameter("n", "d".concat("%"));
		var size = query.getResultStream().count();
		assertEquals(1, size);
	}
}
