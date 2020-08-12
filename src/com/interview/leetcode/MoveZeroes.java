package com.interview.leetcode;

public class MoveZeroes {

	public static void main(String[] args) {
		System.out.println("----------------Test Case 1---------------");
		System.out.println("Original Array");
		int nums [] = {1,2,3,12};
		for(int num : nums)
			System.out.print(num+" ");
		moveZeroes(nums);
		System.out.println("\nArray After Moving 0's");
		for(int num : nums)
			System.out.print(num+" ");
		System.out.println();
		
		System.out.println("----------------Test Case 2---------------");
		System.out.println("Original Array");
		int nums2 [] = {0 , 0 ,  4 , 6 , 8 , 0 , 0 };
		for(int num : nums2)
			System.out.print(num+" ");
		moveZeroes(nums2);
		System.out.println("\nArray After Moving 0's");
		for(int num : nums2)
			System.out.print(num+" ");
		System.out.println();
		
		
		System.out.println("----------------Test Case 3---------------");
		System.out.println("Original Array");
		int nums3 [] = {4,2,4,0,0,3,0,5,1,0};
		for(int num : nums3)
			System.out.print(num+" ");
		moveZeroes(nums3);
		System.out.println("\nArray After Moving 0's");
		for(int num : nums3)
			System.out.print(num+" ");
		System.out.println();
		
		System.out.println("----------------Test Case 4---------------");
		System.out.println("Original Array");
		int nums4 [] = {1 , 0 , 3 , 12 , 0 };
		for(int num : nums4)
			System.out.print(num+" ");
		moveZeroes(nums4);
		System.out.println("\nArray After Moving 0's");
		for(int num : nums4)
			System.out.print(num+" ");
		System.out.println();
		
		
		
		

	}
	
	public static void moveZeroes(int[] nums) {
        if(nums.length == 0) return ;
		int temp = 0;
		int i = 0 , j = 1;
		while(i < nums.length && j < nums.length) {
		while(i < nums.length) {
			if(nums[i] != 0) {
				i++;				
			}else {
				break;
			}
		}
		
		j =  i + 1;
		while(j < nums.length) {
			if(nums[j] == 0) {
				j++;				
			}else {
				break;
			}
		}
		
		if(i < nums.length && j < nums.length) {
			temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j++;
		}
		
		}
    }

}
