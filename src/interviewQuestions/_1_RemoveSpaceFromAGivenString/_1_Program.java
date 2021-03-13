/**
 * @Author Md. Mainul Hasan
 * <p>
 * 10:38:30 PM
 * <p>
 * Nov 21, 2020
 */
package interviewQuestions._1_RemoveSpaceFromAGivenString;

public class _1_Program {

    // Driver code
    public static void main(String[] args) {
        String str = "g eeks for ge eeks ";
        String string = removeSpaces(str);
        System.out.println(string);

    }

    private static String removeSpaces(String str) {
        int index = 0;
        char[] ch = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (ch[i] != ' ') {
                ch[index++] = ch[i];
            }
        }

        return new String(ch).substring(0, index);
        //return String.valueOf(ch).substring(0, index);
    }
}

