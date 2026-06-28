package com.jdc.hwy.model.listener;

import jakarta.persistence.PostPersist;
import jakarta.persistence.PostRemove;

public class EntityListener {
	
	@PostPersist
	void afterSave(Object obj) {
		System.out.println("After saving account !");
	}
	
	@PostRemove
	void afterUpdate(Object obj) {
		System.out.println("After removing account !");
	}

}
