package com.jdc.hwy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.jdc.hwy.converter.Lottery;
import com.jdc.hwy.fields.E_ColumnMapping.Member;
import com.jdc.hwy.inheritance.Officer;
import com.jdc.hwy.inheritance.Student;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaFactory {
	
	static EntityManagerFactory emf;
	
	@BeforeAll
	static void init() {
		emf = Persistence.createEntityManagerFactory("class-and-field-mapppings");
	}
	
	@Test
	void testConverter() {
		var em = emf.createEntityManager();
		var con = new Lottery();
		con.setNumber(54);
		con.setDigit(6);

		
		em.getTransaction().begin();
			em.persist(con);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	@Test
	@Disabled
	void test() {
		var em = emf.createEntityManager();
//		var acc = new Officer();
//		acc.setName("Sandi");
//		acc.setLoginId("ssstry");
//		acc.setPassword("123rty");
//		acc.setLaptop("Acer");
		
		var acc = new Student();
		acc.add("Watch movie","Reading","play games");
		acc.setName("Sandi");
		acc.setLoginId("ssstry");
		acc.setPassword("123rty");

		
		em.getTransaction().begin();
			em.persist(acc);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
