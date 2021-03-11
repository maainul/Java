package new_100_Problems;

public class _10_ReverseSentenceOfAString {
    public static void main(String[] args) {
        String s = "I love bd";
        System.out.print(reverseWords(s));

    }

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

}