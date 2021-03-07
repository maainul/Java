package new_100_Problems;

public class _11_StirngIsPalindrome {
    public static void main(String[] args) {
        String string = "moina";
        System.out.println(palindrome(string));
    }

    private static boolean palindrome(String string) {
        int left = 0, right = string.length()-1;
        char[] ch = string.toCharArray();
        while (left < right){
            if (ch[left] != ch[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
