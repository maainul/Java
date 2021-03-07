package interviewQuestions;
/*
 solution is to keep dividing the number by two, i.e, do n = n/2 iteratively.

 In any iteration, if n%2 becomes non-zero and n is not 1 then n is not a power of 2.

 If n becomes 1 then it is a power of 2.
 */
// https://www.geeksforgeeks.org/java-program-to-find-whether-a-no-is-power-of-two/#:~:text=Another%20solution%20is%20to%20keep,is%20a%20power%20of%202.
public class Number_PowerOfTwo {
    public static void main(String[] args) {
        int number = 32;
        System.out.println(powerOfTwo(number));
    }

    private static boolean powerOfTwo(int number) {
        if (number == 0) {
            return false;
        }
        while (number != 1) {
            if (number % 2 != 0) {
                return false;
            }
            number = number / 2;
        }
        return true;
    }
}
