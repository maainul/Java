package collections.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class _1_HashSetExampleToAddElements {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		  set.add("One");    
          set.add("Two");    
          set.add("Three");   
          set.add("Four");  
          set.add("Five");  
		  System.out.println("Notice, the elements iterate in an unordered collection.\n");
		  //traversing elements
		  Iterator<String> itrIterator = set.iterator();
		  while(itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
	}
}
