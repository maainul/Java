package collections.SortedSetInterface;

import java.util.*;

public class MySortedSet {
	public static void main(String[] args) {
		SortedSet sortedSet = new TreeSet();
		sortedSet.add(100);
		sortedSet.add(85);
		sortedSet.add(5);
		sortedSet.add(20);

		System.out.println(sortedSet);

		TreeSet treeSet = new TreeSet();
		treeSet.add(50);
		treeSet.add(20);
		treeSet.add(10);
		treeSet.add(40);
		System.out.println(treeSet);

	}
}
