package collections.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

// https://www.javatpoint.com/how-to-sort-hashmap-in-java
public class SortingHashMapByKeysUsingKeyMap {

	public static void main(String[] args) {

		// implementation of HashMap
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// addding keys and values to HashMap
		hm.put(23, "Yash");
		hm.put(17, "Arun");
		hm.put(15, "Swarit");
		hm.put(9, "Neelesh");

		System.out.println("Before Sorting");
		Iterator<Map.Entry<Integer, String>> itr = hm.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> m = (Map.Entry<Integer, String>) itr.next();
			System.out.println(m.getKey() + " ------ " + m.getValue());
		}

		System.out.println("After Sorting");
		TreeMap<Integer, String> treeMap = new TreeMap<>(hm);

		Iterator<Map.Entry<Integer, String>> itr2 = treeMap.entrySet().iterator();

		while (itr2.hasNext()) {
			Map.Entry<Integer, String> m = (Map.Entry<Integer, String>) itr2.next();
			System.out.println(m.getKey() + " ------ " + m.getValue());
		}

	}

}
