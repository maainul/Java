# Chapter 2 Collections

# 1. Iterating Through List

```java
package Java8NewFeaturesdurgasoft.functionalProgrammingBook._2_UsingCollections._1_IteratingThroughList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

// Using Collections
public class ListCLass {
    public static void rotateDigit(String[] args) {
        final List<String> friends = Arrays.asList(
                "Fakhrul",
                "Kamrul",
                "Abdullah"
        );

        // Throught iterator
        System.out.println("******Iterator ****");
        Iterator iterator = friends.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Style for loop
        System.out.println("****For Loop Approach");
        for (int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));
        }

        // second approach FOr each Loop
        System.out.println("****For Each Approach******");
        for (String name : friends) {
            System.out.println(name);
        }


        // iterable inner class
        System.out.println("********Iterable Anonymous Inner class********");
        friends.forEach(new Consumer<String>() {
            @Override
            public void accept(final String s) {
                System.out.println(s);
            }
        });

        // replacing Anonymous inner class with lambda expression
        System.out.println("*****replacing Anonymous inner class with lambda expression*******");
        friends.forEach((final String name) -> System.out.println(name));

        // without Type Information
        System.out.println("*****without Type Information******");
        friends.forEach((name) -> System.out.println(name));

        // If single parameter we can remove ()
        System.out.println("***** If single parameter we can remove ()****");
        friends.forEach(name -> System.out.println(name));


        // replacing Anonymous inner class with lambda expression
        System.out.println("*****replacing lambda expression with method reference *******");
        friends.forEach(System.out::println);


    }
}
```
# 2. Transforming List (upperLower/LowerUpper)

```java
package Java8NewFeaturesdurgasoft.functionalProgrammingBook._2_UsingCollections._2_transformainAList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperCaseLowerCase {
    public static void rotateDigit(String[] args) {
        final List<String> friends = Arrays.asList(
                "Fakhrul",
                "Kamrul",
                "Abdullah"
        );

        friends.forEach(System.out::println);

        // we create empty list and populat Uppercase data
        final List<String> upperCaseNames = new ArrayList<>();

        // For each approach to add uppercase in the UpperCaseNames variable
        System.out.println("****** forEach method*******");
        for (String name : friends) {
            upperCaseNames.add(name.toUpperCase());
        }

        // print with method reference
        upperCaseNames.forEach(System.out::println);

        // internal iterator forEach method
        System.out.println("****** internal iterator forEach method*******");

        List<String> upperCaseNamesIterator = new ArrayList<>();
        friends.forEach(name -> upperCaseNamesIterator.add(name.toUpperCase()));

        // print with method reference
        upperCaseNamesIterator.forEach(System.out::println);

        // using lambda expression
        System.out.println("**** Using Lambda expression and stream and map ");

        friends.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        // lambda and method reference
        friends.stream()
                .map(name -> name.toUpperCase())
                .forEach(System.out::println);

        System.out.println("******* Using Method reference *****");
        friends.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println));
        System.out.println();

        System.out.println("**** Find Length of each name *****");
        friends.stream()
                .map(name -> name.length())
                .forEach(count -> System.out.print(count + " "));

        System.out.println("**** Find Length of each name Using method reference*****");
        friends.stream()
                .map(String::length)
                .forEach(System.out::println);
    }
}
```
# 3. Finding Elements (StartsWith/EndsWith)

```java
package Java8NewFeaturesdurgasoft.functionalProgrammingBook._2_UsingCollections._3_FindingElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartSWithExample {
    public static void rotateDigit(String[] args) {
        final List<String> friends = Arrays.asList(
                "Fakhrul",
                "Kamrul",
                "Abdullah",
                "Akash",
                "Batas"
        );

        System.out.println("Start with  Normal For Each method");
        final List<String> stringList = new ArrayList<>();
        for (String name : friends) {
            if (name.startsWith("A")) {
                stringList.add(name);
            }
        }
        stringList.forEach(s -> System.out.println(s));
        // stringList.forEach(System.out::println);

        System.out.println("*************WIth lambda Expression*******");
        final List<String> startsWithN =
                friends.stream()
                        .filter(name -> name.startsWith("A"))
                        .collect(Collectors.toList());

        // Let's print number of element in the result collection
        System.out.println("******Let’s print the number of elements in the result collection****");
        System.out.printf("Found %d names%n", startsWithN.size());

        startsWithN.forEach(System.out::println);
    }
}
```
# 4. Reusing Lambda

