package com.jdc.hwy;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class G_TreeOrderTest {

	@Test
	void useTreeSetTest() {
		Set<Data> set = new TreeSet<>();
		set.add(new Data(2, "Andrew"));
		set.add(new Data(3, "Antoneo"));
		set.add(new Data(1, "EarnShaw"));
		set.add(new Data(4, "Bobber"));
		
		show(set);
	}
	
	void show(Set<Data> set) {
		for(Data d : set) {
			System.out.println(d);
		}
	}
	
	class Data implements Comparable<Data>{
		private int key;
		private String value;
		
		public Data(int key, String value) {
			super();
			this.key = key;
			this.value = value;
		}
		
		@Override
		public String toString() {
			return "Key :: %d Value :: %s".formatted(key, value);
		}

		@Override
		public int compareTo(Data d) {
//			return this.key < d.key ? 1 : -1;
			return this.value.compareTo(d.value);
		}
		
	}
}

