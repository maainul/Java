package collections.Class.HashMap;

import java.util.HashMap;
import java.util.Map;

public class _3_HashMapExampleToReplaceElements {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(100, "Abdullah");
		hashMap.put(101, "Muvin");
		hashMap.put(102, "mainul");
		// initial list of elements
		System.out.println("initial list of elements"+hashMap);
		for (Map.Entry<Integer, String> m : hashMap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		//replace by key-value
		hashMap.replace(101, "Fakhrul");
		System.out.println("After replace value is:"+hashMap);
		for (Map.Entry<Integer, String> m : hashMap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		//replace old and new value
		hashMap.replace(102, "mainul", "hasan");
		System.out.println("After replace old value:"+hashMap);
		for (Map.Entry<Integer, String> m : hashMap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
