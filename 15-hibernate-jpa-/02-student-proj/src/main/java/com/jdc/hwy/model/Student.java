package com.jdc.hwy.model;

import java.time.LocalDate;

import com.jdc.hwy.model.listener.EnableTimeListener;
import com.jdc.hwy.model.listener.Times;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "student_tbl")
public class Student implements EnableTimeListener {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NonNull
	@Column(nullable = false,length = 45)
	private String name;
	@NonNull
	private LocalDate dob;
	
	@OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@PrimaryKeyJoinColumn  //can share and used student id from contact
	private Contact contact;
	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private Address address;
	
	@Embedded
	private Times times;
}
