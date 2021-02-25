package interviewQuestions.strings;

public class _13_RemoveDuplicate {
    public static void main(String[] args) {
        String s = "BanaNas";
        removeD(s);
    }

    private static void removeD(String string) {
        int[] freq = new int[256];
        for (int i = 0; i < string.length(); i++) {
            if (freq[string.charAt(i)] < 0){
                freq[string.charAt(i)]++;
            }else {
                freq[string.charAt(i)] = 1;
            }
        }

        for (int i = 0; i < string.length(); i++) {
            System.out.println();
            if (freq[string.charAt(i)] >= 1) {
                System.out.print(string.charAt(i) + " ---");
                System.out.println(freq[string.charAt(i)]);
                freq[string.charAt(i)] = 0;
            }

        }

    }
}
