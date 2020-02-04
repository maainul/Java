package collections.Map;

import java.util.HashMap;
import java.util.Map;

public class _1_MapExamplePutValueInMap {
	public static void main(String args[]) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Anik");
		map.put(101,"Manik");
		map.put(102,"Rajib");
		
		// elements can traverse in any order
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
