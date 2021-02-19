package Java8NewFeaturesdurgasoft;

import java.util.function.Predicate;

public class FIndNameLength {
    public static void main(String[] args) {
        String[] names = {"mainul", "Poltuu", "Boltu", "Moontu"};
        Predicate<String> predicate = name -> name.length() > 5;
        for (String name : names) {
            if (predicate.test(name)) {
                System.out.println(name);
            }
        }
    }
}
