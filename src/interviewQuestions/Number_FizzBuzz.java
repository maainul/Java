package interviewQuestions;

public class Number_FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            if (i % (3 * 5) == 0) {
                System.out.println(i+ " FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println(i+ " Buzz");
            } else if (i % 3 == 0) {
                System.out.println(i+ " Fizz");
            }
        }
    }
}