package Java8NewFeaturesdurgasoft;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // Stream.of()
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        stream.forEach(p -> System.out.println(p));
        // stream.of(array)
        Stream arrayStream = Stream.of(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        arrayStream.forEach(p -> System.out.println(p));
        // List.stream()
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        Stream<Integer> listStream = list.stream();
        listStream.forEach(p -> System.out.println(p));
        // Stream.generate() or Stream.iterate()
        Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
        randomNumbers.limit(20).forEach(System.out::println);

        // Stream Collectors
        // Collect Stream elements to a List
        List<Integer> liist = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            liist.add(i);
        }
        Stream<Integer> stream1 = liist.stream();
        List<Integer> evenNumberList = stream1.filter(i -> i % 2 == 0).collect(Collectors.toList());
        evenNumberList.forEach(System.out::println);
        //  Collect Stream elements to an Array
        List<Integer> listA = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listA.add(i);
        }
        Stream<Integer> stream2 = listA.stream();
        Integer[] o = stream2.filter(i -> i % 2 == 0).toArray(Integer[]::new);

        // Intermediate Operations
        // stream.filter()
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        memberNames.stream()
                .filter((s) -> s.startsWith("A"))
                .forEach(System.out::println);
        /*
        Amitabh
        Aman
         */
        // Stream.map()
        memberNames.stream()
                .filter((s) -> s.startsWith("A")) // take prdicate
                .map(String::toUpperCase) //
                .forEach(System.out::println);
        /*
        AMITABH
        AMAN
         */
        memberNames.stream()
                .sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        /*
        AMAN
        AMITABH
        LOKESH
        RAHUL
        SALMAN
        SHAHRUKH
        SHEKHAR
        YANA
         */
        // Stream.forEach()
        memberNames.forEach(System.out::println);

        // Stream.collect()
        List<String> memNamesInUppercase =
                memberNames.stream()
                        .sorted()
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());

        System.out.print(memNamesInUppercase);
//[AMAN, AMITABH, LOKESH, RAHUL, SALMAN, SHAHRUKH, SHEKHAR, YANA]
        // Stream.match()

        boolean matchedResult = memberNames.stream()
                .anyMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);

        matchedResult = memberNames.stream()
                .allMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);

        matchedResult = memberNames.stream()
                .noneMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);
        // Stream.count()
        long totalMatched =
                memberNames.stream()
                        .filter((s) -> s.startsWith("A"))
                        .count();

        System.out.println(totalMatched);
        // Stream.anyMatch()
        boolean matched = memberNames.stream()
                .anyMatch((s) -> s.startsWith("A"));

        System.out.println(matched);

        // Stream.findFirst()
        String firstMatchedName = memberNames.stream()
                .filter((s) -> s.startsWith("L"))
                .findFirst()
                .get();

        System.out.println(firstMatchedName);

    }
}
