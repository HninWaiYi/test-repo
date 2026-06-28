package com.jdc.hwy.model;

import java.util.List;

import com.jdc.hwy.model.dto.SelectPassenger;

import jakarta.persistence.Column;
import jakarta.persistence.ColumnResult;
import jakarta.persistence.ConstructorResult;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SqlResultSetMapping;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "passenger_tbl")
@SqlResultSetMapping(
	    name = "p.map.selectAll",
	    classes = {
	        @ConstructorResult(
	            targetClass = SelectPassenger.class,
	            columns= {
	                @ColumnResult(name = "id"),
	                @ColumnResult(name = "name"),
	                @ColumnResult(name = "phone")
	            })
	    }
	    )
@NamedNativeQuery(
		name = "p.selectAll",
		query = "select * from passenger_tbl",
		resultSetMapping = "p.map.selectAll"
		)

@NamedQuery(name = "Passenger.selectAll", query = "select p from Passenger p")
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false, length = 45)
	private String name;
	@Column(nullable = false, length = 45)
	private String phone;
	
	@OneToMany(mappedBy = "passenger")
	private List<TripDetail> tripDetails;
}