```java
package Java8NewFeaturesdurgasoft.functionalProgrammingBook._2_UsingCollections._4_ReusingLambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class _ReusingLambda {
    public static void rotateDigit(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        final List<String> editors =
                Arrays.asList("Brian", "Jackie", "John", "Mike");

        final List<String> comrades =
                Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");

/*
	We want to filter out names that start with a certain letter.
	Let’s first take a naive approach to this using the filter() method.
*/
        final long countFriendsStartsWithN =
                friends.stream()
                        .filter(name -> name.startsWith("N")).count();
        System.out.println(countFriendsStartsWithN);

        final long countEditorsStartsN =
                friends.stream()
                        .filter(name -> name.startsWith("A")).count();
        System.out.println(countEditorsStartsN);
        final long countComradesStartsN =
                friends.stream()
                        .filter(name -> name.startsWith("N")).count();
        System.out.println(countComradesStartsN);
        /*
        Duplicate code and variables we can assign one variable and remove duplicate code
         */
        final Predicate<String> startsWithN = name -> name.startsWith("N");

        final long countFriendsStartN =
                friends.stream()
                        .filter(startsWithN).count();
        System.out.println(countFriendsStartN);
        final long countEditorsStartN =
                friends.stream()
                        .filter(startsWithN).count();
        System.out.println(countEditorsStartN);
        final long countComradesStartN =
                friends.stream()
                        .filter(startsWithN).count();
        System.out.println(countComradesStartsN);

        // We can minimize this by using
        // Using Lexical Scoping and Closures

        // ***********Part 2******************

        // Duplication in Lambda Expressions

        // Problem : Let’s pick the names that start with N or B from the friends collection of names.

        final Predicate<String> startWithN = name -> name.startsWith("N");
        final Predicate<String> startWithB = name -> name.startsWith("B");

        final long friendStartsWithN =
                friends.stream()
                        .filter(startWithN).count();
        System.out.println(friendStartsWithN);
        final long friendStartsWithB =
                friends.stream()
                        .filter(startWithB).count();
        System.out.println(friendStartsWithB);
/*
The first predicate tests if the name starts with an N and the second tests for a B.
Seems reasonable, but the two predicates are mere duplicates,
with only the letter they use being different.
Let’s figure out a way to eliminate this duplication.
 */

        // Removing Duplication with Lexical Scoping

        // this will call the method checkIfStartsWith
        final long countFriendsStartsN =
                friends.stream()
                        .filter(checkIfStartsWith("N")).count();
        System.out.println(countFriendsStartsN);
        final long countFriendsStartB =
                friends.stream()
                        .filter(checkIfStartsWith("B")).count();
        System.out.println(countFriendsStartB);

        // Refactoring to Narrow the Scope


    }

    // method lexical Scoping
    public static Predicate<? super String> checkIfStartsWith(String letter) {
        return name -> name.startsWith(letter);
    }
}
```
# 5.Refactoring Narrow The Scope

```java
package Java8NewFeaturesdurgasoft.functionalProgrammingBook._2_UsingCollections._5_RefactoringNarrowTheScope;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

// Refactoring to Narrow the Scope
public class RefactoringNarrowTheScope {
    public static void rotateDigit(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        final List<String> editors =
                Arrays.asList("Brian", "Jackie", "John", "Mike");

        final List<String> comrades =
                Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");

        final Function<String, Predicate<String>> startsWithLetter =
                (String letter) -> {
                    Predicate<String> checkStarts = (String name) -> name.startsWith(letter);
                    return checkStarts;
                };

        final long countFriendsStartN =
                friends.stream()
                        .filter(startsWithLetter.apply("N")).count();
        System.out.println(countFriendsStartN);
        final long countFriendsStartB =
                friends.stream()
                        .filter(startsWithLetter.apply("B")).count();
        System.out.println(countFriendsStartB);


        // Second approach
        final Function<String, Predicate<String>> startsWithLetterr =
                (String letter) -> (String name) -> name.startsWith(letter);

        final long countFriendsStarttN =
                friends.stream()
                        .filter(startsWithLetter.apply("N")).count();
        System.out.println(countFriendsStarttN);
        final long countFriendssStartB =
                friends.stream()
                        .filter(startsWithLetter.apply("B")).count();
        System.out.println(countFriendssStartB);


        // More shorter
        final Function<String, Predicate<String>> startWithLetter =
                letter -> name -> name.startsWith(letter);

        final long countFriendStartN =
                friends.stream()
                        .filter(startsWithLetter.apply("N")).count();
        System.out.println(countFriendStartN);
        final long countFriendStartB =
                friends.stream()
                        .filter(startsWithLetter.apply("B")).count();
        System.out.println(countFriendStartB);
    }
}

```
# 6. Picking An Element

