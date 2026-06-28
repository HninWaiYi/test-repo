package com.jdc.hwy;

import java.time.LocalDate;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.jdc.hwy.model.Address;
import com.jdc.hwy.model.Contact;
import com.jdc.hwy.model.Course;
import com.jdc.hwy.model.Student;

public class StudentTest extends JpaFactory {
	
	@Test
	void testCourse() {
		var course = new Course("Java");
		
		var em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(course);
		
		course.setName("Core Java");
		em.getTransaction().commit();
		
	}
	
	@Test
	@Disabled
	void testStudent() {
		var contact = new Contact("09345322","09876655","andrew@gmail.com");
		var address = new Address("Latha", "40st");
		var stu = new Student("Andrew",LocalDate.of(2000, 10, 11));
		stu.setContact(contact);
		stu.setAddress(address);
		
		var em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(stu);
		
		stu.setName("Andrew Kaung");
		em.getTransaction().commit();
		
	}

}
