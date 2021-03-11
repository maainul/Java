package quiz_2021_March;

public class _3_Program {
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "grammar";
        System.out.println(checkKanagram(str1, str2, 3));
    }

    private static boolean checkKanagram(String str1, String str2, int k) {
        int n = str1.length();
        if (str2.length() != n)
            return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];
        int count = 0;


        for (int i = 0; i < n; i++)
            count1[str1.charAt(i) - 'a']++;
        for (int i = 0; i < n; i++)
            count2[str2.charAt(i) - 'a']++;

        for (int i = 0; i < 26; i++)
            if (count1[i] > count2[i])
                count = count + Math.abs(count1[i] -
                        count2[i]);


        return (count <= k);

    }
}