```java
package Java8NewFeaturesdurgasoft.functionalProgrammingBook._2_UsingCollections._6_PickingAnElement;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PickingAnElement {
    public static void rotateDigit(String[] args) {
        final List<String> names = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        pickName(names, "S");
        pickName2(names, "N");
    }

    private static void pickName(
            final List<String> names, final String startingLetter) {
        String foundName = null;
        for (String name : names) {
            if (name.startsWith(startingLetter)) {
                foundName = name;
                break;
            }
        }
        System.out.println(String.format("A name starting with %s: ", startingLetter));

        if (foundName != null) {
            System.out.println(foundName);
        } else {
            System.out.println("No name found.");
        }
    }

    // update version
    public static void pickName2(final List<String> names, final String startingLetter) {
        final Optional<String> foundName =
                names.stream()
                        .filter(name -> name.startsWith(startingLetter))
                        .findFirst();

        System.out.println(String.format("A name starting with %s : %s", startingLetter, foundName.orElse("No Name Found")));
    }
}

```
# 7. Reducing Collectin to a Single Value

```java
package Java8NewFeaturesdurgasoft.functionalProgrammingBook._2_UsingCollections._7_ReducingaCollectiontoaSingleValue;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReducingCollection {
    public static void rotateDigit(String[] args) {
        final List<String> names = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        System.out.println("Total numnber of character in all names");
        names.stream()
                .mapToInt(name -> name.length())
                .sum();


        final Optional<String> aLongName = names.stream()
                .reduce((name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
        aLongName.ifPresent(name -> System.out.println(String.format("A Longes name  %s ", name)));


        final String steveOrLonger = names.stream()
                .reduce("Steve", (name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
    }
}
```
# 8. Joining Element

```java
package Java8NewFeaturesdurgasoft.functionalProgrammingBook._8_JoiningElements;

import java.util.Arrays;
import java.util.List;

public class JoiningElements {
    public static void rotateDigit(String[] args) {
        final List<String> names = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        for (String name : names
        ) {
            System.out.print(name + ",");
        }
        System.out.println();
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + ",");
        }

        if (names.size() > 0)
            System.out.println(names.get(names.size() - 1));

        System.out.println(String.join(", ", names));
    }
}
```
# 3.Strings, Comparators, and Filters
## Iterating a String
1. The chars() method is a new one in the string class from the CharSequence interface
2. Fluently iterating over the string
3. The chars() method returns a stream over which we can iterate using forEach()
```java
final String str = "w001";
str.chars()
    .forEach(ch -> System.out.println(ch));
```
### Using Method Reference
```java
final String str = "w001";
str.chars()
    .forEach(System.out::println));
```
Result :<br/>
    119<br/>
    48<br/>
    48<br/>
    116<br/>
4. The Chars() returns a stream of integers
```java
 // map stream to the object and convert into character
        str.chars()
                .mapToObj(ch -> (char) ch)
                .forEach(System.out::println);
```
Result :<br/>
w<br/>
0<br/>
0<br/>
t<br/>

# Implementing the Comparator Interface
```java
public class Person {
    private final String name;
    private final int age;

    public Person(final String theName, final int theAge) {
        name = theName;
        age = theAge;
    }

    public String getName() { return name; }

    public int getAge() { return age; }

    public int ageDifference(final Person other) {
        return age - other.age;
}
    public String toString() {
        return String.format("%s - %d", name, age);
    }
}
```
Compare.java
```java
final List<Person> people = Arrays.asList(
    new Person("John", 20),
    new Person("Sara", 21),
    new Person("Jane", 21),
    new Person("Greg", 35));
```
We could sort the people by their names or ages and in ascending or
descending order.
```java
List<Person> ascendingAge =
                    people.stream()
                    .sorted((person1, person2) -> person1.ageDifference(person2))
                    .collect(toList());
    
printPeople("Sorted in ascending order by age: ", ascendingAge);
```
Once we sort the instances we want to print the values, so we invoke a con-
venience method printPeople()
```java
public static void printPeople(
    final String message, final List<Person> people) {
    System.out.println(message);
    people.forEach(System.out::println);
}
```
Sorted in ascending order by age:<br/>

John - 20<br/>
Sara - 21<br/>
Jane - 21<br/>
Greg -35<br/>

sorting them in descending order is just as easy.
```java
printPeople("Sorted in descending order by age: ",
    people.stream()
    .sorted((person1, person2) -> person2.ageDifference(person1))
    .collect(toList()));
```
Sorted in descending order by age:<br/>
Greg -35<br/>
Jane - 21<br/>
Sara - 21<br/>
John - 20<br/>

