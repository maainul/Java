package linkedList;
/*
169. Majority Element

Given an array of size n, find the majority element.
The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2
 */
public class _169_MajorityElement {
    public static void main(String[] args) {
        int nums[] = {2, 2, 1, 1, 1, 1, 1, 2, 2};

        System.out.println(majorityNums(nums));
    }

    private static int majorityNums(int[] nums) {
        int majorCount = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > majorCount) {
                return nums[i];
            }
        }
        return -1;
    }


    
}

