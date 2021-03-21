package Java8NewFeaturesdurgasoft.functionalProgrammingBook._3_String;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

class MyyComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        Integer i1 = p1.getAge();
        Integer i2 = p2.getAge();
        return i1.compareTo(i2);
    }
}

public class Compare {
    public static void main(String[] args) {
        final List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Sara", 21),
                new Person("Jane", 21),
                new Person("Greg", 35));

        // Normal Comparator method
        Collections.sort(people, new MyyComparator());

        System.out.println(people);
        // using Lambda expression
        Collections.sort(people, (people1, people2) -> {
            Integer i1 = people1.getAge();
            Integer i2 = people2.getAge();
            return i1.compareTo(i2);
        });
        System.out.println(people);

        // Using Stream
        // Since we have a List , the obvious choice is the sort() method on the List .
        // There are downsides to using this method, however. That’s a void method, which
        //means the list will be mutated when we call it. To preserve the original list,
        //we’d have to make a copy and then invoke the sort() method on the copy; that’s
        //quite labor intensive. Instead we’ll seek the help of the Stream .
        //We can get a Stream from the List and conveniently call the sorted() method on it.
        // Rather than messing with the given collection,
        // it will return a sorted collec-
        //tion.
        List<Person> ascendingAge = people.stream()
                .sorted((person1, person2) -> person1.ageDifference(person2))
                .collect(toList());
        // Ascending Order
        printPeople("Sorted in ascending order by age: ", ascendingAge);

        // Descending Order
        printPeople("Sorted in descending order by age: ",
                people.stream()
                        .sorted((person1, person2) -> person2.ageDifference(person1))
                        .collect(toList()));

        // Reusing a Comparator
        // Make sure not repeat logic
        Comparator<Person> compareAscending = (person1, person2) -> person1.ageDifference(person2);

        Comparator<Person> compareDescending = compareAscending.reversed();

        printPeople("Sorted in ascending order by age: ",
        people.stream()
                .sorted(compareAscending)
                .collect(toList())
        );

        printPeople("Sorted in descending order by age: ",
                people.stream()
                        .sorted(compareDescending)
                        .collect(toList())
        );

        printPeople("Sorted in ascending order by name: ",
                people.stream()
                        .sorted((person1, person2) ->
                                person1.getName().compareTo(person2.getName()))
                        .collect(toList()));
        // Find min and max value
        people.stream()
                .min(Person::ageDifference)
                .ifPresent(youngest -> System.out.println("Youngest: " + youngest));

        people.stream()
                .max(Person::ageDifference)
                .ifPresent(eldest -> System.out.println("Eldest: " + eldest));

        // Multiple and Fluent Comparisons

        people.stream()
                .sorted((person1, person2) ->
                        person1.getName().compareTo(person2.getName()));

        final Function<Person, String> byName = person -> person.getName();
        people.stream()
                .sorted(comparing(byName));

        final Function<Person, Integer> byAge = person -> person.getAge();
        final Function<Person, String> byTheirName = person -> person.getName();
        printPeople("Sorted in ascending order by age and name: ",
                people.stream()
                        .sorted(comparing(byAge).thenComparing(byTheirName))
                        .collect(toList()));

        // Using the collect Method and the Collectors Class
        List<Person> olderThan20 = new ArrayList<>();
        people.stream()
                .filter(person -> person.getAge() > 20)
                .forEach(person -> olderThan20.add(person));
        System.out.println("People older than 20: " + olderThan20);

    }

    public static void printPeople( final String message, final List<Person> people) {
        System.out.println(message);
        people.forEach(System.out::println);
    }
}
