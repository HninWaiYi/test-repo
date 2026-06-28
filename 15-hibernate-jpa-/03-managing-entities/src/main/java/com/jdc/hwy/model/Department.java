package com.jdc.hwy.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "department_tbl")
// Cascade *** reference entity will operate as target entity
// Orphan removal 
// 1. reference entities will remove when target entity remove
// 2. reference entities will also remove where target remove from target list.
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 45)
	private String name;
	
	@OneToMany(mappedBy = "department", orphanRemoval = true, cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	private List<Employee> emp = new ArrayList<Employee>();
	
	public void add(Employee...ps) {
		emp.addAll(List.of(ps));
	}

}
