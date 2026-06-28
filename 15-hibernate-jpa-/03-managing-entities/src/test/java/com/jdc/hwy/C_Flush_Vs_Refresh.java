package com.jdc.hwy;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.hwy.model.Account;

import jakarta.persistence.LockModeType;

public class C_Flush_Vs_Refresh extends JpaFactory {
	
	@Test
	@Order(1)
	void test() {
		try {
			Thread ope1 = getOpeOne("Operation One", 5000);
			Thread ope2 = getOpeTwo("Operation Two", 5000);
			ope1.start();
			ope2.start();
			Thread.sleep(1500);
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	private Thread getOpeTwo(String ope, double b) {
		return new Thread(() -> {
			try {
				System.out.println("=================   "+ope+"   ===============");
				var em = emf.createEntityManager();
				
				var acc = em.find(Account.class, 1);
				System.out.println("(Two) Before update balance ::: "+acc.getBalance());
				
				em.getTransaction().begin();
				
				Thread.sleep(700);
				
				em.refresh(acc);
				acc.setBalance(acc.getBalance() + b);
				em.flush();
				System.out.println("(Two) After update ::: "+acc.getBalance());
				
				em.getTransaction().commit();
				System.out.println("====================================================");
				
			}catch(Exception e) {
				System.err.println(e.getMessage());
			}
		});
	}

	private Thread getOpeOne(String ope, double b) {
		return new Thread(() -> {
			try {
				System.out.println("=================   "+ope+"   ===============");
				var em = emf.createEntityManager();
				
				var acc = em.find(Account.class, 1);
				System.out.println("(One) Before update balance ::: "+acc.getBalance());
				
				em.getTransaction().begin();
				
				Thread.sleep(900);
				em.refresh(acc);
				acc.setBalance(acc.getBalance() - b);
				em.flush();
				System.out.println("(One) After update ::: "+acc.getBalance());
				
				em.getTransaction().commit();
				System.out.println("====================================================");
				
			}catch(Exception e) {
				System.err.println(e.getMessage());
			}
		});
	}

}
