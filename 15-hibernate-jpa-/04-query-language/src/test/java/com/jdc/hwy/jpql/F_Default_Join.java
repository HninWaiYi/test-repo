package com.jdc.hwy.jpql;

import java.sql.Driver;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.hwy.JpaFactory;
import com.jdc.hwy.model.Address;
import com.jdc.hwy.model.CarLicence;
import com.jdc.hwy.model.TripDetail;
import com.jdc.hwy.model.TripDetailPk;

public class F_Default_Join extends JpaFactory {
	
	@Test
	@Order(4)
	void addressTest() {
		var address = em.find(Address.class, 1);
		
	}
	
	@Test
	@Disabled
	@Order(3)
	void driverTest() {
		var driver = em.find(Driver.class, 1);
		
	}
	
	@Test
	@Disabled
	@Order(2)
	void ManyToOneTest() {
		var pk = new TripDetailPk();
		pk.setCarLicenceId("YGN-5A-1234");
		pk.setDriverLicenceId("DL-10001");
		pk.setPassengerId(1);
		pk.setTripId(1);
		
		var detail = em.find(TripDetail.class, pk);
	}
	
	@Test
	@Disabled
	@Order(1)
	void OneToOneTest() {
		var lic = em.find(CarLicence.class, "YGN-5A-1234");
//		var car = lic.getCar();
//		System.out.println(car.getBrand()+"\t"+car.getModel());
	}
	
	

}
