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
