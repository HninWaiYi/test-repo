package com.jdc.hwy.inheritance;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("S")
public class Student extends Account {
	
	@ElementCollection
	private List<String> hobbies = new ArrayList<String>();
	
	public Student() {
		super(Member.Student);
	}
	
	public void add(String...hs) {
		hobbies.addAll(List.of(hs));
	}

}
