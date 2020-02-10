package collections.Class.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class _5_MapExampleComparingByValueInDescendingOrder {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Jahid");
		map.put(2, "Ratan");
		map.put(3,"Jakon");
		//Returns a Set view of the mappings contained in this map  
		map.entrySet()
		//Returns a sequential Stream with this collection as its source  
	    .stream()
	    //Sorted according to the provided Comparator  
		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		//Performs an action for each element of this stream 
		.forEach(System.out::println);

	}

}
