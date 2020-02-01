package array;

public class ReverseArrayWithLeetCodeRotateMethod {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		
		System.out.println("Original array");
		printArray(nums);
		
		reverse(nums,0,nums.length-1);
		
		System.out.println("\n\nReverse array");
		printArray(nums);

	}
	
	private static void reverse(int[] nums, int start, int end) {
		while(start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
		
	}

	private static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		
	}

}

	