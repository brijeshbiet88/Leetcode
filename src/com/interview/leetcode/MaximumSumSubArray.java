package com.interview.leetcode;

public class MaximumSumSubArray {

	public static void main(String[] args) {
		System.out.println("---------------Test Case 1---------------");
		int[] A = { 2, 1, -5, 4, -3, 1, -3, 4, -1 };
		int maxSum = maxSubArray(A);
		System.out.println("Max Sum Sub Array : " + maxSum);
		System.out.println();

		System.out.println("---------------Test Case 2---------------");
		int[] A2 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		maxSum = maxSubArray(A2);
		System.out.println("Max Sum Sub Array : " + maxSum);
		System.out.println();

		System.out.println("---------------Test Case 3---------------");
		int[] A3 = { -2, -3, -1 };
		maxSum = maxSubArray(A3);
		System.out.println("Max Sum Sub Array : " + maxSum);
		System.out.println();

		System.out.println("---------------Test Case 4---------------");
		int[] A4 = { 5, -3, 6 };
		maxSum = maxSubArray(A4);
		System.out.println("Max Sum Sub Array : " + maxSum);
		System.out.println();

		System.out.println("---------------Test Case 5---------------");
		int[] A5 = { 2, 4, 7, -2, -3, 2 };
		maxSum = maxSubArray(A5);
		System.out.println("Max Sum Sub Array : " + maxSum);
		System.out.println();

	}
	
	
	 public static int maxSubArray(int[] nums) {
	        
	        int maxSum = Integer.MIN_VALUE;
	        int maxSoFar = 0;
	        
	        for(int i = 0 ; i < nums.length ; i++) {
	        	
	        	maxSoFar += nums[i];
	        	
	        	maxSum = Math.max(maxSum, maxSoFar);
	        	if(maxSoFar < 0) {
	        		maxSoFar = 0;
	        	}
	        	
	        }
	        
	        return maxSum;
	    
	    }

}

/*
---------------Test Case 1---------------
Max Sum Sub Array : 4

---------------Test Case 2---------------
Max Sum Sub Array : 6

---------------Test Case 3---------------
Max Sum Sub Array : -1

---------------Test Case 4---------------
Max Sum Sub Array : 8

---------------Test Case 5---------------
Max Sum Sub Array : 13
 * */
