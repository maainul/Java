package oca;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		/*
		 * ArrayList list = new ArrayList(); list.add("hawk"); list.add(Boolean.TRUE);
		 * System.out.println(list);
		 */
		ArrayList<String> safer = new ArrayList<>();
		safer.add("Sparrow");
		// safer.add(Boolean.TRUE); // Does not compile
		System.out.println(safer);
		// add
		List<String> birds = new ArrayList<>();
		birds.add("Hawk"); // ["Hawk"]
		birds.add(1, "Robin"); // [Hawk,Robin]
		birds.add(0, "Blue jay"); // [Hawk,Robin,Blue jay]
		birds.add(1, "Cardinal"); // [Hawk,Robin,Blue jay,Cardinal]
		System.out.println(birds);
		// remove
		List<String> birds2 = new ArrayList<>();
		birds2.add("Hawk");
		birds2.add("Hawk");
		System.out.println(birds2.remove("Cardinal")); // false
		System.out.println(birds2.remove("Hawk"));// true

		// set
		List<String> birds3 = new ArrayList<>();
		birds3.add("Hawk");
		System.out.println(birds3.size()); // 1
		birds3.set(0, "crow");
		System.out.println(birds3.size()); // 1
		// birds3.set(1,"sparrow");
		// System.out.println(birds3.size()); //Exception

	}

}
