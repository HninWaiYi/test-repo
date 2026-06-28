package com.jdc.hwy.fields;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
import lombok.Data;

@Data
//@Entity
@Table(name = "category_tbl")
public class A_PrimaryKeyMapping {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO) 
	
//	@GeneratedValue(generator = "category_seq_gen")
//	@SequenceGenerator(name = "category_seq_gen", initialValue = 10, allocationSize =1)
	
	@GeneratedValue(generator = "")
	@TableGenerator(name = "category_table_gen",
					initialValue = 5, //start from 5
					allocationSize = 5 )
	private int id;
	private String name;

}
