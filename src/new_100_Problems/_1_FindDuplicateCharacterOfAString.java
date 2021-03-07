package new_100_Problems;
// https://www.java67.com/2014/03/how-to-find-duplicate-characters-in-String-Java-program.html
public class _1_FindDuplicateCharacterOfAString {
    public static void main(String[] args) {
        String str = "Java is best programming language";
        printDuplicate(str);
    }

    private static void printDuplicate(String str) {
        int[] freq = new int[256];
        char[] ch = str.toCharArray();
        for (char c : ch) {
            freq[c]++;
        }
        for (char c : ch) {
            if (freq[c] > 1) {
                System.out.println(freq[c] + "------- " + c);
                freq[c] = 0;
            }
        }
    }
}
