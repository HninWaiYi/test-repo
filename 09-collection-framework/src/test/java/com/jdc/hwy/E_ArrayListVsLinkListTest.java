package com.jdc.hwy;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class E_ArrayListVsLinkListTest {
	
	private List<Integer> list;
	
	@Test
	void test() {
		list = new ArrayList<Integer>();
		counter("Array List");
		
		list = new LinkedList<Integer>();
		counter("Link List");
		
	}
	
	private void counter(String name) {
		System.out.println("Before looping with ::: "+name);
		LocalTime start = LocalTime.now();
		addNumbers();
		LocalTime end = LocalTime.now();
		System.out.println("After looping ::: ");
		System.out.println("Total Time ::: "+Duration.between(end, start).getNano());
	}

	
	private  void addNumbers() {
		for(int i = 0 ; i <= 100000 ; i++ ) {
			list.add(i);
		}
	}
}
