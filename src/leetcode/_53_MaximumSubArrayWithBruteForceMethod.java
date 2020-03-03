package leetcode;

/*
    53. Maximum Subarray

	Given an integer array nums, 
	find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

	Example:
	
	Input: [-2,1,-3,4,-1,2,1,-5,4],
	Output: 6
	Explanation: [4,-1,2,1] has the largest sum = 6.
	
 */
import java.util.Scanner;
 
public class _53_MaximumSubArrayWithBruteForceMethod
{
    public static void main(String[] args) 
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int N = scan.nextInt();
        int[] arr = new int[ N ];
        /* Accept N elements */
        System.out.println("Enter "+ N +" elements");
        for (int i = 0; i < N; i++)
            arr[i] = scan.nextInt();
        System.out.println("Max sub array sum  = "+ max_sum(arr));
        scan.close();
    	
    }
    public static int max_sum(int[] arr)
    {
        int N = arr.length, max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++)
        {
        	
            int sum = 0;
            
            for (int j = i; j < N; j++)
            {
                sum += arr[j];
               // System.out.println(j+" iteration sum = "+sum);
                if (sum > max)
                    max = sum;
                
            }
            System.out.println(i+" iteration sum = "+sum);
        }
        return max;    
    }
}