package leetcode.array;

public class _189_RotateArray {
	public static void main(String[] args) {
		
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7};
		int k = 3; 
		System.out.println("Original array: ");
		PrintArray(nums);
		
		rotate(nums,k);
       
		System.out.println("\n\nArray after right rotation: ");
		PrintArray(nums);
		
	}

	 public static void rotate(int[] nums, int k) {
	        int temp, previous;
	        for(int i=0;i<k;i++){
	            previous = nums[nums.length-1];
	            for(int j = 0; j<nums.length;j++){
	                temp = nums[j];
	                nums[j] = previous;
	                previous = temp;
	            }
	        }
	    }

	private static void PrintArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}