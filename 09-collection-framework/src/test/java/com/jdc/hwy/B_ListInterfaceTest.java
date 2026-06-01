package com.jdc.hwy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class B_ListInterfaceTest {

	private List<String> list;
	
	@Test
	void testRemove() {
		list = getList("array");
		addData("Andrew", "John", "William", "John");
		System.out.println("Set size :"+list.size());
		
//		remove with index
		list.remove(2);
		System.out.println("Set size :"+list.size());
		
		list.remove("John");
		list.remove("Andrew"); // Andrew already remove
		
		showData("Array List");
		System.out.println("Set size :"+list.size());
	}
	
	@Test
	@Disabled
	void testAddAndShowAll() {
		
		list = getList("array");
		addData("Andrew", "John", "William", "John");
		
//		add with index
		list.add(1, "Patick");
		showData("Array list");
		
		list = getList("link");
		addData("AA", "BB", "CC", "AA");
		showData("Link List");
	}
	
	void showData(String name) {
		System.out.println();
		System.out.println("======== "+name+" ========");
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("========================");
	}
	
//	(...)varArgs can use as array and will be used in last args only.
	void addData(String ...strings) {	
		for(String n : strings) {
			list.add(n);
		}
	}

	List<String> getList(String name) {
		return switch(name) {
		case "array" -> new ArrayList<>();
		case "link" -> new LinkedList<>();
		default -> null;
		};				
	}
}
