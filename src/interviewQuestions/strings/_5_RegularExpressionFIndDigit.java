package interviewQuestions.strings;

import java.util.regex.Pattern;

public class _5_RegularExpressionFIndDigit<strings> {
    public static void main(String[] args) {

        // Regular expression in Java to check if String is number or not
        // Regular expression pattern to test input
        String regex = "(.)*(\\d)(.)*";
        Pattern pattern = Pattern.compile(regex);


        //Pattern pattern = Pattern.compile(".*\\D.*");
        String[] inputs = {"123", "-123", "123.12", "abcd123"};

        for (String input : inputs) {
            System.out.println("does " + input + " is number : "
                    + !pattern.matcher(input).matches());

        }

    }
}
