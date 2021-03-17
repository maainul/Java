package Java8NewFeaturesdurgasoft.functionalProgrammingBook._2_UsingCollections._7_ReducingaCollectiontoaSingleValue;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReducingCollection {
    public static void main(String[] args) {
        final List<String> names = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        System.out.println("Total numnber of character in all names");
        names.stream()
                .mapToInt(name -> name.length())
    .sum();


        final Optional<String> aLongName = names.stream()
                .reduce((name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
        aLongName.ifPresent(name -> System.out.println(String.format("A Longes name  %s ",name)));


        final String steveOrLonger = names.stream()
                .reduce("Steve", (name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
        }
    }
