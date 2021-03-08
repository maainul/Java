# Comparable and Comparator

Comparable and comparator are interface Comarable have 1 method compareTo(a) and Comparator has 2 methods equals() and compare(a,b)

# Comparator using TreeSet and Not Using Collections Utility method:

If We want default natural sorting order then we have to implement Comparable interface
```java
package comparatorAndComparator;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable {
	public int eid;
	public String name;

	public Employee() {
	}

	public Employee(int eid, String name) {
		this.eid = eid;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee{" + "eid=" + eid + ", name='" + name + '\'' + '}';
	}

	@Override
	public int compareTo(Object o) {
		int eid1 = this.eid;
		Employee e = (Employee) o;
		int eid2 = e.eid;
		if (eid1 < eid2) {
			return -1;
		} else if (eid1 > eid2) {
			return +1;
		} else {
			return 0;
		}
	}

}

class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Anik");
		Employee e2 = new Employee(01, "Ynik");
		Employee e3 = new Employee(11, "Snik");
		Employee e4 = new Employee(10, "Zaik");
		Employee e5 = new Employee(110, "Qnik");

		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		// descending order
		TreeSet t2 = new TreeSet(new MyComparator());
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		t2.add(e5);
		System.out.println(t2);

	}
}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;

		String s1 = e1.name;
		String s2 = e2.name;

		Integer I1 = e1.eid;
		Integer I2 = e2.eid;

		return I2.compareTo(I1);
	}
}
```

```java
package comparatorAndComparator;

public class People implements Comparable<People> {

	String name;
	int id;
	String address;

	public People(String name, int id, String address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int compareTo(People o) {
		Integer i = this.id;
		return i.compareTo(o.id);
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", id=" + id + ", address=" + address + "]";
	}

}
```
```java
package comparatorAndComparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PeopleMainClass {

	public static void main(String[] args) {
		ArrayList<People> arrayList = new ArrayList<>();
		arrayList.add(new People("Mainul", 11, "Tangail"));
		arrayList.add(new People("Khairul", 21, "Gangail"));
		arrayList.add(new People("Kamrull", 41, "Jamalpur"));
		arrayList.add(new People("Fakhrul", 4, "Manikjong"));

		System.out.println(arrayList); // printing normal arraylist

		Collections.sort(arrayList); // sorted order

		System.out.println(arrayList); // sorted order printing
		
		
		Collections.sort(arrayList, new AddressWiseSort()); // address wise sort
		System.out.println(arrayList);
		
		
		Collections.sort(arrayList, new NameWiseSort()); // name wise sorting
		System.out.println(arrayList);
		
		
		Iterator<People> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		for(People people : arrayList) {
			System.out.println(people);
		}
	}

}
```
NameWiseSort.java
```java
package comparatorAndComparator;
import java.util.Comparator;

public class NameWiseSort implements Comparator<People> {

	@Override
	public int compare(People o1, People o2) {

		return o1.name.compareTo(o2.name);
	}

}
```
People.java
```java
package comparatorAndComparator.annonymusInnerClass;

public class People {
	private String firstName;
	private String lastName;
	private int age;

	public People(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "People [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

}
```
```java
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
```
```java
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
```
