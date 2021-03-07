package interviewQuestions;

public class Number_PrimeOrNot {
    public static void main(String[] args) {
        int number = 20;
        primeNumbers(number);
    }

    private static void primeNumbers(int limit) {
        for (int number = 2; number <= limit; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
