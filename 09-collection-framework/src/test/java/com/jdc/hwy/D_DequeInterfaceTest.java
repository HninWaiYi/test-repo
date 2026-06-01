package com.jdc.hwy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class D_DequeInterfaceTest {
	
	Deque<String> deque;
	
	@Test
	void test() {
//		deque = new ArrayDeque<>();
		deque = new LinkedList<>();
		
		add("ArrayDeque");
		show();
		
		remove("ArrayDeque");
		show();
	}
	
	void show() {
		System.out.println();
		for(String s:deque) {
			System.out.println("Element ::: "+s);
		}
		System.out.println();
		System.out.println("============ End ===========");
	}
	
	void remove(String name) {
		System.out.println("============"+name+"===========");
		deque.removeLast();
		deque.removeFirst();
	}
	
	void add(String name) {
		System.out.println("============"+name+"===========");
		deque.add("DD");
		deque.addFirst("SS");
		deque.add("BB");
		deque.addLast("GG");
		deque.add("AA");
	}

}
