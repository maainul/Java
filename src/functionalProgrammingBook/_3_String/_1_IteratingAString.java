package functionalProgrammingBook._3_String;

public class _1_IteratingAString {

    public static void main(String[] args) {

        final String str = "w00t";

//        str.chars().forEach(System.out::println);
//
//        System.out.println("Method reference");
//        str.chars().forEach(System.out::println);

        str.chars()
                .mapToObj(ch -> (char) ch)
                .forEach(System.out::println);
    }

}
