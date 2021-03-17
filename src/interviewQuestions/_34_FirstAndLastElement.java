package interviewQuestions;

import java.util.Arrays;

public class _34_FirstAndLastElement {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
//        int[] result = findFirstAndLast(arr, target);
//        System.out.println(Arrays.toString(result));
//        int[] result2 = findFirstAndLastII(arr, target);
//        System.out.println(Arrays.toString(result2));
        int[] result3 = firstAndLast(arr,target);
        System.out.println(Arrays.toString(result3));
    }

    private static int[] findFirstAndLastII(int[] arr, int target) {
        int[] targetRange = {-1, -1};
        for (int k : arr) {
            if (k == target) {
                targetRange[0] = -1;
                break;
            }
        }
        if (targetRange[0] == -1) {
            return targetRange;
        }

        for (int j = arr.length - 1; j >= 0; j--) {
            if (arr[j] == target) {
                targetRange[1] = j;
                break;
            }
        }

        return targetRange;
    }

    private static int[] findFirstAndLast(int[] arr, int target) {
        int[] arrary = new int[2];
        boolean first_index = false;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i] && first_index == false) {
                arrary[index++] = i;
                first_index = true;
            } else if (target == arr[i] && first_index == true) {
                arrary[index] = i;
            }
        }
        return arrary;
    }


    private static int[] firstAndLast(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        //find if an index with the target exists
        int index = binarySearch(arr, start, end, target);
        if (index == -1) {
            return new int[]{-1, -1};
        }
        // find lowest index of that target by continuing to binary serarch
        int lowest = index;
        while (lowest >= 0) {
            int lower = binarySearch(arr, start, lowest - 1, target);
            if (lower == -1) {
                break;
            }
            lowest = lower;
        }

        int higest = index;
        while (higest <= end) {
            int higher = binarySearch(arr, higest + 1, end, target);
            if (higher == -1) break;
            higest = higher;
        }
        return new int[]{lowest, higest};
    }

    private static int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
