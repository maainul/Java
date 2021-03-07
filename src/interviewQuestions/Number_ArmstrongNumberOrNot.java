package interviewQuestions;

public class Number_ArmstrongNumberOrNot {
    public static void main(String[] args) {
        int number = 153;
        System.out.println(armstrong(number));
    }

    private static boolean armstrong(int number) {
        int rem = 0;
        int result = 0;
        int originalNumber = number;
        while (number != 0) {
            rem = number % 10;
            result = result + (rem * rem * rem);
            number = number / 10;
        }
        return originalNumber == result;
    }
}
