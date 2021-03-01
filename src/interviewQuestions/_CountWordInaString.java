package interviewQuestions;

public class _CountWordInaString {
    public static void main(String[] args) {
        System.out.println(countWord("I love My Country"));
        System.out.println(wordcount("  Programming   is a good exercise  "));

    }

    private static int countWord(String str) {
        char[] ch = str.toCharArray();
        int start  = 0;
        int count = 0;
        for (int end = 0; end < ch.length; end++){
            if (ch[end] == ' '){
                count++;
                start = end+1;
            }
        }

        return count+1;
    }


    public static int wordcount(String word) {
        if (word == null || word.isEmpty()) {
            return 0;
        }
        int count = 0;
        char ch[] = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            ch[i] = word.charAt(i);
            if (
                    (
                            (i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')
                    )
                            ||

                            (
                                    (ch[0] != ' ') && (i == 0)
                            )
            ) {
                count++;
            }

        }
        return count;
    }
}

