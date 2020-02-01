package leetcode.array;

public class _189_RotateArray {
	public static void main(String[] args) {
		
		int[] nums = new int[] { 1, 2, 3, 4, 5 };
		int k = 3; 
		System.out.println("Original array: ");
		PrintArray(nums);
		
		k = k% nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
	
		System.out.println("\n\nArray after right rotation: ");
		PrintArray(nums);
		
	}

	private static void reverse(int[] nums, int start, int end) {
		while(start<end){
            int temp= nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
		
	}

	private static void PrintArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}