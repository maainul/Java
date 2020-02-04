package collections.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class _3_HashSetExampleRemoveElements {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("gafur");
		set.add("ikram");
		set.add("nur");
		set.add("gafur");
		set.remove("gafur");
		
		Iterator<String> itrIterator = set.iterator();
		while(itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
		// remove object
		set.remove("gafur");
		System.out.println(set);
		
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Kanon");
		set1.add("Mamon");
		set.addAll(set1);
		System.out.println(set);
		// remove all new elements // set1 elements
		set.removeAll(set1);
		System.out.println(set);
		// remove all the elements of set
		set.clear();
		System.out.println(set);

	}

}
