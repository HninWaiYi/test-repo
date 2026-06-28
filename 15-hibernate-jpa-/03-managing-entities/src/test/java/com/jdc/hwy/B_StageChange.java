package com.jdc.hwy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.hwy.model.Contact;
import com.jdc.hwy.model.Department;
import com.jdc.hwy.model.Employee;

import jakarta.persistence.PersistenceException;

// Detached state (can't do) => remove, persist
// Removed state (can't do) => merge
public class B_StageChange extends JpaFactory {
	
	
	
	@Test
	@Order(3)
	void removeTest() {
		em.getTransaction().begin();
//		To be managed state
		var emp = em.find(Employee.class, 1);
		assertTrue(em.contains(emp));
		
//		To be removed state
		em.remove(emp);
		assertFalse(em.contains(emp));
		
//		To be managed state
		em.persist(emp);
		assertTrue(em.contains(emp));
		
//		To be detached state
		em.detach(emp);
		assertFalse(em.contains(emp));
		
		assertThrows(IllegalArgumentException.class, () -> em.remove(emp));
		
		em.getTransaction().commit();
		
	}
	
	@Test
	@Order(2)
	void mergeTest() {
//		To be transient state
		var emp = getEmployee();
		
//		To be managed state
		var emp1 = em.merge(emp);
		assertTrue(em.contains(emp1));
		
//		To be detached state
		em.clear();
		assertFalse(em.contains(emp1));
		
//		To be managed state
		var emp2 = em.merge(emp1);
		assertTrue(em.contains(emp2));
		
//		To be removed state
		em.remove(emp2);
		assertFalse(em.contains(emp2));
		
		assertThrows(IllegalArgumentException.class, () -> em.merge(emp2));
	}
	
	@Test
	@Order(1)
	void persistTest() {
//		To be transient state
		var emp = getEmployee();
		
		em.getTransaction().begin();
		
//		To be managed state
		em.persist(emp);
		assertTrue(em.contains(emp));
		
//		To be removed state
		em.remove(emp);
		assertFalse(em.contains(emp));
		
//		To be managed state
		em.persist(emp);
		assertTrue(em.contains(emp));
		
//		To be detached state
		em.detach(emp);
		assertFalse(em.contains(emp));
		
		assertThrows(PersistenceException.class, () -> em.persist(emp));
		
		em.getTransaction().commit();
	}

}
