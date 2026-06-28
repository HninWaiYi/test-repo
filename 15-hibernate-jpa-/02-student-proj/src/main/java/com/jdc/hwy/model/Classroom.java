package com.jdc.hwy.model;

import com.jdc.hwy.model.listener.EnableTimeListener;
import com.jdc.hwy.model.listener.Times;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "classroom_tbl")
public class Classroom implements EnableTimeListener {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@Embedded
	private Times times;
}
