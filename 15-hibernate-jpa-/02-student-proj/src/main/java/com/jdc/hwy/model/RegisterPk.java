package com.jdc.hwy.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ExcludeDefaultListeners;
import lombok.Data;

@Data
@Embeddable
@ExcludeDefaultListeners
public class RegisterPk  implements Serializable{
	private static final long serialVersionUID = 1L;

	@Column(name ="course_id",insertable = false,updatable = false)
	private int courseId;
	
	@Column(name ="student_id",insertable = false,updatable = false)
	private int studentId;
	
	@Column(name ="classroom_id",insertable = false,updatable = false)
	private int classroomId;
}
