package collections.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class _2_HashSetExampleIgnoringDuplicateElements {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("gafur");
		set.add("ikram");
		set.add("nur");
		set.add("gafur");
		
		Iterator<String> itrIterator = set.iterator();
		while(itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}

	}

}
