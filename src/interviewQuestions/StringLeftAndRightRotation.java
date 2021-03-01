package interviewQuestions;

public class StringLeftAndRightRotation {
    public static void main(String[] args) {
        String s = "programming";
        int numberOfRotations = 3;
        String result = leftRotation(s, numberOfRotations);
        System.out.println(result);

        String s2 = "programming";
        String result2 = rightRotation(s, numberOfRotations);
        System.out.println(result2);

    }

    private static String rightRotation(String s, int numberOfRotations) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        reverse(chars, 0, n - 1);
        reverse(chars, 0, n - numberOfRotations - 1);
        reverse(chars, n - numberOfRotations, n - 1);
        return new String(chars);
    }

    private static String leftRotation(String s, int rotations) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        reverse(chars, 0, n - 1);
        reverse(chars, 0, rotations - 1);
        reverse(chars, rotations, n - 1);
        return new String(chars);
    }

    private static void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}
