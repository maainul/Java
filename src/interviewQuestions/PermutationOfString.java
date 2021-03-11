package interviewQuestions;

public class PermutationOfString {
    static int count = 0;

    public static void main(String[] args) {
        String str = "ABCDEF";
        permutation(str, 0, str.length() - 1);
        System.out.println(count);
    }

    private static void permutation(String str, int l, int r) {

        if (l == r) {
            count++;
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permutation(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    private static String swap(String str, int l, int r) {
        char[] ch = str.toCharArray();
        char temp = ch[l];
        ch[l] = ch[r];
        ch[r] = temp;

        return new String(ch);
    }

}
