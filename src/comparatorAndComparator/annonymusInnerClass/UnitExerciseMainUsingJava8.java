package comparatorAndComparator.annonymusInnerClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class UnitExerciseMainUsingJava8 {

	public static void main(String[] args) {
		List<People> people = new ArrayList<>();

		people.add(new People("Charles", "Dickens", 60));
		people.add(new People("Lewis", "Carlos", 42));
		people.add(new People("Thomas", "Carlyle", 53));
		people.add(new People("Charles", "Bronke", 45));
		people.add(new People("Mathe", "Arnold", 39));

		// SortList By Last Name
		System.out.println("Sort By Last Name With Functional Interface compare to");
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		printAll(people);

		System.out.println("Sort By FirstName");
		Collections.sort(people, (People o1, People o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
		printAll(people);

		System.out.println("Print Conditionally Start LastName With C");
		printConditionally(people, p -> p.getLastName().startsWith("C"));

		System.out.println("Print Start first Name with c");
		printConditionally(people, p -> p.getFirstName().startsWith("C"));

	}

	private static void printConditionally(List<People> people, Predicate<People> predicate) {
		for (People p : people) {
			if (predicate.test(p)) {
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
