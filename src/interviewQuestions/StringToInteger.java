package interviewQuestions;
// https://leetcode.com/problems/string-to-integer-atoi/discuss/943808/Java-solution-by-scanning-with-explanation

/*
This is one problem where you need to consider all the edge cases. I managed to come up with this solution which is quite straightforward.

1.Firstly, check the length. If 0, return 0.

2.Then we get rid of all the leading whitespaces with a while loop. If the string is completely made up of spaces, we just return 0.

3.The next condition is that there shouldn't be any words before the numbers. So we check if there is at least a letter. (Here since ascii value of alphabets are greater than ascii value of numbers, I just check s.charAt(i) - 'a' >= 0)

4.If we have reached here, it means we probably have a number.

5.Now, we check for the sign. We are checking for only one character because +- or -+ are bad inputs.

6.After this we are ready to figure out the number. So we keep track of the prev number (we'll see why).

7.We once again continue with scanning the input string, and if the next characters are numbers, we go on to calculate the number using the standard curr * 10 + s.charAt(i) - '0' logic.

8.To figure out overflow, we just compare the previous number to the current number/10. If it has overflown, the numbers won't match, and we can return the max value or min value based on the sign.

Once we are finished with numbers (or reached the end of the string) we can just return the actual number we calculated by multiplying with sign.


 */
public class StringToInteger {
    public static void main(String[] args) {
        String str = "  42";
        System.out.println(myAtoi(str));

    }

    public static int myAtoi(String s) {
        if (s.length() == 0)       // 1
            return 0;
        int n = s.length(), sign = 1, i = 0, res = 0;

        while (i < n && s.charAt(i) == ' ') {        // 2
            i++;
        }
        if (i == n)      // 2
            return 0;

        if (s.charAt(i) - 'a' >= 0) {        // 3
            return 0;
        }
        //  4

        if (s.charAt(i) == '-') {      // 5
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            sign = 1;
            i++;
        }

        //  6
        int prev = 0;
        while (i < n && s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9) {      // 7
            prev = res;
            res = res * 10 + s.charAt(i) - '0';
            if (res / 10 != prev) {          // 8
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            i++;
        }
        return sign * res;        // 9
    }
}
