package interviewQuestions;

import java.io.FileInputStream;
import java.io.IOException;

public class _1_FindDuplicateFromAFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/home/onik/data/dup.txt");
        int c = fileInputStream.read();
        int[] freq = new int[256];
        while (c != -1) {
            freq[c - 'a']++;
            c = fileInputStream.read();
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                System.out.println((char) (i + 'a') + "  " + freq[i]);

            }
        }
    }
}

