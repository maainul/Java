package comparatorAndComparator.annonymusInnerClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExerciseMainUsingJava7 {

	public static void main(String[] args) {
		List<People> people = new ArrayList<>();

		people.add(new People("Charles", "Dickens", 60));
		people.add(new People("Lewis", "Carlos", 42));
		people.add(new People("Thomas", "Carlyle", 53));
		people.add(new People("Charles", "Bronke", 45));
		people.add(new People("Mathe", "Arnold", 39));

		// SortList By Last Name
		System.out.println("Sort By Last Name");
		Collections.sort(people, new Comparator<People>() {

			@Override
			public int compare(People o1, People o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}

		});
		printAll(people);

		System.out.println("Sort By FirstName");
		Collections.sort(people, new Comparator<People>() {

			@Override
			public int compare(People o1, People o2) {
				return o1.getFirstName().compareTo(o2.getFirstName());

			}

		});
		printAll(people);

		System.out.println("Sort By Age");
		Collections.sort(people, new Comparator<People>() {

			@Override
			public int compare(People o1, People o2) {
				Integer i1 = o1.getAge();
				Integer i2 = o2.getAge();
				return i1.compareTo(i2);

			}
		});
		printAll(people);

		System.out.println("Print Last Name Begin with C");
		printLastNameBeginWithC(people);

		System.out.println("Print First Name Begin with C");
		printFirstNameBeginWithC(people);
	}

	private static void printFirstNameBeginWithC(List<People> people) {
		for (People p : people) {
			if (p.getFirstName().startsWith("C")) {
				System.out.println(p);
			}
		}

	}

	private static void printLastNameBeginWithC(List<People> people) {
		for (People p : people) {
			if (p.getLastName().startsWith("C")) {
				System.out.println(p);
			}

		}

	}

	private static void printAll(List<People> people) {
		for (People p : people) {
			System.out.println(p);
		}
	}

}
