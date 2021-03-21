package Java8NewFeaturesdurgasoft.functionalProgrammingBook._3_String;

public class _1_IteratingAString {

    public static void main(String[] args) {

        final String str = "w00t";
        // Using labmda expression
        str.chars().forEach(n -> System.out.println(n));
        // Using method reference
        str.chars().forEach(System.out::println);


        // map stream to the object and convert into character
        str.chars()
                .mapToObj(ch -> (char) ch)
                .forEach(System.out::println);


        str.chars()
                .filter(ch ->Character.isDigit(ch))
                .forEach(ch -> printChar(ch));

    }
    private static void printChar(int aChar) {
        System.out.println((char)(aChar));
    }
}
