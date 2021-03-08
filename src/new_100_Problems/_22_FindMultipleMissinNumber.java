package new_100_Problems;

public class _22_FindMultipleMissinNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        System.out.println(missingNumber(arr));
    }

    private static int missingNumber(int[] arr) {
        int actual = 6 * ((6 + 1) / 2);
        int expected = 0;
        for (int i : arr) {
            expected = expected + i;
        }
        return actual-expected;
    }
}
