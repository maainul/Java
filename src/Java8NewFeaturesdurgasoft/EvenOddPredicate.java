package Java8NewFeaturesdurgasoft;

import java.util.function.Predicate;

public class EvenOddPredicate {
    public static void main(String[] args) {
        Predicate<Integer> predicate = i -> i %2 == 0;
        System.out.println(predicate.test(10));
        System.out.println(predicate.test(15));
    }
}
