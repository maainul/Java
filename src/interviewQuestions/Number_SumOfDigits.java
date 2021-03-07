package interviewQuestions;

public class Number_SumOfDigits {
    public static void main(String[] args) {
        int number = 123;
        System.out.println(sumOfDigits(number));
        System.out.println(sumOfDigitsUsingRecursion(number));
    }

    private static int sumOfDigitsUsingRecursion(int number) {
        if (number == 0){
            return number;
        }
        // 123
        int rem = number % 10;
        number = number/10;
        return rem + sumOfDigitsUsingRecursion(number);
    }

    private static int sumOfDigits(int number) {
        int rem = 0;
        int result = 0;
        while (number != 0){
            rem = number % 10;
            result = rem + result;
            number = number / 10;
        }
        return result;
    }
}
