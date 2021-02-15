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
