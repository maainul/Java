package interviewQuestions;

public class FindFirstRepeatingCharacter {
    public static void main(String[] args) {
        String str = "ProgrammingP";
        System.out.println(repeatingchar(str));
    }

    private static char repeatingchar(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++){
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++){
            if (freq[str.charAt(i)] != 0 )
                if (freq[str.charAt(i)] == 1){
                    return str.charAt(i);
                }
        }
        return 'f';

    }
}
