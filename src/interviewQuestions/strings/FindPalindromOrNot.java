package interviewQuestions.strings;

// Java implementation of the approach
public class FindPalindromOrNot {

    // Function that returns true if
    // str is a palindrome
    static boolean isPalindrome(String str) {
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }

    // Driver code
    public static void main(String[] args) {
        String str = "geeks";

        if (isPalindrome(str))
            System.out.print("Yes");
        else
            System.out.print("No");

        String str2 = "mainul";
        if (isPalindromUsingReverse(str2)) {
            System.out.println("Yes");
        } else
            System.out.println("NO");


    }

    private static boolean isPalindromUsingReverse(String str2) {
        String reverseString = reverse(str2);
        if (str2.equals(reverseString)) {
            return true;
        }
        return false;
    }

    private static String reverse(String str2) {
        int left = 0;
        int right = str2.length() - 1;
        char[] ch = str2.toCharArray();
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }
}
