package interviewQuestions;
//  Read more: https://javarevisited.blogspot.com/2012/12/how-to-check-if-number-is-palindrome-or-not-example.html#ixzz6oH5pOnIM
public class Number_ReverseANumber {
    public static void main(String[] args) {
        int number = 123;
        System.out.println(isPalindrome(number));

    }

    private static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    private static int reverse(int number) {
        int reverse = 0;
        int reminder = 0;
        while (number != 0) {
            reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;
        }
        return reverse;
    }


}
