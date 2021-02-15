package functionalProgrammingBook._2_UsingCollections._4_ReusingLambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class _ReusingLambda {
    public static void main(String[] args) {
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

