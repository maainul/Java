package interviewQuestions;

public class CheckAnagramOrNot {

    static int NO_OF_CHARS = 256;

    // function to check if two strings
// are anagrams of each other
    static boolean areAnagram(char[] str1,
                              char[] str2) {

        // Create a count array and initialize
        // all values as 0
        int[] count = new int[NO_OF_CHARS];
        int i;

        // For each character in input strings,
        // increment count in the corresponding
        // count array
        for (i = 0; i < str1.length; i++) {
            count[str1[i]]++;
            count[str2[i]]--;
        }

        // If both strings are of different
        // length. Removing this condition
        // will make the program fail for
        // strings like "aaca" and "aca"
        if (str1.length != str2.length)
            return false;

        // See if there is any non-zero
        // value in count array
        for (i = 0; i < NO_OF_CHARS; i++)
            if (count[i] != 0) {
                return false;
            }
        return true;
    }

    // Driver code
    public static void main(String[] args) {
        char str1[] = "anikkk".toCharArray();
        char str2[] = "kanikk".toCharArray();

        // Function call
        if (areAnagram(str1, str2))
            System.out.print("The two strings are " +
                    "anagram of each other");
        else
            System.out.print("The two strings are " +
                    "not anagram of each other");
    }
}

// This code is contributed by mark_85
