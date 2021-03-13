package interviewQuestions;

public class _7_Count_VowelAndConsonant {
    public static void main(String[] args) {
        String string  = "hopeforthebest";
        countVowelAndConsonant(string);
    }

    private static void countVowelAndConsonant(String string) {
        int vowel = 0;
        int consonant = 0;
        String str = string.replace(" ","");
        char[] ch = str.toCharArray();
        for (char c : ch){
            if (isVowel(c)){
                vowel++;
            }else {
                consonant++;
            }

        }

        System.out.println("Vowels = "+vowel);
        System.out.println("Consonents = "+consonant);

    }

    private static boolean isVowel(char ch) {

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
