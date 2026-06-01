package com.jdc.hwy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class L_CollectionsTest {

	private List<String> unmodifiedList = List.of("Orchid", "Moron", "Vodu", "Gemmy", "Woddy");
	private List<String> list = new ArrayList<String>(unmodifiedList);
	
	@Test
	void unmodified() {
		var unmodList = Collections.unmodifiableList(list);
		System.out.println(unmodList);
	}
	
	@Test
	@Disabled
	void sortTest() {
		Collections.sort(list);
		show("Sort List");
	}
	
	@Test
	@Disabled
	void binarySearch() {
		Collections.sort(list);
		var res = Collections.binarySearch(list, "Vodu");
		System.out.println("Index ::: "+res);
	}
	
	@Test
	@Disabled
	void shuffle() {
		Collections.shuffle(list);
		show("Shuffle list");
	}
	
	private void show(String message) {
		System.out.println("********** "+message+" **********\n");
		for(String str : list) {
			System.out.println(str);
		}
	}
}
