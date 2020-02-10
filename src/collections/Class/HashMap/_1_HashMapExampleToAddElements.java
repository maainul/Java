package collections.Class.HashMap;

import java.util.HashMap;
import java.util.Map;

public class _1_HashMapExampleToAddElements {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(100, "Anik");
		hashMap.put(101, "Kamrul");
		hashMap.put(102, "mainul");
		
		System.out.println("After invoking put() method");
		for (Map.Entry<Integer, String> string : hashMap.entrySet()) {
			System.out.println(string.getKey()+" "+string.getValue());			
		}
		// putifAbsent
		hashMap.putIfAbsent(103, "Ganguly");
		System.out.println("\nAfter invoking putifAbsent() method");
		for (Map.Entry<Integer, String> m : hashMap.entrySet()) {
			System.out.println(m.getKey()+" "+ m.getValue());
		}
		// put all
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(104, "Rabin");
		map.put(105, "abin");
		map.putAll(hashMap);
		
		System.out.println("\nAfter invoking putall() method");
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
