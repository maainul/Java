package collections.Set.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class _4_HashSetFromAnotherCollection {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Rabbi");
		list.add("sattar");
		list.add("gaffar");
		list.add("muhaumin");
		
		HashSet<String> set = new HashSet<String>(list);
		set.add("Rajjak");
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
