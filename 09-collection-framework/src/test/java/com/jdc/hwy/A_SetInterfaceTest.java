package com.jdc.hwy;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class A_SetInterfaceTest {
	
	private Set<String> set;
	
	@Test
	void testRemove() {
		set = getSet("link");
		addData("Andrew", "John", "William", "John");
		System.out.println("Set size :"+set.size());
		
		set.remove("Andrew");
		System.out.println("Set size :"+set.size());
		
		set.remove("John");
		set.remove("Andrew"); // Andrew already remove
		
		showData("Hash");
		System.out.println("Set size :"+set.size());
	}
	
	@Test
	@Disabled
	void testAddAndShowAll() {
//		create HashSet object
		set = getSet("hash");
		
//		add Data to hashSet
		addData("Andrew", "John", "William", "John");
		
//		show data from hashSet
		showData("Hash");
		
		set = getSet("link");
		addData("Andrew", "John", "William", "William");
		showData("Link");
		
		set = getSet("tree");
		addData("AA", "BB", "CC", "AA");
		showData("Tree");
	}
	
	void showData(String name) {
		System.out.println();
		System.out.println("======== "+name+" ========");
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println("========================");
	}
	
//	(...)varArgs can use as array and will be used in last args only.
	void addData(String ...strings) {
		
		for(String n : strings) {
			set.add(n);
		}
	}

	Set<String> getSet(String name) {
		return switch(name) {
		case "hash" -> new HashSet<>();
		case "tree" -> new TreeSet<>();
		case "link" -> new LinkedHashSet<>();
		default -> null;
		};		
		
	}
}
