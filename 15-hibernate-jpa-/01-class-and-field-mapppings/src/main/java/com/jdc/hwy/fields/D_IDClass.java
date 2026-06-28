package com.jdc.hwy.fields;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;

@Data
public class D_IDClass implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private LocalDate date;
	private LocalTime time;

}
