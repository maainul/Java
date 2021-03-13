package interviewQuestions;

public class _3_PrintNonRepeatingCharacterOfAString {
    public static void main(String[] args) {
        printNonRepeating("ainulhasan");
    }

    private static void printNonRepeating(String str) {
        char[] ch = str.toCharArray();
        int[] freq = new int[256];
        for (char c : ch) {
            freq[c]++;
        }

        for (char c : ch) {
            if (freq[c] == 1) {
                System.out.println(c);
                break;
            }
        }
    }
}
