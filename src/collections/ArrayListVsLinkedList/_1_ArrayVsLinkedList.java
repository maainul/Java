package collections.ArrayListVsLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _1_ArrayVsLinkedList {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Abdullah");
		al.add("mainul");
		al.add("kamrul");
		al.add("fakhrul");

		List<String> ll = new LinkedList<String>();
		ll.add("samsu"); // adding object in linkedlist
		ll.add("gaffar");
		ll.add("Sattar");

		System.out.println(al);
		System.out.println(ll);

	}

}
