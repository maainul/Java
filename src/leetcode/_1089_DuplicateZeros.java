/************************************************************
1089. Duplicate Zeros (Easy)


Given a fixed length array arr of integers, 
duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in place, do not return anything from your function.

 
Example 1:

Input: [1,0,2,3,0,4,5,0]
Output: null

Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: [1,2,3]
Output: null
Explanation: After calling your function, the input array is modified to: [1,2,3]
 
Note:

1 <= arr.length <= 10000
0 <= arr[i] <= 9
*************************************************************/
/**********************************************************
1051. Height Checker (Easy)

Students are asked to stand in non-decreasing order of heights for an annual photo.

Return the minimum number of students that must move in order for all students to be standing in non-decreasing order of height.

 

Example 1:

Input: heights = [1,1,4,2,1,3]
Output: 3
 

Constraints:

1 <= heights.length <= 100
1 <= heights[i] <= 100

https://leetcode.com/problems/duplicate-zeros/

************************************************************/

package leetcode;

public class _1089_DuplicateZeros {

	public static void main(String[] args) {
		
		System.out.println("1089. Duplicate Zeros (Easy)");
		
		
		int[] arr = {1,0,3,0,4,5};
		
		System.out.println("\nInput :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n\nOutput :");
		
		duplicateZeros(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
}

		
    public static void duplicateZeros(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;
        for(int i = 0;i<result.length;i++){
            if(arr[index]!=0){
                result[i] = arr[index];
            }else{
                result[i]=0;
                if(i+1<result.length){
                    result[i+1]=0;
                    i = i+1;
                }
            }
            index++;
        }
        for(int i = 0;i<result.length;i++) arr[i] = result[i];
    }

}
