package com.interview.leetcode;

import java.util.Arrays;

public class MaxLengthLimitedDiff {

	public static void main(String[] args) {
		System.out.println("-------------Test Case 1-------------");
		int [] a = {8 , 2 , 4 , 7, 1 , 0};
		int limit = 4;
		int maxLen = findMaxLen(a , limit);
		System.out.println(" Max Length : "+maxLen);
		System.out.println();

		System.out.println("-------------Test Case 2-------------");
		int [] b = {8 , 2 };
		limit = 4;
		maxLen = findMaxLen(b , limit);
		System.out.println(" Max Length : "+maxLen);
		System.out.println();
		
		System.out.println("-------------Test Case 3-------------");
		int [] c = {8 };
		limit = 4;
		maxLen = findMaxLen(c , limit);
		System.out.println(" Max Length : "+maxLen);
		System.out.println();
		
		System.out.println("-------------Test Case 4-------------");
		int [] d = {8 , 16 , 28};
		limit = 10;
		maxLen = findMaxLen(d , limit);
		System.out.println(" Max Length : "+maxLen);
		System.out.println();
		
		System.out.println("-------------Test Case 5-------------");
		int [] e = {4 ,9 , 8 , 5 , 1 , 7 , 9};
		limit = 6;
		maxLen = findMaxLen(e , limit);
		System.out.println(" Max Length : "+maxLen);
		System.out.println();
		
		System.out.println("-------------Test Case 6-------------");
		int [] f = {9 ,4 , 8 , 15 , 1 , 7 , 9};
		limit = 6;
		maxLen = findMaxLen(f , limit);
		System.out.println(" Max Length : "+maxLen);
		System.out.println();
		
		System.out.println("-------------Test Case 7-------------");
		int [] g = {10, 1 , 2 , 4 ,7 ,2};
		limit = 5;
		maxLen = findMaxLen(g , limit);
		System.out.println(" Max Length : "+maxLen);
		System.out.println();
	}

	private static int findMaxLen(int[] nums , int limit) {
		int maxLen = 0 , j = 0;
		if(nums.length == 1) {
			return 1;
		}
		for(int i = 0 ; i < nums.length - maxLen ; i++) {
			j = i+1;
			int maxDiff = 0;
			int minDiff = 0;
			while(j < nums.length && Math.abs(nums[i] - nums[j]) <= limit 
				&& ((maxDiff - nums [i]+ nums[j])) <= limit
				&& (Math.abs((nums[i]-nums[j] - minDiff))) <= limit) {
				if(nums[i] > nums[j])
					maxDiff = Math.max(maxDiff, nums[i]-nums[j]);
				else {
					minDiff = Math.min(minDiff, nums[i]-nums[j]);
				}
				j++;
			}
			maxLen = Math.max(maxLen, j - i);
		}
		return maxLen;
	}

}
/*
-------------Test Case 1-------------
 Max Length : 2

-------------Test Case 2-------------
 Max Length : 1

-------------Test Case 3-------------
 Max Length : 1

-------------Test Case 4-------------
 Max Length : 2

-------------Test Case 5-------------
 Max Length : 4

-------------Test Case 6-------------
 Max Length : 3

-------------Test Case 7-------------
 Max Length : 4
 * */
