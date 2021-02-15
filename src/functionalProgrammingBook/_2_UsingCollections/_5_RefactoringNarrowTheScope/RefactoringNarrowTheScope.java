package functionalProgrammingBook._2_UsingCollections._5_RefactoringNarrowTheScope;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

// Refactoring to Narrow the Scope
public class RefactoringNarrowTheScope {
    public static void main(String[] args) {
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
