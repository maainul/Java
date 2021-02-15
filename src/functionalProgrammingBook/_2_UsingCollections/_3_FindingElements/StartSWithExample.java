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
