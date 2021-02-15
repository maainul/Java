# Chapter 2 Collections

# 1. Iterating Through List 
```.java
package functionalProgrammingBook._2_UsingCollections._1_IteratingThroughList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
// Using Collections
public class ListCLass {
    public static void main(String[] args) {
        final List<String> friends = Arrays.asList(
                "Fakhrul",
                "Kamrul",
                "Abdullah"
        );

        // Throught iterator
        System.out.println("******Iterator ****");
        Iterator iterator = friends.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Style for loop
        System.out.println("****For Loop Approach");
        for (int i = 0; i <friends.size(); i++){
            System.out.println(friends.get(i));
        }

        // second approach FOr each Loop
        System.out.println("****For Each Approach******");
        for(String name: friends){
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
        friends.forEach((name)-> System.out.println(name));

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
```.java
package functionalProgrammingBook._2_UsingCollections._2_transformainAList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperCaseLowerCase {
    public static void main(String[] args) {
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

        System.out.println("**** Find Length of each name *****");
        friends.stream()
                .map(name -> name.length())
                .forEach(count -> System.out.print(count + " "));

        System.out.println("******* Using Method reference *****");
        friends.stream()
                .map(String::toUpperCase)
                .forEach(name -> System.out.print(name + " "));
        System.out.println();


    }
}
```
# 3. Finding Elements (StartsWith/EndsWith)
```.java
package functionalProgrammingBook._2_UsingCollections._3_FindingElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartSWithExample {
    public static void main(String[] args) {
        final List<String> friends = Arrays.asList(
                "Fakhrul",
                "Kamrul",
                "Abdullah",
                "Akash",
                "Batas"
        );

        System.out.println("Start with  Normal For Each method");
        final List<String> stringList = new ArrayList<>();
        for (String name : friends){
            if (name.startsWith("A")){
                stringList.add(name);
            }
        }
        stringList.forEach(s -> System.out.println(s));
       // stringList.forEach(System.out::println);

        System.out.println("*************WIth lambda Expression*******");
        final List<String> startsWithN =
                friends.stream()
                .filter(name-> name.startsWith("A"))
                .collect(Collectors.toList());

        // Let's print number of element in the result collection
        System.out.println("******Let’s print the number of elements in the result collection****");
        System.out.printf("Found %d names%n", startsWithN.size());

        startsWithN.forEach(System.out::println);
    }
}
```