package new_100_Problems;

public class _4_ReverseAStringUsingRecursion {
    public static void main(String[] args) {

        System.out.println(reverseStringIterative("mainul"));


        String string = "mainul";
        char[] ch = string.toCharArray();
        System.out.println(reverseStringRecursive(ch,0,5));
    }



    private static String reverseStringRecursive(char[] str, int left, int right) {

        if (left <= right){
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
        }
        if (left >= right) {
            return new String(str);
        }
        return reverseStringRecursive(str,left++,right--);

    }

    private static String reverseStringIterative(String str) {
        char[] ch = str.toCharArray();
        int left = 0;
        int right = ch.length-1;
        while (left <=right ){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);

    }

}
