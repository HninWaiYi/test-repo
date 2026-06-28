package com.jdc.hwy.fields;

import java.util.Date;

import org.hibernate.annotations.Check;
import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
//@Entity
public class E_ColumnMapping {
	
	@Id
	private int id;
	
	@Column(length = 45, nullable = false, unique = true)
	private String name;
	
	@Check(constraints = "age between 1 and 120")
	@ColumnDefault("1")
	private int age;
	
	@Column(columnDefinition = "tinyint default 1 check(grade between 1 and 5)")
	private int grade;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Column(columnDefinition = "date default(current_date)")
	private LocalDate ld;
	
	private LocalTime lt;
	
	@Column(columnDefinition = "tinyint(1) default 0")
	private boolean isDelete;
	
	@Transient
	private boolean isActive;
	
	@Enumerated(EnumType.STRING)
	private Member member;
	
	public enum Member{
		Silver, Gold, Platinum
	}

}
