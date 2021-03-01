package interviewQuestions;

public class ReplaceCharacter {
    public static void main(String[] args) {
        String s = "internet";
        System.out.println(replaceCharacter(s));

    }

    private static String replaceCharacter(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {

            if (ch[i] == 'e') {
                ch[i] = 'B';
            }
        }
        return new String(ch);

    }
}
