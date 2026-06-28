package com.jdc.hwy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.jdc.hwy.model.Contact;
import com.jdc.hwy.model.Department;
import com.jdc.hwy.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@TestMethodOrder(OrderAnnotation.class)
public class JpaFactory {
	
	static EntityManagerFactory emf;
	EntityManager em;
	
	@BeforeAll
	static void init() {
		emf = Persistence.createEntityManagerFactory("managing-entities");
	}
	
	
	@BeforeEach
	void createEm() {
		em = emf.createEntityManager();
	}
	
	@AfterEach
	void closeEm() {
		if(null != em && em.isOpen())
			em.close();
	}
	
	@AfterAll
	static void closeEmf() {
		if(null != emf && emf.isOpen())
			emf.close();
	}
	
	
	Employee getEmployee() {
		var cont = new Contact("098888645","097773453");
		var dep = new Department();
		dep.setId(2);
		var emp = new Employee();
		emp.setName("Arnel");
		
		emp.setContact(cont);
		emp.setDepartment(dep);
		
		return emp;
	}
	
//	@Test
//	void test() {
//		var dep = new Department();
//		dep.setName("Production");
////		dep.add(new Employee("Andrew",new Contact("0987665","09766555")),
////				new Employee("John",new Contact("01987666","01987766")),
////				new Employee("William",new Contact("0824345","09976544")));
//		
//		var em = emf.createEntityManager();
//		
//		em.getTransaction().begin();
//		em.persist(dep);
//		em.getTransaction().commit();
//		em.close();
//		emf.close();
//	}

}
