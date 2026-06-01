package com.jdc.hwy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class F_MapInterfaceTest {
	
	private Map<Integer, String> map;
	
	@Test
	void test() {
		map = new LinkedHashMap<Integer, String>(); //HashMap, TreeMap(key order)
		add();
		show("Hash Map");
		System.out.println(map.get(6));
	}
	
	private void show(String name) {
		System.out.println("======== "+name+" =======");
		for(Entry<Integer, String> e : map.entrySet()) {
			System.out.println("Key : %d  Value : %s".formatted(e.getKey(), e.getValue()));
		}
		System.out.println();
	}

//	Key can't duplicate
//	TreeMap order by key
	private void add() {
		map.put(3, "CC");
		map.put(5, "EE");
		map.put(2, "BB");
		map.put(1, "AA");
		map.put(4, "DD");
		
	}

}
