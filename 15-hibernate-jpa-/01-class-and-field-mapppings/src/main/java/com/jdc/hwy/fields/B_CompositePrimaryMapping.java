package com.jdc.hwy.fields;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;

@Data
//@Entity
@Table(name = "product_tbl")
@IdClass(D_IDClass.class)
public class B_CompositePrimaryMapping implements Serializable {
	
//	@EmbeddedId
//	private C_EmbeddableClass id;
	
	private static final long serialVersionUID = 1L;
	@Id
	private String name;
	@Id
	private LocalDate date;
	@Id
	private LocalTime time;
	
	private double price;
	private LocalDate createDate;

}
