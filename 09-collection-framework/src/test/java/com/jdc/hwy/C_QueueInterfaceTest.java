package com.jdc.hwy;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

import org.junit.jupiter.api.Test;

public class C_QueueInterfaceTest {
	
	Queue<String> queue;
	
	
	@Test
	void useLinkList() {
		queue = new LinkedList<String>();
//		addOffer(queue, "Link List");
//		removePoll(queue, "Link List");
		elementPeek(queue, "Link List");
		show();
		
		queue = new PriorityQueue<String>(2);
//		addOffer(queue, "Priority Queue");
//		removePoll(queue, "Priority Queue");
		elementPeek(queue, "Priority Queue");
		show();
		
//	   add use show Queue full Exception error, offer use do not show Queue full Exception error	
		queue = new ArrayBlockingQueue<String>(1);
//		addOffer(queue, "Array Blocking Queue");
//		removePoll(queue, "Array Blocking Queue");
		elementPeek(queue, "Array Blocking Queue");
		show();
		
		queue = new ArrayDeque<String>(2);
//		addOffer(queue, "Array Deque");
//		removePoll(queue, "Array Deque");
		elementPeek(queue, "Array Deque");
		show();
	}
	
	void elementPeek(Queue<String> queue, String message) {
		removePoll(queue, message);
//		System.out.println(queue.element());  //NoSuchElement Exception
		System.out.println("Peek :"+queue.peek());  //Null
	
	}
	
	void removePoll(Queue<String> queue, String message) {
		addOffer(queue, message);
		queue.remove();
		queue.poll();
//		queue.remove(); //NoSuchElement Exception
		queue.poll();
	}
	
	void addOffer(Queue<String> queue, String message) {
		System.out.println("======== "+message+" =======");
		queue.add("Andrew");
		queue.offer("John");
//		queue.add("William"); // Queue full Exception when used ArrayBlockintQueue
//		queue.offer("Patrick");
	}
	
	void show() {
		for(String s : queue) {
			System.out.println(s);
		}
	}
}
