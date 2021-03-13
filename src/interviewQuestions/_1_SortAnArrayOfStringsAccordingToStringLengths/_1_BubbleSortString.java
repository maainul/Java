/**
 * @Author Md. Mainul Hasan
 * <p>
 * 11:01:06 PM
 * <p>
 * Nov 22, 2020
 */
package interviewQuestions._1_SortAnArrayOfStringsAccordingToStringLengths;

public class _1_BubbleSortString {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String[] string = {"Welcome", "home", "Mr", "Mainul", "Hasan"};
        sortString(string);

    }

    private static void sortString(String[] string) {
        for (int i = 0; i < string.length; i++) {
            String temp1 = string[i];
            for (int j = i + 1; j < string.length; j++) {
                String temp2 = string[j];
                if (temp1.length() > temp2.length()) {
                    String temp = temp1;
                    temp1 = temp2;
                    temp2 = temp;
                    // temp = "";

                }
            }
        }

        for (String s : string) {
            System.out.println(s);
        }
    }

}
