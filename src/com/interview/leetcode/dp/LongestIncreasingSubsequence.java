package com.interview.leetcode.dp;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		System.out.println("------------------Test Case 1------------------------");
		int [] nums = {10,9,2,5,3,7,101,18};
		System.out.println("Longest Increasing Subsequence : "+lengthOfLIS(nums));
		System.out.println();
		
		System.out.println("------------------Test Case 1------------------------");
		int [] nums2 = {0,1,0,3,2,3};
		System.out.println("Longest Increasing Subsequence : "+lengthOfLIS(nums2));
		System.out.println();
		
		System.out.println("------------------Test Case 1------------------------");
		int [] nums3 = {7 ,7 ,7 , 7 , 7 , 7};
		System.out.println("Longest Increasing Subsequence : "+lengthOfLIS(nums3));
		System.out.println();
		
		System.out.println("------------------Test Case 1------------------------");
		int [] nums4 = {3 , 4 , -1 , 0 , 6 , 2 ,3 , 4};
		System.out.println("Longest Increasing Subsequence : "+lengthOfLIS(nums4));
		System.out.println();

	}

	 public static int lengthOfLIS(int[] nums) {
		 int lis = 1;
		 int [] a = new int [nums.length];
		 Arrays.fill(a, 1);
		 
		 
		 for(int i = 1 ; i < nums.length ; i++) {
			 for(int j = 0 ; j < i ; j++) {
				 if(nums[i] > nums[j]) {
					a[i] = Math.max(a[i], a[j] + 1);
				 }
			 }
		 }
		 
		 for(int i = 1 ; i < a.length ; i++) {
			 lis = Math.max(lis, a[i]);
		 }
		 
		return lis;
	        
	 }
}

/*
 * ------------------Test Case 1------------------------
Longest Increasing Subsequence : 4

------------------Test Case 1------------------------
Longest Increasing Subsequence : 4

------------------Test Case 1------------------------
Longest Increasing Subsequence : 1

------------------Test Case 1------------------------
Longest Increasing Subsequence : 5

 * */
