package dataStructureAndAlgorithm._1_array.MultiMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiMapInteger {

	public static void main(String[] args) {
		Map<Integer, List<Integer>> hashMap = new HashMap<Integer, List<Integer>>();
		List<Integer> oneInteger = new ArrayList<Integer>();
		oneInteger.add(11);
		oneInteger.add(12);
		
		List<Integer> twoInteger = new ArrayList<Integer>();
		twoInteger.add(21);
		twoInteger.add(22);
		
		List<Integer> threeInteger = new ArrayList<Integer>();
		threeInteger.add(31);
		threeInteger.add(32);
		
		hashMap.put(1, oneInteger);
		hashMap.put(2, twoInteger);
		hashMap.put(3, threeInteger);
		
		System.out.println("HashMap :"+ hashMap);
		
		for(Map.Entry<Integer, List<Integer>> entry : hashMap.entrySet()) {
			Integer keyInteger = entry.getKey();
			List<Integer> valueInteger = entry.getValue();
			
			System.out.println(keyInteger);
			System.out.println(valueInteger);
		}

	}

}
