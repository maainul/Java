package collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class _3_ArrayListExampleOfRetainAllMethod {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("mainul");
		al.add("hasan");
		al.add("anik");

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("sabnam");
		al2.add("rupa");
		al2.add("chandrabati");

		al.addAll(al2);
		System.out.println(al);
		al.retainAll(al2);
		Iterator<String> itrIterator = al.iterator();
		while (itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}

	}

}
