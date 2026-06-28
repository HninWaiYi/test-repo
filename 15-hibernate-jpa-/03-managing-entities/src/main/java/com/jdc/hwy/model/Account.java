package com.jdc.hwy.model;

import com.jdc.hwy.model.listener.EntityListener;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.ExcludeDefaultListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PostRemove;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "account_tbl")
//@EntityListeners(EntityListener.class)
//@ExcludeDefaultListeners
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double balance;
	
//	@PrePersist
//	void beforeSave() {
//		System.out.println("Before saving account !");
//	}
//	
//	@PostRemove
//	void afterDelete() {
//		System.out.println("After deleting account !");
//	}
	
}
