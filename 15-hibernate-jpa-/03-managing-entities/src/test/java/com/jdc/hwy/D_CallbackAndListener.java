package com.jdc.hwy;

import org.junit.jupiter.api.Test;

import com.jdc.hwy.model.Account;

public class D_CallbackAndListener extends JpaFactory {
	
	@Test
	void test() {
		var acc = new Account();
		acc.setName("John");
		acc.setBalance(20000);
		
		em.getTransaction().begin();
		
//		To be managed state prePersist, postPersist
		em.persist(acc);
		
		acc.setBalance(acc.getBalance()-3000);
		
		em.remove(acc);
		
		em.getTransaction().commit();
	}

}
