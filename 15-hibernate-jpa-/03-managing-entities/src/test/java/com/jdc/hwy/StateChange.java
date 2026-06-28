package com.jdc.hwy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.jdc.hwy.model.Contact;
import com.jdc.hwy.model.Department;
import com.jdc.hwy.model.Employee;

public class StateChange extends JpaFactory {
	
	@Test
	@Order(4)
	void testRemoved() {
		var em = emf.createEntityManager();
		
		em.getTransaction().begin();
		var dep = em.find(Department.class, 1);
		
		var list = dep.getEmp();
		list.remove(0);
		System.out.println(list.size());
		
//		em.remove(dep);
		em.getTransaction().commit();
	}
	
	@Test
	@Disabled
	@Order(3)
	void testDetached() {
		var em = emf.createEntityManager();
		var emp = em.find(Employee.class,1);
		var cont = emp.getContact();
		var dep = emp.getDepartment();
		
		assertNotNull(emp);
		assertTrue(em.contains(emp));
		assertTrue(em.contains(cont));
		assertTrue(em.contains(dep));
		
//		em.detach(cont);
		em.clear();
	}
	
	@Order(2)
	@ParameterizedTest
	@Disabled
	@ValueSource(ints = 1)
	void testFind(int id) {
		var em = emf.createEntityManager();
		var emp = em.find(Employee.class, id);  //find=getReference
		
		em.close();
		
		System.out.println(emp.getName());
		System.out.println(emp.getDepartment().getName());
		
	}
	
	@Test
	@Order(1)
	void testPersist() {
		var contact = new Contact("0923445","0924566");
		var emp = new Employee();
		emp.setName("Andrew");
		emp.setContact(contact);
		
		var dep = new Department();
		dep.setName("sales");
		
		emp.setDepartment(dep);
		
		var em = emf.createEntityManager();
		em.getTransaction().begin();
//		em.persist(contact);
//		em.persist(dep);
		em.persist(emp);
		em.getTransaction().commit();
		em.close();
	}

	@Test
	@Disabled
	void test() {
		var em = emf.createEntityManager();
		em.getTransaction().begin();
		
//		Transient state
		var dep = new Department();
		dep.setName("Sales");
		assertFalse(em.contains(dep));
		
//		Managed State
		em.persist(dep);
		assertTrue(em.contains(dep));
		
//		Detached State
		em.detach(dep);
		assertFalse(em.contains(dep));
		
//		Manage State
		var newDep =  em.merge(dep);
		assertFalse(em.contains(dep));
		assertTrue(em.contains(newDep));
		
		newDep.setName("Sales Team");
		
		em.getTransaction().commit();
				
	}
}
