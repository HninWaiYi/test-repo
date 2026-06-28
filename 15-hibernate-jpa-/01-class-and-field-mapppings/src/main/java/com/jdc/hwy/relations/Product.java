package com.jdc.hwy.relations;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
//@Entity
@Table(name = "product_tbl")
public class Product {

	@Id
	private int id;
	private String name;
	
	
//	Single Field (end with One) OneToOne | ManyToOne
// Default => Join Column
	
//	@ManyToOne
//	private Category category;
//	
	@OneToOne(mappedBy = "product")
	private Barcode code;
	
	
	
}