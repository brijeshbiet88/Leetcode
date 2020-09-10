package com.interview.leetcode;

public class MinMovesToEqualArrayElements {

	public static void main(String[] args) {
		System.out.println("----------------Test Case 1-------------------");
		int [] nums = {1 , 2 , 3};
		int moves = minMoves(nums);
		System.out.println("Minimum Movess to Make Equal Array : "+moves);
		System.out.println();
		
		System.out.println("----------------Test Case 2-------------------");
		int [] nums2 = {0};
		moves = minMoves(nums2);
		System.out.println("Minimum Movess to Make Equal Array : "+moves);
		System.out.println();
		
		System.out.println("----------------Test Case 3-------------------");
		int [] nums3 = {1 , 2147483647};
		moves = minMoves(nums3);
		System.out.println("Minimum Movess to Make Equal Array : "+moves);
		System.out.println();
		
		System.out.println("----------------Test Case 3-------------------");
		int [] nums4 = {1 , 1 , 2147483647};
		moves = minMoves(nums4);
		System.out.println("Minimum Movess to Make Equal Array : "+moves);
		System.out.println();

	}
	
	public static int minMoves(int[] nums) {
		int sum, smallest, n = nums.length; 
        sum = 0; 
        smallest = nums[0]; 
        for (int i = 0; i < n ; i ++) 
        { 
           if (nums[i] < smallest)             
                smallest = nums[i];             
   
            sum += nums[i]; 
        } 
  
        int moves = sum - n * smallest;
		return moves; 
		
	}

}
