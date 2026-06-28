package com.jdc.hwy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ExcludeDefaultListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@ExcludeDefaultListeners
@Table(name = "contact_tbl")
@NoArgsConstructor
@RequiredArgsConstructor
public class Contact {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NonNull
	@Column(length = 12,nullable = false)
//	@Check(constraints = "char_length(primary) >= 6")
	private String primaryPhone;
	
	@NonNull
	@Column(length = 12)
	private String secondaryPhone;
//	@Check(constraints = "email REGEXP '^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\\\.[A-Za-z]{2,}$'")
	@NonNull
	private String email;
}
