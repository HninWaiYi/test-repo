package com.jdc.hwy.relations;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
//@Entity
@Table(name = "category_tbl")
public class Category {

	@Id
	private int id;
	private String name;
	
//	Collection type (OneToMany | ManyToMany)
//	Default => Join table
	@OneToMany
	@JoinColumn(name = "cat_id")
	private List<Product> products;
	
	@ManyToMany
	@JoinTable(name = "cat_size_tbl",
	joinColumns = {
			@JoinColumn(name = "cat_id")
	},
	inverseJoinColumns = {
			@JoinColumn(name = "size_id")
	})
	private List<ProductSize> sizes;
	
}
