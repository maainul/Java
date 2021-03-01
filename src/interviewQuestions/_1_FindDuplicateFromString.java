package interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class _1_FindDuplicateFromString {
    public static void main(String[] args) {
        String string = "google";
        freqCalculator(string);


    }


    private static void freqCalculator(String string) {
        int[] freq = new int[256];
        for (int i = 0; i < string.length(); i++) {
            freq[string.charAt(i) - 'a']++;
        }

        for (int i = 0; i < string.length(); i++) {
            if (freq[string.charAt(i) - 'a'] > 1) {
                System.out.print(string.charAt(i) + " ---");
                System.out.println(freq[string.charAt(i) - 'a']);
                freq[string.charAt(i) - 'a'] = 0;
            }

        }


    }
}

