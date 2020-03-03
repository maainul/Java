/**********************************************************
485. Max Consecutive Ones (Easy)

Given a binary array, find the maximum number of consecutive 1s in this array.

	Example 1:
	Input: [1,1,0,1,1,1]
	Output: 3

Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000


Solution courtesy: https://blog.csdn.net/Davy_Joe/article/details/54619671

https://massivealgorithms.blogspot.com/2017/01/leetcode-485-max-consecutive-ones.html
110111
^ maxHere = 1

110111
.^ maxHere = 2

110111
..^ maxHere = 0

110111
...^ maxHere = 1

110111
....^ maxHere = 2

110111
.....^ maxHere = 3

************************************************************/

package leetcode;

public class _485_MaxConsecutiveOnesEasy {

	public static void main(String[] args) {
		
		System.out.println("485. Max Consecutive Ones Easy");
		
		int[] nums = {1,1,0,1,1,1};
		
		System.out.println("\nInput :");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		
		
		System.out.println("\n\nOutput :");
		
		System.out.println(findMaxConsecutiveOnes(nums));	 
}

	private static int findMaxConsecutiveOnes(int[] nums) {
		int max = 0, count = 0;
		for (int i : nums) {
			if( i == 1) {
				count++;
			}else {
				count = 0;
			}
			max = (max >= count ? max:count);
		}
		return max;
	}
}