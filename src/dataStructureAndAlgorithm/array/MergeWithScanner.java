package dataStructureAndAlgorithm.array;


import java.util.Arrays;
import java.util.Scanner;

class Merge{
	public static void merge(int[] nums1, int[] nums2,int m, int n) {
		
		m = nums1.length;
		n = nums2.length;
		System.out.println(m);
		System.out.println(n);
		int[] result = new int [m +n];
		System.arraycopy(nums1, 0, result, 0, m);
		System.arraycopy(nums2, 0, result, m, n);
		// unsored data
		System.out.println(Arrays.toString(result));
		// result with sort
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
	}
	
}

public class MergeWithScanner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st array");
		System.out.println("Enter number of elemnts:");
		
		int m = s.nextInt(); 
		System.out.println("Enter "+ m +" elemtnts");
		
		int nums1[] = new int[m];
		
		for (int i = 0; i < m; i++) {
			nums1[i] = s.nextInt();
		}
		System.out.println("Enter 2nd array");
		System.out.println("Enter number of elemnts:");
		
		int n = s.nextInt(); 
		System.out.println("Enter "+ n +" elemtnts");
		
		int nums2[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			nums2[i] = s.nextInt();
		}
		
		s.close();
		Merge.merge(nums1, nums2,m,n);
		
		
	}

}
