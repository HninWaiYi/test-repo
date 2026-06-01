package com.jdc.hwy;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class H_ArraysTest {

	private String[] array = {"Orchid", "Moron", "Vodu", "Gemmy", "Woddy"};
	
	@Test
	@Disabled
	void sort() {
		show("Before Sort");
//		Arrays.sort(array);  // ASC
//		Arrays.sort(array, Comparator.reverseOrder());  //Desc
//		Arrays.sort(array, 0, 2);
		
		show("After Sort Ascending ");
	}
	
	@Test
	@Disabled
//	Before using binarySearch, the array must be sorted.
	void BinarySearch() {
		Arrays.sort(array);
		var res = Arrays.binarySearch(array, "Moron");
		System.out.println("index ::: "+res);
		
		var res1 = Arrays.binarySearch(array, 0, 2, "Woddy");
		System.out.println("index ::: "+res1);
		
		
	}
	
	@Test
	void otherUsage() {
		Arrays.fill(array, 0, 2, "test"); //index 0,1 is test
		show("Using Fill");
		
		String[] arr = {"test", "test", "Vodu", "Gemmy" ,"Woddy"};
		var check = Arrays.equals(array, arr);
		System.out.println("Is True :: "+check);
		
		array = Arrays.copyOf(array, array.length+1);
		array[array.length-1] = "last";
		show("Unlimited Array");
	}
	
	private void show(String message) {
		System.out.println("********** "+message+" **********\n");
		for(String str : array) {
			System.out.println(str);
		}
	}
}
