package collections.List;

import java.util.ArrayList;
import java.util.List;

public class _1_ListExample {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Amit");
		al.add("Vijay");
		al.add("Kumar");
		al.add(1, "Sachin");

		System.out.println("An element at 2nd positon:" + al.get(2));

		for (String string : al) {
			System.out.println(string);
		}
	}

}
