package com.interview.leetcode;

public class MinSizeContiguousSubArraySum {

	public static void main(String[] args) {
		System.out.println("------------------Test Case 1--------------------");
		int [] nums = {2,3,1,2,4,3};
		int s = 7;
		int minSize = minSubArrayLen(s, nums);
		System.out.println("Min Size Subarray Length with sum >= "+s+" is : "+minSize);
		System.out.println();
		
		System.out.println("------------------Test Case 2--------------------");
		int [] nums2 = {1 , 1 , 1 , 1 , 2, 5 , 8 , 1};
		s = 7;
		minSize = minSubArrayLen(s, nums2);
		System.out.println("Min Size Subarray Length with sum >= "+s+" is : "+minSize);
		System.out.println();
		
		System.out.println("------------------Test Case 3--------------------");
		int [] nums3 = {1 , 1 , 1 , 1 , 1};
		s = 6;
		minSize = minSubArrayLen(s, nums3);
		System.out.println("Min Size Subarray Length with sum >= "+s+" is : "+minSize);
		System.out.println();
	}

	public static int minSubArrayLen(int s, int[] nums) {
		int len = nums.length;
		int i = 0, j = 0;
		int minLength = Integer.MAX_VALUE;
		int sum = 0;
		while (i < len && j < len) {

			while (sum < s && i < len) {
				sum += nums[i++];
			}

			while (sum >= s && j <= i) {
				minLength = Math.min(minLength, i - j);
				if (minLength == 1) {
					return minLength;
				}
				sum = sum - nums[j++];
			}
		}

		return minLength == Integer.MAX_VALUE ?  0 : minLength;

	}
}

/*
 * ------------------Test Case 1--------------------
Min Size Subarray Length with sum >= 7 is : 2

------------------Test Case 2--------------------
Min Size Subarray Length with sum >= 7 is : 1

------------------Test Case 3--------------------
Min Size Subarray Length with sum >= 6 is : 0

 * */
