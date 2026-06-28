package com.jdc.hwy.relations;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
//@Entity
public class Barcode {

	@Id
	private int id;
	private String name;
	
	@OneToOne
	@JoinTable(name = "code_product_tbl",
	joinColumns = {
			@JoinColumn(name = "code_id")
	},
	inverseJoinColumns = {
			@JoinColumn(name = "p_id")
	})
	private Product product;
}
