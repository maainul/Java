/*********************************************
# Java HashSet

# Java HashSet class hierarchy

	Java HashSet class is used to create a collection that uses a hash table for storage. 
	It inherits the AbstractSet class and implements Set interface.

# The important points about Java HashSet class are:

	1.HashSet stores the elements by using a mechanism called hashing.
	2.HashSet contains unique elements only.
	3.HashSet allows null value.
	4.HashSet class is non synchronized.
	5.HashSet doesn't maintain the insertion order. Here, 
	elements are inserted on the basis of their hashcode.
	6.HashSet is the best approach for search operations.
	7.The initial default capacity of HashSet is 16, and the load factor is 0.75.
	
# Difference between List and Set

A list can contain duplicate elements whereas Set contains unique elements only.

**********************************************************************************/
package collections.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class _3_HashSetExampleRemoveElements {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("gafur");
		set.add("ikram");
		set.add("nur");
		set.add("gafur");

		Iterator<String> itrIterator = set.iterator();
		while (itrIterator.hasNext()) {

			if (("nur").equals(itrIterator.hasNext())) {
				set.remove(itrIterator.hasNext());
			}
			// System.out.println(itrIterator.next());
		}

		System.out.println(set);

	}

}
