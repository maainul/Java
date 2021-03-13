/**
 * @Author Md. Mainul Hasan
 * <p>
 * 12:09:30 AM
 * <p>
 * Nov 22, 2020
 */
package interviewQuestions._7_EveryFirstCharacterOfAString;

/*
    Given a string "geeks for geeks"
    we have to find  gfg

    Input = geeks for geeks
    Output = gfg

 */

public class _1_Program {

    // Function to find string which has first
    // character of each word.
    static String firstLetterWord(String str) {
        StringBuilder result = new StringBuilder();

        // Traverse the string.
        boolean v = true;
        for (int i = 0; i < str.length(); i++) {
            // If it is space, set v as true.
            if (str.charAt(i) == ' ') {
                v = true;
            }

            // Else check if v is true or not.
            // If true, copy character in output
            // string and set v as false.
            else if (str.charAt(i) != ' ' && v) {
                result.append(str.charAt(i));
                v = false;
            }
        }

        return result.toString();
    }

    // Driver code
    public static void main(String[] args) {
        String str = "geeks for geeks";
        System.out.println(firstLetterWord(str));
    }
}
