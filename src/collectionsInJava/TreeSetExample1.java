//Let's see a simple example of Java TreeSet. 
package collectionsInJava;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		// creating and adding elements
		TreeSet<String> al = new TreeSet<String>();
		al.add("Anik");
		al.add("manik");
		al.add("sonit");
		// traversing elements
		Iterator<String> itrIterator = al.iterator();
		while(itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
	}

}
