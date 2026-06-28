package com.jdc.hwy.fields;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class C_EmbeddableClass implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String name;
	private LocalDate date;
	private LocalTime time;
	
	@ElementCollection
	private List<String> list;

}
