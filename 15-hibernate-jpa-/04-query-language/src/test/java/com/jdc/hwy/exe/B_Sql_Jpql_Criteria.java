package com.jdc.hwy.exe;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.hwy.JpaFactory;
import com.jdc.hwy.model.Address_;
import com.jdc.hwy.model.CarLicence_;
import com.jdc.hwy.model.Car_;
import com.jdc.hwy.model.DriverLicence_;
import com.jdc.hwy.model.Driver_;
import com.jdc.hwy.model.TripDetail;
import com.jdc.hwy.model.TripDetail_;
import com.jdc.hwy.model.dto.SelectDNameDNumberTownshipStreetClNumberCModel;

@SuppressWarnings("unchecked")
public class B_Sql_Jpql_Criteria extends JpaFactory {
	
//	select driver info(name, nrc, address) by car licence?
	
	@Test
	@Order(3)
	void selectWithCriteria() {
		var cb = em.getCriteriaBuilder();
		var cq = cb.createQuery(SelectDNameDNumberTownshipStreetClNumberCModel.class);
		var root = cq.from(TripDetail.class);
		
		var driver = root.join(TripDetail_.driverLicence).get(DriverLicence_.driver);
		var carLic = root.join(TripDetail_.carLicence);
		
		cq.multiselect(
				driver.get(Driver_.name),
				root.get(TripDetail_.driverLicence).get(DriverLicence_.number),
				driver.get(Driver_.address).get(Address_.township),
				driver.get(Driver_.address).get(Address_.street),
				carLic.get(CarLicence_.number),
				carLic.get(CarLicence_.car).get(Car_.model)
				);
		
//		cq.where(cb.equal(carLic.get(CarLicence_.number), "MDY-7B-5678"));
		cq.where(cb.and(
				cb.equal(carLic.get(CarLicence_.number), "MDY-7B-5678"),
				cb.equal(carLic.get(CarLicence_.car).get(Car_.model), "Civic")
				));
		
		var query = em.createQuery(cq);
		System.out.println(query.getResultStream().findFirst().get());
	}
	
	@Test
	@Order(2)
	void selectWithJpql() {
		var jpql = """
				select new com.jdc.hwy.model.dto.SelectDNameDNumberTownshipStreetClNumberCModel(td.driverLicence.driver.name,td.driverLicence.number,
				td.driverLicence.driver.address.township,td.driverLicence.driver.address.street,
				td.carLicence.number,td.carLicence.car.model
				)from TripDetail td where td.carLicence.number = :clNumber
				""";
		
		var join = """
				select new com.jdc.hwy.model.dto.SelectDNameDNumberTownshipStreetClNumberCModel(
				d.name,td.driverLicence.number,d.address.township,d.address.street,cl.number,cl.car.model)
				from TripDetail td 
				join td.driverLicence.driver d
				join td.carLicence cl
				where cl.number = :clNumber and cl.car.model = :model
				""";
		
		var query = em.createQuery(join,SelectDNameDNumberTownshipStreetClNumberCModel.class);
		query.setParameter("clNumber", "MDY-7B-5678");
		query.setParameter("model", "Civic");
		System.out.println(query.getResultStream().findFirst().get());

	}
	
	@Test
	@Order(1)
	void selectWithSql() {
		var sql = """
				select d.name,dl.number,ad.township,ad.street,cl.number,c.model from car_tbl c
				join car_licence_tbl cl on cl.car_id = c.id
				join trip_detail_tbl tdt on tdt.car_licence_id = cl.number
				join driver_licence_tbl dl on tdt.driver_licence_id = dl.number
				join driver_tbl d on d.id = dl.driver_id
				join address_tbl ad on d.address_id = ad.id
				where cl.number = :clNumber and c.model = :model
				""";
		
		var query = em.createNativeQuery(sql,SelectDNameDNumberTownshipStreetClNumberCModel.class);
		query.setParameter("clNumber", "MDY-7B-5678");
		query.setParameter("model", "Civic");
		var stream = query.getResultStream().map(obj -> (SelectDNameDNumberTownshipStreetClNumberCModel)obj);
//		System.out.println(stream.findFirst().get());
		System.out.println(stream.findFirst().orElse("There is no driver"));

	}
	

}
