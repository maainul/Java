package new_100_Problems;

public class _2_CheckAnagramOrNot {
    public static void main(String[] args) {
        System.out.println(checkAnagram("java", "jva"));
    }

    private static boolean checkAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        for (char c : ch1) {
            freq1[c]++;
        }

        for (char c : ch2) {
            freq2[c]++;
        }

        for (char c : ch1) {
            if (freq1[c] != freq2[c]) {
                return false;
            }
        }
        return true;
    }
}
