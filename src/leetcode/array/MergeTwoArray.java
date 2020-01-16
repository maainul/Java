package leetcode.array;

import java.util.Arrays;


class Merge{
	public static void merge(int[] nums1, int[] nums2, int m, int n) {
        int index=0;
        for(int i=m;i<m+n;i++) {
        		nums1[i]=nums2[index++];
        		System.out.println("Num 1 :"+nums1[i]);
        		System.out.println("num2 :"+nums2[index]);
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}

public class MergeTwoArray {
	public static void main(String[] args) {
		
		int nums1[] = {1,2,3,0,0,0};
		int nums2[] = {2,5,6};
		
		int m = 3;
		int n = 3;


		Merge.merge(nums1, nums2,m,n);
		
		
	}

}
