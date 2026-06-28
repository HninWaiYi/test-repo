package com.jdc.hwy.classes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Data
//@Entity
@Table(name = "student_tbl",
	indexes= {
		@Index(columnList = "nrc")	
	},
	uniqueConstraints = {
		@UniqueConstraint(columnNames = "nrc")	
	})
public class A_ClassMapping {
	
	@Id
	private int id;
	private String name;
	private String nrc;
	private int age;

}
