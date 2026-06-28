package com.jdc.hwy.exe;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.hwy.JpaFactory;
import com.jdc.hwy.model.CarLicence;
import com.jdc.hwy.model.CarLicence_;
import com.jdc.hwy.model.Car_;
import com.jdc.hwy.model.DriverLicence;
import com.jdc.hwy.model.DriverLicence_;
import com.jdc.hwy.model.Driver_;
import com.jdc.hwy.model.dto.SelectNameLicenceAndValidDate;

public class A_Sql_Vs_Jpql extends JpaFactory {
	
	@Test
	@Order(5)
	void selectCarByValidDateWithCriteria() {
		var cb = em.getCriteriaBuilder();
		var cq = cb.createQuery(SelectNameLicenceAndValidDate.class);
		var root = cq.from(CarLicence.class);
		
		cq.multiselect(
//				without join driver
				root.get(CarLicence_.car).get(Car_.brand),
				root.get(CarLicence_.number),
				root.get(CarLicence_.validDate)
				);
	
		
		var query = em.createQuery(cq);
		var list = query.getResultList();
		list.forEach(s -> System.out.println(s.name()));
	}
	
	@Test
	@Disabled
	@Order(3)
	void selectCarByValidDateWithJpql() {
		var jpql = """
				select new com.jdc.hwy.model.dto.SelectNameLicenceAndValidDate(
				l.car.brand, l.number, l.validDate) from CarLicence l
				where l.validDate = :valid
				""";
		var query = em.createQuery(jpql);
		query.setParameter("valid", LocalDate.parse("2025-12-31"));
		List<SelectNameLicenceAndValidDate> list = query.getResultList();
		list.forEach(d -> System.out.println(d.name()+"\t"+d.number()+"\t"+d.validDate()));
	}
	
	@Test
	@Disabled
	@Order(4)
	void selectCarByValidDateWithSql() {
		var sql = """
				select c.brand, cl.number, cl.validDate 
				from car_licence_tbl cl join car_tbl c where cl.validDate = :valid
				""";
		var query = em.createNativeQuery(sql,SelectNameLicenceAndValidDate.class);
		query.setParameter("valid", LocalDate.parse("2025-12-31"));
		List<SelectNameLicenceAndValidDate> list = query.getResultList();
		list.forEach(d -> System.out.println(d.name()+"\t"+d.number()+"\t"+d.validDate()));
	}

	@Test
	@Disabled
	@Order(1)
	void selectDriverByValidDateWithSql() {
		var sql = """
				select d.name name, l.number number, l.validDate validDate from
				driver_licence_tbl l join driver_tbl d
				on l.driver_id = d.id
				where l.validDate = :valid
				""";
		
		var query = em.createNativeQuery(sql,SelectNameLicenceAndValidDate.class);
		query.setParameter("valid", LocalDate.parse("2027-01-01"));
		List<SelectNameLicenceAndValidDate> list = query.getResultList();
		list.forEach(d -> System.out.println(d.name()+"\t"+d.number()+"\t"+d.validDate()));
	}
	
	@Test
	@Disabled
	@Order(2)
	void selectDriverByValidDateWithJpql() {
		
		var jpql = """
				select new com.jdc.hwy.model.dto.SelectNameLicenceAndValidDate(
				dl.driver.name, dl.number, dl.validDate)
				 from DriverLicence dl where dl.validDate = :valid
				""";
		
		var query = em.createQuery(jpql);
		query.setParameter("valid", LocalDate.parse("2027-01-01"));
		List<SelectNameLicenceAndValidDate> list = query.getResultList();
		list.forEach(d -> System.out.println(d.name()+"\t"+d.number()+"\t"+d.validDate()));
	}
}
