package Java8NewFeaturesdurgasoft.functionalProgrammingBook._2_UsingCollections._6_PickingAnElement;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PickingAnElement {
    public static void main(String[] args) {
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
    public static void pickName2(final List<String> names, final String startingLetter){
        final Optional<String> foundName =
                names.stream()
                .filter(name-> name.startsWith(startingLetter))
                .findFirst();

        System.out.println(String.format("A name starting with %s : %s",startingLetter,foundName.orElse("No Name Found")));
    }
}
