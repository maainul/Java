package interviewQuestions;

public class CountOccurence {
    public static void main(String[] args) {
        String s = "mainulhasananik";
        System.out.println(countMaxstring(s));
    }

    public static char countMaxstring(String string) {
        int[] freq = new int[256];
        for (int i = 0; i < string.length(); i++) {
            freq[string.charAt(i) - 'a']++;
        }
        int max = -1;
        char result = ' ';
        for (int i = 0; i < string.length(); i++) {
            if (freq[string.charAt(i) - 'a'] > 1) {
                if (max < freq[string.charAt(i) - 'a']) {
                    max = freq[string.charAt(i) - 'a'];
                    result = string.charAt(i);
                }
            }

        }
        System.out.println(max+"------"+result);

        return result;

    }
}
