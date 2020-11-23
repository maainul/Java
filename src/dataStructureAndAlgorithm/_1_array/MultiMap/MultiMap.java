package dataStructureAndAlgorithm._1_array.MultiMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiMap {

	public static void main(String[] args) {
		Map<String, List<String>> hashMap = new HashMap<String, List<String>>();
		List<String> oneList = new ArrayList<String>();
		oneList.add("Apple");
		oneList.add("Aeroplane");

		List<String> twoList = new ArrayList<String>();
		twoList.add("Bus");
		twoList.add("Bat");
		twoList.add("Banana");

		List<String> threeList = new ArrayList<String>();

		threeList.add("Cat");
		threeList.add("Cartoon");

		hashMap.put("A", oneList);
		hashMap.put("B", twoList);
		hashMap.put("C", threeList);
		System.out.println("HashMap :" + hashMap);

		for (Map.Entry<String, List<String>> entry : hashMap.entrySet()) {
			String keyString = entry.getKey();
			List<String> valueStrings = entry.getValue();

			System.out.println("Key :" + keyString);
			System.out.println("Value :" + valueStrings);

		}
	}

}
