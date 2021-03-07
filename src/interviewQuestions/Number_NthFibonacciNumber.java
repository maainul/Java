package interviewQuestions;

public class Number_NthFibonacciNumber {
    public static void main(String[] args) {
        int number = 5;

        System.out.println(fib(number));
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

//    Read more: https://www.java67.com/2019/03/nth-fibonacci-number-in-java-coding.html#ixzz6oHFAntEg

}
