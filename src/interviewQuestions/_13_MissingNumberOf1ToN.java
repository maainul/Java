package interviewQuestions;

public class _13_MissingNumberOf1ToN {
    public static void main(String[] args) {
        int r = getMissingNumber(new int[]{1, 2, 3, 4, 5});
        System.out.println(r);
    }

    private static int getMissingNumber(int[] numbers) {
        int expectedSum = 6 * ((6 + 1) / 2);
        int actualSum = 0;
        for (int i : numbers) {
            actualSum += i;
        }
        return expectedSum - actualSum;
    }

    //   Read more: https://javarevisited.blogspot.com/2014/11/how-to-find-missing-number-on-integer-array-java.html#ixzz6oPHANwS8
}
