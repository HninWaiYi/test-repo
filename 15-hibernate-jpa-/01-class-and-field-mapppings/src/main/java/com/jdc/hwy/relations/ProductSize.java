package com.jdc.hwy.relations;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Data
//@Entity
public class ProductSize {

	@Id
	private int id;
	private String name;
	
	@ManyToMany(mappedBy = "sizes")
	private List<Category> categories;
}