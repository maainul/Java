package interviewQuestions;// Java program to
// reverse a String

import java.util.*;

class ReverseWordInAGivenString {


    public static String reverseWords(String s) {
        if (s.length() == 0) {
            return "";
        }
        char[] ch = s.toCharArray();
        int start = 0;
        for (int end = 0; end < ch.length; end++) {
            if (ch[end] == ' ') {
                reverse(ch, start, end - 1);
                start = end + 1;
            }
        }
        reverse(ch, start, ch.length - 1);
        reverse(ch, 0, ch.length - 1);

        return new String(ch);


    }


    public static void reverse(char[] c, int l, int r) {

        while (l < r) {
            char t = c[l];
            c[l] = c[r];
            c[r] = t;
            l++;
            r--;
        }

    }

    public static void main(String[] args) {
        String s = "I love bd";
        System.out.print(reverseWords(s));

    }
}

// This code is contributed by gauravrajput1
