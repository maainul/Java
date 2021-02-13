package collections.HashMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortingHashMapByKeysUsingComparator {

	public static void main(String[] args) {

		// implementing HashMap
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(6, "Tushar");
		hm.put(12, "Ashu");
		hm.put(5, "Zoya");
		hm.put(78, "Yash");
		hm.put(10, "Praveen");
		hm.put(67, "Boby");
		hm.put(1, "Ritesh");

		System.out.println("Before Sorting");

		Iterator<Map.Entry<Integer, String>> itr = hm.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<Integer, String> m = (Map.Entry<Integer, String>) itr.next();
			System.out.println(m.getKey() + " ------ " + m.getValue());
		}

		System.out.println("After Sorting");

		Map<Integer, String> map = sortValues(hm);
		
	}

	private static Map<Integer, String> sortValues(HashMap<Integer, String> hm) {
		List<Entry<Integer, String>> list = new LinkedList<>(hm.entrySet());

		Collections.sort(list, new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {

				return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
			}
		});

		// copying the sorted list in HashMap to preserve the iteration order
		HashMap sortedHashMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;

	}

}
