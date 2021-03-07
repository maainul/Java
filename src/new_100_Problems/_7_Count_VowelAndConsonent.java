package new_100_Problems;

public class _7_Count_VowelAndConsonent {
    public static void main(String[] args) {
        String string  = "hopeforthebest";
        countVowelAndConsonent(string);
    }

    private static void countVowelAndConsonent(String string) {
        int vowel = 0;
        int consonent = 0;
        String str = string.replace(" ","");
        char[] ch = str.toCharArray();
        for (char c : ch){
            if (isVowel(c)){
                vowel++;
            }else {
                consonent++;
            }

        }

        System.out.println("Vowels = "+vowel);
        System.out.println("Consonents = "+consonent);

    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
