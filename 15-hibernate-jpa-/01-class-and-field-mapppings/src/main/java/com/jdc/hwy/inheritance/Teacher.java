package com.jdc.hwy.inheritance;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("T")
public class Teacher extends Account {
	
	@OneToOne
	private Car car;
	
	public Teacher() {
		super(Member.Teacher);
	}

}
