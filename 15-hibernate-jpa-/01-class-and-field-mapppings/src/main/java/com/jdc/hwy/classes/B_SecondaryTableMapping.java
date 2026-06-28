package com.jdc.hwy.classes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.Table;
import lombok.Data;

@Data
//@Entity
@Table(name = "student_info_tbl")
@SecondaryTable(name = "address_tbl")
@SecondaryTable(name = "contact_tbl")
public class B_SecondaryTableMapping {
	
	@Id
	private int id;
	
	@Column(table = "address_tbl")
	private String city;
	@Column(table = "address_tbl")
	private String township;
	@Column(table = "address_tbl")
	private String street;
	
	@Column(table = "contact_tbl")
	private String email;
	@Column(table = "contact_tbl")
	private String primaryContact;
	@Column(table = "contact_tbl")
	private String secondaryContact;

}
