package interviewQuestions;

public class _9_FindPermutationOfAStrings {
    public static void main(String[] args) {
        String str = "ABC";
        permutation(str,0,str.length()-1);
    }

    private static void permutation(String str,int left, int right) {
        if (left == right){
            System.out.println(str);
        }
        else {
            for (int i = left; i <= right; i++){
                str = swap(str,left,i);
                permutation(str,left+1,right);
                str = swap(str,left,i);
            }
        }
    }

    private static String swap(String str, int left, int right) {
        char[] ch = str.toCharArray();
        char temp = ch[left];
        ch[left] = ch[right];
        ch[right] = temp;

        return new String(ch);
    }
}
