package collections.Map;

import java.util.HashMap;
import java.util.Map;

public class _6_MapExamplePutDuplicateValueInMap {
	public static void main(String args[]) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Anik");
		map.put(101,"Manik");
		map.put(102,"Rajib");
		// A Map doesn't allow duplicate keys, 
		// but you can have duplicate values
		map.put(101, "Ekram"); // duplicate value will not be added
		
		// elements can traverse in any order
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