```java
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
```
```java
printPeople("Sorted in ascending order by name: ",
            people.stream()
            .sorted((person1, person2) ->
                person1.getName().compareTo(person2.getName()))
            .collect(toList()));
```
```java
people.stream()
        .min(Person::ageDifference)
        .ifPresent(youngest -> System.out.println("Youngest: " + youngest));
```
```java
people.stream()
        .max(Person::ageDifference)
        .ifPresent(eldest -> System.out.println("Eldest: " + eldest));
```
## Multiple and Fluent Comparisons
To sort people by their name we used this:
```java

people.stream()
    .sorted((person1, person2) ->
    person1.getName().compareTo(person2.getName()));
```
But we can do better
```java
final Function<Person, String> byName = person -> person.getName();

people.stream().sorted(comparing(byName));
```
Here is some cogent syntax to sort people in ascending order by both age and
name:
```java
final Function<Person, Integer> byAge = person -> person.getAge();
final Function<Person, String> byTheirName = person -> person.getName();

printPeople("Sorted in ascending order by age and name: ",
    people.stream()
            .sorted(comparing(byAge).thenComparing(byTheirName))
            .collect(toList()));
```
We first created two lambda expressions, one to return the age of a given
person and the other to return that person’s name.

Sorted in ascending order by age and name:<br/>
John - 20<br/>
Jane - 21<br/>
Sara - 21<br/>
Greg - 35<br/>

## Using the collect Method and the Collectors Class
```java
List<Person> olderThan20 = new ArrayList<>();
        people.stream()
                .filter(person -> person.getAge() > 20)
                .forEach(person -> olderThan20.add(person));
        System.out.println("People older than 20: " + olderThan20);
```
People older than 20: [Sara - 21, Jane - 21, Greg - 35]
# Compare.java
```java
package Java8NewFeaturesdurgasoft.functionalProgrammingBook._3_String;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

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
        // means the list will be mutated when we call it. To preserve the original list,
        // we’d have to make a copy and then invoke the sort() method on the copy; that’s
        // quite labor intensive. Instead we’ll seek the help of the Stream .
        // We can get a Stream from the List and conveniently call the sorted() method on it.
        // Rather than messing with the given collection,
        // it will return a sorted collection.

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

class MyyComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        Integer i1 = p1.getAge();
        Integer i2 = p2.getAge();
        return i1.compareTo(i2);
    }
}

```


### The collect() method takes a stream of elements and collects or gathers them into a result container.

• How to make a result container (for example, using the ArrayList::new method)

• How to add a single element to a result container (for example, using the ArrayList::add method)

• How to merge one result
```java
List<Person> olderThan20 =
    people.stream()
            .filter(person -> person.getAge() > 20)
            .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
            System.out.println("People older than 20: " + olderThan20);
```
Let’s modify the previous version to use this version of collect .
```java
List<Person> olderThan20 =
    people.stream()
        .filter(person -> person.getAge() > 20)
        .collect(Collectors.toList());
    System.out.println("People older than 20: " + olderThan20);
```
## Let’s use groupingBy() to group people by their age.
```java
Map<Integer, List<Person>> peopleByAge =
                            people.stream()
                            .collect(Collectors.groupingBy(Person::getAge));

        System.out.println("Grouped by age: " + peopleByAge);
```
Grouped by age: {35=[Greg - 35], 20=[John - 20], 21=[Sara - 21, Jane - 21]}
### instead of creating a map of all Person objects by age, let’s get only people’s names, ordered by age.
```java
Map<Integer, List<String>> nameOfPeopleByAge =
            people.stream()
            .collect(
                groupingBy(Person::getAge, mapping(Person::getName, toList())));
System.out.println("People grouped by age: " + nameOfPeopleByAge);
```
People grouped by age: {35=[Greg], 20=[John], 21=[Sara, Jane]}

Let’s look at one more combination: let’s group the names by their first
character and then get the oldest person in each group.

```java
Comparator<Person> byAge = Comparator.comparing(Person::getAge);

Map<Character, Optional<Person>> oldestPersonOfEachLetter =
        people.stream()
                .collect(groupingBy(person -> person.getName().charAt(0),
            reducing(BinaryOperator.maxBy(byAge))));
        System.out.println("Oldest person of each letter:");
        System.out.println(oldestPersonOfEachLetter);
```
Oldest person of each letter:
{S=Optional[Sara - 21], G=Optional[Greg - 35], J=Optional[Jane - 21]}
## Listing All Files in a Directory
```java
Files.list(Paths.get("."))
        .forEach(System.out::println);
```
## Print all Directory only
```java
Files.list(Paths.get("."))
    .filter(Files::isDirectory)
    .forEach(System.out::println);
```
## Listing Select Files in a Directory
```java
final String[] files =
        new File("fpij").list(new java.io.FilenameFilter() {
    
            public boolean accept(final File dir, final String name) {
                    return name.endsWith(".java");
            }
});

System.out.println(files);
```
sort and Readable code
```java
Files.newDirectoryStream(
            Paths.get("fpij"), path -> path.toString().endsWith(".java"))
            .forEach(System.out::println);
```
fpij/Compare.java

fpij/IterateString.java

fpij/ListDirs.java


