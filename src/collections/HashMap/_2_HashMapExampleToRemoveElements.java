package collections.HashMap;

import java.util.HashMap;

public class _2_HashMapExampleToRemoveElements {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(100, "Anik");
		hashMap.put(101, "Kamrul");
		hashMap.put(102, "mainul");
		// initial list of elements
		System.out.println("initial list of elements"+hashMap);
		// key based removal
		hashMap.remove(100);
		System.out.println("After remove key based value"+hashMap);
		
		// key value based removal
		hashMap.remove(101, "Kamrul");
		System.out.println("After value based removal:"+hashMap);
	
	}

}
