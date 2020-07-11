package leetcode;
/*
167. Two Sum II - Input array is sorted

Given an array of integers that is already sorted in ascending order,
find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target,
where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.
Example:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]

Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */
public class _167_TwoSumIIInputArrayIsSorted {

    private static int[] twosum(int[] nums, int target) {
        for (int i = 0; i< nums.length; i++){
            for (int j = i+1; j < nums.length;j++){
                if (nums[i] + nums[j] == target){
                    return new int[] {i+1, j+1};
                }
            }
        }
        return null;
    }

    private static int[] twoSumtwoPointer(int[] nums, int target){
        int a_pointer = 0;
        int b_pointer = nums.length -1;

        while (a_pointer < b_pointer){
            int sum = nums[a_pointer] + nums[b_pointer];
            if(sum > target){
                b_pointer--;
            }
            else if(sum < target){
                a_pointer--;
            }else{
                return new int[] {a_pointer+1, b_pointer+1};
            }

        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 17;

        int[] result = twosum(nums,target);
        if (result != null){
            System.out.println("Index 1 :"+result[0]+" Index 2 :"+result[1]);
        }else{
            System.out.println("No data found");
        }
        
        System.out.println(twoSumtwoPointer(nums, target));
    }


}
