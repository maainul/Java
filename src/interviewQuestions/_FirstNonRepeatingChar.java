package interviewQuestions;

public class _FirstNonRepeatingChar {
    public static void main(String[] args) {
        // https://javarevisited.blogspot.com/2014/03/3-ways-to-find-first-non-repeated-character-String-programming-problem.html#axzz6nPrhlxza

        String str = "whellho";
        myApproach(str);

    }

    private static void myApproach(String str) {
        int[] freq = new int[256];
        char[] chars = str.toCharArray();
        for(char c : chars){
            freq[c-'a']++;
        }

        for (char c : chars){
            if (freq[c-'a'] == 1){
                System.out.println(c);
                return;
            }
        }

    }
}
