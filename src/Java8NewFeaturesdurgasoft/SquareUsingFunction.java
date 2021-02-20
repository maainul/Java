package Java8NewFeaturesdurgasoft;

import java.util.function.Function;

public class SquareUsingFunction {
    public static void main(String[] args) {
        // sqr
        Function<Integer,Integer> function = i -> i * i ;
        System.out.println(function.apply(10));
        System.out.println(function.apply(5));
        // count string length
        Function<String,Integer> function1 = String::length;

        System.out.println(function1.apply("Mainul hasan"));
        // Upper case
        Function<String, String> function2 = s -> s.toUpperCase();
        System.out.println(function2.apply("mainul hasan"));




    }
}
