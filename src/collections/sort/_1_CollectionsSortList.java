package collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1_CollectionsSortList {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
			fruits.add("Apple");
			fruits.add("Orange");
			fruits.add("Banana");
			fruits.add("Grape");
		
		// unsorted list
		System.out.println(fruits);
		
		// sorting using collections
		Collections.sort(fruits);
		System.out.println(fruits);
	}

}
