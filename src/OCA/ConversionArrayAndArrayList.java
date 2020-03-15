package OCA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConversionArrayAndArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("hawk");
		list.add("Robin");
		Object[] objectArray = list.toArray();
		System.out.println(objectArray.length);
		String[] stringArray = list.toArray(new String[0]);
		System.out.println(stringArray.length);
		// Convert Array to List
		String[] array = { "hawk", "Robin" };

		// array convert into list
		List<String> lists = Arrays.asList(array);

		// print list
		System.out.println(lists);

		// print size
		System.out.println(lists.size());

		// set test
		list.set(1, "test"); // [hawk,test]
		list.add("ne");
		list.add("me");

		// print list
		System.out.println(lists);
		// Set array 0 to new
		array[0] = "new"; // [new,test]
		// loop through array
		for (String b : array) {
			System.out.print(b + " ");
		}

		// A cool tricks
		List<String> list1 = Arrays.asList("one", "two");
		System.out.println(list1);

		List<Integer> intval = new ArrayList<>();
		intval.add(11);
		intval.add(16);
		intval.add(1);
		intval.add(4);

		Collections.sort(intval);

		System.out.println(intval);

		// A cool tricks
		List<Integer> liste = Arrays.asList(65, 4, 21, 56);
		System.out.println(liste);
		Collections.sort(liste);
		System.out.println(liste);

	}

}
